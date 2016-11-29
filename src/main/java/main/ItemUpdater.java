package main;

import java.util.List;

import item.Item;
import item.ItemImproved;

public class ItemUpdater {

	public void updateQuality(List<ItemImproved> items) {
		for (ItemImproved item : items) {
			item.update();
		}
	}

}
