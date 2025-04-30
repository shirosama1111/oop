package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private String artist;
	public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
        super(title, category, cost, length, director);
        this.artist = artist;
    }
	public void addTrack(Track track) {
		if (tracks.contains(track)) {
            System.out.println("Track already exists in the list.");
        } else {
            tracks.add(track);
            System.out.println("Track \"" + track.getTitle() + "\" has been added to the CD.");
        }
	}

    public void removeTrack(Track track) {
    	 if (tracks.contains(track)) {
             tracks.remove(track);
         } else {
             System.out.println("Track not found in the list.");
         }
    }
    
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    public void play() {
        if (!tracks.isEmpty()) {
            System.out.println("Playing CD: " + this.getTitle());
            System.out.println("CD length: " + this.getLength());
            for (Track track : tracks) {
                track.play();
            }
        } else {
            System.out.println("No CD in Disc.");
        }
    }

    public String toString() {
        return getId() + " . CD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $";
    }
	public String getArtist() {
		return artist;
	}
	@Override
	public int compareTo(Media other) {
	    if (other instanceof CompactDisc) {
	        CompactDisc cd = (CompactDisc) other;
	        int titleCompare = this.getTitle().compareToIgnoreCase(cd.getTitle());
	        if (titleCompare != 0) return titleCompare;
	        int artistCompare = this.getArtist().compareToIgnoreCase(cd.getArtist());
	        if (artistCompare != 0) return artistCompare;
	        return Float.compare(this.getCost(), cd.getCost());
	    }
	    return super.compareTo(other);
	}

}
