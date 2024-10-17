package gilded.rose.inventory.items;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gilded.rose.inventory.items.BackstagePasses;

public class BackstagePassesTest {
	
	@Test
	public void testIfQualityIncreasedBy1WhenSellInDayIncreamentedAndIsPositive() {
		BackstagePasses backstagePasses = new BackstagePasses("Backstage Passes", 9, 2);
		backstagePasses.updateQualityAfterDays(1);
		assertEquals(4, backstagePasses.getQuality());
	}
	
	@Test
	public void testIfQualityIncreasedBy2WhenSellInDayIsLT10() {
		BackstagePasses backstagePasses = new BackstagePasses("Backstage Passes", 10, 10);
		backstagePasses.updateQualityAfterDays(1);
		assertEquals(12, backstagePasses.getQuality());
	}
	
	@Test
	public void testIfQualityIncreasedBy3WhenSellInDayIsLT5() {
		BackstagePasses backstagePasses = new BackstagePasses("Backstage Passes", 5, 10);
		backstagePasses.updateQualityAfterDays(1);
		assertEquals(13, backstagePasses.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo0WhenSellInDayIncreamentedAndQualityIsNegative() {
		BackstagePasses backstagePasses = new BackstagePasses("Backstage Passes", -1, 2);
		backstagePasses.updateQualityAfterDays(1);
		assertEquals(0, backstagePasses.getQuality());
	}
	
	@Test
	public void testIfQualitySetTo50WhenSellInDayIncreamentedAndQualityIsGT50() {
		BackstagePasses backstagePasses = new BackstagePasses("Backstage Passes", 1, 50);
		backstagePasses.updateQualityAfterDays(1);
		assertEquals(50, backstagePasses.getQuality());
	}
}
