package gilded.rose.inventory.items;

public class Sulfuras extends Item {
	public Sulfuras(String name, int sellInDays, int quality) {
		super(name, sellInDays, quality);
	}
	
	@Override
	public int calcAndGetQualityIncreamentedBy(int days) {
		int increaseQualityBy = 0;
		return increaseQualityBy;
	}
	
	@Override
	protected void updateSellInDays(int days) {
		
	}
}
