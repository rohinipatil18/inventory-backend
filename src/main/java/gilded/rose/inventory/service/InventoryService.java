package gilded.rose.inventory.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gilded.rose.inventory.factory.ItemFactory;
import gilded.rose.inventory.items.Item;
import gilded.rose.inventory.model.ItemModel;
import gilded.rose.inventory.repository.Inventory;

@Service
public class InventoryService {
	@Autowired
	ItemFactory factory;
	
	@Autowired
	Inventory inventory;

	public void addItems(List<ItemModel> items) {
		List<Item> itemList = items.stream()
		.map(item -> factory.getItem(item.getName(), item.getSellInDays(), item.getQuality()))
		.collect(Collectors.toList());
		inventory.setItems(itemList);
	}
	
	public List<String> updateItemsQuality(int day) {
		inventory.getItems().forEach(item -> item.updateQualityAfterDays(day));
		return inventory.getItems().stream().map(item -> item.toString()).collect(Collectors.toList());
	}
}
