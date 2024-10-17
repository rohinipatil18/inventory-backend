package gilded.rose.inventory.items;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AgedBrieTest {
	
	@Test
	public void testIfQualityIncreasedBy1WhenSellInDayIncreamentedAndIsPositive() {
		AgedBrie agedBrie = new AgedBrie("Aged Brie", 1, 1);
		agedBrie.updateQualityAfterDays(1);
		assertEquals(2, agedBrie.getQuality());
	}
	
	@Test
	public void testIfQualityDecreasedBy2WhenSellInDayIncreamentedAndIsNegative() {
		AgedBrie agedBrie = new AgedBrie("Aged Brie", -1, 5);
		agedBrie.updateQualityAfterDays(1);
		assertEquals(3, agedBrie.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo0WhenSellInDayIncreamentedAndQualityIsNegative() {
		AgedBrie agedBrie = new AgedBrie("Aged Brie", -1, 0);
		agedBrie.updateQualityAfterDays(1);
		assertEquals(0, agedBrie.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo50WhenSellInDayIncreamentedAndQualityIsGT50() {
		AgedBrie agedBrie = new AgedBrie("Aged Brie", 1, 50);
		agedBrie.updateQualityAfterDays(1);
		assertEquals(50, agedBrie.getQuality());
	}
}
