package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, length, director);
	}
		
	public DigitalVideoDisc(String title) {
		super(title);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
	}

	public String toString() {
	    return getId() + " . DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $";
	}
	public void play() {
		if (this.getLength() > 0) {
	        System.out.println("Playing DVD: " + this.getTitle());
	        System.out.println("DVD length: " + this.getLength() + " minutes");
	    } else {
	        System.out.println("No CD in Disc.");
	    }
	}
	@Override
	public int compareTo(Media other) {
		if (other instanceof DigitalVideoDisc) {
	        DigitalVideoDisc dvd = (DigitalVideoDisc) other;
	        int titleCompare = this.getTitle().compareToIgnoreCase(dvd.getTitle());
	        if (titleCompare != 0) return titleCompare;
	        int lengthCompare = Integer.compare(dvd.getLength(), this.getLength()); 
	        if (lengthCompare != 0) return lengthCompare;
	        return Float.compare(this.getCost(), dvd.getCost());
	    }
	    return super.compareTo(other);
	}


}
