package gilded.rose.inventory.items;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gilded.rose.inventory.items.InvalidItem;

public class InvalidItemTest {
	
	@Test
	public void testIfQualityIncreasedBy1WhenSellInDayIncreamentedAndIsPositive() {
		InvalidItem invalidItem = new InvalidItem("Invalid Item", 1, 1);
		invalidItem.updateQualityAfterDays(1);
		assertEquals(1, invalidItem.getQuality());
	}
	
	@Test
	public void testIfQualityDecreasedBy2WhenSellInDayIncreamentedAndIsNegative() {
		InvalidItem invalidItem = new InvalidItem("Invalid Item", -1, 5);
		invalidItem.updateQualityAfterDays(1);
		assertEquals(5, invalidItem.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo0WhenSellInDayIncreamentedAndQualityIsNegative() {
		InvalidItem invalidItem = new InvalidItem("Invalid Item", -1, 0);
		invalidItem.updateQualityAfterDays(1);
		assertEquals(0, invalidItem.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo50WhenSellInDayIncreamentedAndQualityIsGT50() {
		InvalidItem invalidItem = new InvalidItem("Invalid Item", 1, 50);
		invalidItem.updateQualityAfterDays(1);
		assertEquals(50, invalidItem.getQuality());
	}
}
