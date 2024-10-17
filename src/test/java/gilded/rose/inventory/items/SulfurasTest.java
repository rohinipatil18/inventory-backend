package gilded.rose.inventory.items;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gilded.rose.inventory.items.Sulfuras;

public class SulfurasTest {
	
	@Test
	public void testIfQualityIncreasedBy1WhenSellInDayIncreamentedAndIsPositive() {
		Sulfuras sulfuras = new Sulfuras("Sulfuras", 1, 1);
		sulfuras.updateQualityAfterDays(1);
		assertEquals(1, sulfuras.getQuality());
	}
	
	@Test
	public void testIfQualityDecreasedBy2WhenSellInDayIncreamentedAndIsNegative() {
		Sulfuras sulfuras = new Sulfuras("Sulfuras", -1, 5);
		sulfuras.updateQualityAfterDays(1);
		assertEquals(5, sulfuras.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo0WhenSellInDayIncreamentedAndQualityIsNegative() {
		Sulfuras sulfuras = new Sulfuras("Sulfuras", -1, 0);
		sulfuras.updateQualityAfterDays(1);
		assertEquals(0, sulfuras.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo50WhenSellInDayIncreamentedAndQualityIsGT50() {
		Sulfuras sulfuras = new Sulfuras("Sulfuras", 1, 50);
		sulfuras.updateQualityAfterDays(1);
		assertEquals(50, sulfuras.getQuality());
	}
}
