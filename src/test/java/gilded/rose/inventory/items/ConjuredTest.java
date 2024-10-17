package gilded.rose.inventory.items;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gilded.rose.inventory.items.Conjured;

public class ConjuredTest {
	
	@Test
	public void testIfQualityDecreasedBy2WhenSellInDayIncreamentedAndIsPositive() {
		Conjured conjured = new Conjured("Conjured", 1, 5);
		conjured.updateQualityAfterDays(1);
		assertEquals(3, conjured.getQuality());
	}
	
	@Test
	public void testIfQualityDecreasedBy4WhenSellInDayIncreamentedAndIsNegative() {
		Conjured conjured = new Conjured("Conjured", -1, 5);
		conjured.updateQualityAfterDays(1);
		assertEquals(1, conjured.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo0WhenSellInDayIncreamentedAndQualityIsNegative() {
		Conjured conjured = new Conjured("Conjured", -1, 0);
		conjured.updateQualityAfterDays(1);
		assertEquals(0, conjured.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo50WhenSellInDayIncreamentedAndQualityIsGT50() {
		Conjured conjured = new Conjured("Conjured", 1, 60);
		conjured.updateQualityAfterDays(1);
		assertEquals(50, conjured.getQuality());
	}
}
