import java.util.List;

public class ItemUpdater {

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public void updateQuality(List<Item> items) {
        for (Item item : items) {
            updateOne(item);
        }
    }

    private void updateOne(Item item) {
        if ((!AGED_BRIE.equals(item.getName())) && !BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT.equals(item.getName())) {
            if (item.getQuality() > 0) {
                if (!SULFURAS_HAND_OF_RAGNAROS.equals(item.getName())) {
                    item.setQuality(item.getQuality() - 1);
                }
            }
        } else {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);

                if (BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT.equals(item.getName())) {
                    if (item.getSellIn() < 11) {
                        item.setQuality(item.getQuality() + 1);
                    }if (item.getSellIn() < 6) {
                        item.setQuality(item.getQuality() + 1);
                    }
                }
            }
        }

        if (!SULFURAS_HAND_OF_RAGNAROS.equals(item.getName())) {
            item.setSellIn(item.getSellIn() - 1);
        }

        if (item.getSellIn() < 0) {
            if (!AGED_BRIE.equals(item.getName())) {
                if (!BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT.equals(item.getName())) {
                    if (item.getQuality() > 0) {
                        if (!SULFURAS_HAND_OF_RAGNAROS.equals(item.getName())) {
                            item.setQuality(item.getQuality() - 1);
                        }
                    }
                } else {
                    item.setQuality(item.getQuality() - item.getQuality());
                }
            } else {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);
                }
            }
        }
    }
}
