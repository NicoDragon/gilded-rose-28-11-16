import org.junit.Test;

import item.AgedBrieItem;
import item.BackStageItem;
import item.Item;
import item.ItemImproved;
import item.SulfurasItem;
import main.ItemUpdater;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ItemUpdaterGoldenMaster {

    @Test
    public void runGolderMaster() throws Exception {
        ArrayList<ItemImproved> items = itemsSet();
        ArrayList<ItemImproved> legacyitemsSet = itemsSet();
        ItemUpdater itemUpdater = new ItemUpdater();
        ItemUpdaterLegacy itemUpdaterLegacy = new ItemUpdaterLegacy();

        for (int i = 0; i < 100; i++) {
            itemUpdater.updateQuality(items);
            itemUpdaterLegacy.updateQuality(legacyitemsSet);
            for (int j = 0; j < items.size(); j++) {
                Item item = items.get(j);
                Item legacyItem = legacyitemsSet.get(j);
                assertEquals(item.getName(), legacyItem.getName());
                assertEquals(item.getQuality(), legacyItem.getQuality());
                assertEquals(item.getSellIn(), legacyItem.getSellIn());
            }
        }
    }

    private ArrayList<ItemImproved> itemsSet() {
        ArrayList<ItemImproved> items = new ArrayList<ItemImproved>();
        items.add(new ItemImproved("+5 Dexterity Vest", 10, 20));
        items.add(new AgedBrieItem("Aged Brie", 2, 0));
        items.add(new ItemImproved("Elixir of the Mongoose", 5, 7));
        items.add(new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new BackStageItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new ItemImproved("Conjured Mana Cake", 3, 6));
        
        return items;
    }
}
