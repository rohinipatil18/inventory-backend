package gilded.rose.inventory.items;

public class BackstagePasses extends Item {
	public BackstagePasses(String name, int sellInDays, int quality) {
		super(name, sellInDays, quality);
	}
	
	@Override
	public int calcAndGetQualityIncreamentedBy(int days) {
		int increaseQualityBy = 0;
		
		if(days < 0) {
			increaseQualityBy = super.getQuality()*(-1);
		} else if (days <= 5) {
			increaseQualityBy = 3;
		} else if (days <= 10) {
			increaseQualityBy = 2;
		}
		return increaseQualityBy;
	}
}
