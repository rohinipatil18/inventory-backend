package gilded.rose.inventory.model;

import java.io.Serializable;

public class ItemModel implements Serializable {
	private String name;
	private int sellInDays;
	private int quality;
	
	public ItemModel() {
		
	}
	
	public ItemModel(String name, int sellInDays, int quality) {
		this.name = name;
		this.sellInDays = sellInDays;
		this.quality = quality;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSellInDays() {
		return sellInDays;
	}
	public void setSellInDays(int sellInDays) {
		this.sellInDays = sellInDays;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
}
