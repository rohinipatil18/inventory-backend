package gilded.rose.inventory.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import gilded.rose.inventory.model.ItemModel;

public class InventoryServiceTest {
	private InventoryService service = new InventoryService();

	@Test
	public void testIfItemsAddedToRepository() {
		List<ItemModel> items = new ArrayList<ItemModel>();
		items.add(new ItemModel("Aged Brie", 1, 1));
		service.addItems(items);
	}
}
