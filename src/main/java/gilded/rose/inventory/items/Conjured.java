package gilded.rose.inventory.items;

public class Conjured extends Item {
	public Conjured(String name, int sellInDays, int quality) {
		super(name, sellInDays, quality);
	}
	
	@Override
	public int calcAndGetQualityIncreamentedBy(int days) {
		int increaseQualityBy = 0;
		if (days >= 0) {
			increaseQualityBy = -2;
		} else if (days < 0) {
			increaseQualityBy = -4;
		}
		return increaseQualityBy;
	}
}
