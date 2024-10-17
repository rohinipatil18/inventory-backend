package gilded.rose.inventory.items;

abstract public class Item {
	private String name;
	private int sellInDays;
	private int quality;
	
	protected Item(String name, int sellInDays, int quality) {
		this.name = name;
		this.sellInDays = sellInDays;
		this.quality = quality;
	}
	
	abstract protected int calcAndGetQualityIncreamentedBy(int days);
	
	public void updateQualityAfterDays(int days) {
		updateSellInDays(days);
		this.quality += calcAndGetQualityIncreamentedBy(this.sellInDays);
		checkAndUpdateIfQualityisNegative();
		checkAndUpdateIfQualityisGT50();
	}
	
	private void checkAndUpdateIfQualityisNegative () {
		if (this.quality < 0) {
			this.quality = 0;
		}
	}
	
	private void checkAndUpdateIfQualityisGT50 () {
		if (this.quality > 50) {
			this.quality = 50;
		} 
	}
	
	protected void updateSellInDays(int days) {
		this.sellInDays -= days;
	}
	
	public String toString() {
		return this.name + " " + this.sellInDays + " " + this.quality;
	}
	
	protected int getQuality() {
		return this.quality;
	}
}
