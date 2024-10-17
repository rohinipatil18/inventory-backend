package gilded.rose.inventory.items;

public class Normal extends Item {
	public Normal(String name, int sellInDays, int quality) {
		super(name, sellInDays, quality);
	}
	
	@Override
	public int calcAndGetQualityIncreamentedBy(int days) {
		int increaseQualityBy = 0;
		if (days >= 0) {
			increaseQualityBy = -1;
		} else if (days < 0) {
			increaseQualityBy = -2;
		}
		return increaseQualityBy;
	}
}
