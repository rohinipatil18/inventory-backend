package gilded.rose.inventory.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import gilded.rose.inventory.items.Item;

@Component
public class Inventory {
	private List<Item> items = new ArrayList<Item>();
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public List<Item> getItems() {
		return items;
	}
}
