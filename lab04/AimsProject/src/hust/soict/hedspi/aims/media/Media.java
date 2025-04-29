package hust.soict.hedspi.aims.media;

import java.util.Comparator;

import hust.soict.hedspi.aims.comparable.comparator.MediaComparatorByCostTitle;
import hust.soict.hedspi.aims.comparable.comparator.MediaComparatorByTitleCost;

public abstract class Media implements Comparable<Media>{
	private int id;
    private String title;
    private String category;
    private double cost;
    private String type;
	private static int nbDigitalVideoDiscs = 0; 
    public Media() {}
    public Media(String title, String category, double cost, String type) {
    	nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.type = type;
    }
    public Media(String title, String type) {
    	nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.type = type;
    }
	public boolean isMatch(String title, String type) {
	    return this.getTitle().toLowerCase().contains(title.toLowerCase());
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public double getCost() {
		return cost;
	}
	public String getType() {
		return type;
	}
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true; // cùng tham chiếu
	    if (o == null || getClass() != o.getClass()) return false;

	    Media media = (Media) o;
	    return this.title != null && this.title.equalsIgnoreCase(media.title);
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
