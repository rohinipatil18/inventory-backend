package gilded.rose.inventory.factory;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

import gilded.rose.inventory.items.AgedBrie;
import gilded.rose.inventory.items.BackstagePasses;
import gilded.rose.inventory.items.Conjured;
import gilded.rose.inventory.items.InvalidItem;
import gilded.rose.inventory.items.Normal;
import gilded.rose.inventory.items.Sulfuras;

public class ItemFactoryTest {

	@Test
	public void testItemFactory() {
		ItemFactory factory = new ItemFactory();
		assertInstanceOf(AgedBrie.class, factory.getItem("Aged Brie", 1, 1));
		assertInstanceOf(BackstagePasses.class, factory.getItem("Backstage Passes", 1, 1));
		assertInstanceOf(Conjured.class, factory.getItem("Conjured", 1, 1));
		assertInstanceOf(InvalidItem.class, factory.getItem("invalid", 1, 1));
		assertInstanceOf(Normal.class, factory.getItem("Normal", 1, 1));
		assertInstanceOf(Sulfuras.class, factory.getItem("Sulfuras", 1, 1));
	}
}
