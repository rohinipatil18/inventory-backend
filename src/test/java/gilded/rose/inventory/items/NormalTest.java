package gilded.rose.inventory.items;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gilded.rose.inventory.items.Normal;

public class NormalTest {
	
	@Test
	public void testIfQualityIncreasedBy1WhenSellInDayIncreamentedAndIsPositive() {
		Normal normal = new Normal("Normal", 2, 2);
		normal.updateQualityAfterDays(1);
		assertEquals(1, normal.getQuality());
	}
	
	@Test
	public void testIfQualityDecreasedBy2WhenSellInDayIncreamentedAndIsNegative() {
		Normal normal = new Normal("Normal", -1, 5);
		normal.updateQualityAfterDays(1);
		assertEquals(3, normal.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo0WhenSellInDayIncreamentedAndQualityIsNegative() {
		Normal normal = new Normal("Normal", -1, 0);
		normal.updateQualityAfterDays(1);
		assertEquals(0, normal.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo50WhenSellInDayIncreamentedAndQualityIsGT50() {
		Normal normal = new Normal("Normal", 1, 55);
		normal.updateQualityAfterDays(1);
		assertEquals(50, normal.getQuality());
	}
}
