package hust.soict.hedspi.aims.media;

public class Track implements Playable{
	private String title;
	private int length;

	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
	
	public int getLength() {
		return length;
	}

	public String getTitle() {
		return title;
	}
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;

	    Track track = (Track) o;
	    return this.length == track.length &&
	    		(this.title != null ? this.title.equalsIgnoreCase(track.title) : track.title == null);
	}
}
