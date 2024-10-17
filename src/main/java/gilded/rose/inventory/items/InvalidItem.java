package gilded.rose.inventory.items;

public class InvalidItem extends Item {
	public InvalidItem(String name, int sellInDays, int quality) {
		super(name, sellInDays, quality);
	}
	
	@Override
	public int calcAndGetQualityIncreamentedBy(int days) {
		int increaseQualityBy = 0;
		return increaseQualityBy;
	}
	
	@Override
	public String toString() {
		return "NO SUCH ITEM";
	}
}
