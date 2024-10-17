package gilded.rose.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gilded.rose.inventory.model.ItemModel;
import gilded.rose.inventory.service.InventoryService;

@RestController
public class InventoryController {
	@Autowired
	public InventoryService service;

	@PostMapping("items/add")
	public void addItems(@RequestBody List<ItemModel> items) {
		service.addItems(items);
	}
	
	@GetMapping("items/update")
	public List<String> updateAndReturnItems(@RequestParam("day") int day) {
		return service.updateItemsQuality(day);
	}
}
