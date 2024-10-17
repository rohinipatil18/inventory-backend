package gilded.rose.inventory.factory;

import org.springframework.stereotype.Component;

import gilded.rose.inventory.items.AgedBrie;
import gilded.rose.inventory.items.BackstagePasses;
import gilded.rose.inventory.items.Conjured;
import gilded.rose.inventory.items.InvalidItem;
import gilded.rose.inventory.items.Item;
import gilded.rose.inventory.items.Normal;
import gilded.rose.inventory.items.Sulfuras;

@Component
public class ItemFactory {
	
	public Item getItem(String name, int sellInDays, int quality) {
		Item item;
		switch (name) {
			case "Aged Brie":
				item = new AgedBrie(name, sellInDays, quality);
				break;
			case "Normal":
				item = new Normal(name, sellInDays, quality);
				break;
			case "Sulfuras":
				item = new Sulfuras(name, sellInDays, quality);
				break;
			case "Backstage Passes":
				item = new BackstagePasses(name, sellInDays, quality);
				break;
			case "Conjured":
				item = new Conjured(name, sellInDays, quality);
				break;
			default:
				item = new InvalidItem(name, sellInDays, quality);
				break;
		}
		return item;
	}

}
