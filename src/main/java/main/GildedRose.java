package main;
import java.util.ArrayList;
import java.util.List;

import item.AgedBrieItem;
import item.BackStageItem;
import item.ItemImproved;
import item.SulfurasItem;


public class GildedRose {

	private static List<ItemImproved> items = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        System.out.println("OMGHAI!");
		
        items = new ArrayList<ItemImproved>();
        items.add(new ItemImproved("+5 Dexterity Vest", 10, 20));
        items.add(new AgedBrieItem("Aged Brie", 2, 0));
        items.add(new ItemImproved("Elixir of the Mongoose", 5, 7));
        items.add(new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new ItemImproved("Conjured Mana Cake", 3, 6));

        new ItemUpdater().updateQuality(items);
}


}
