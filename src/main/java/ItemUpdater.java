import java.util.List;

public class ItemUpdater {

    public void updateQuality(List<Item> items) {
        for (Item item : items) {
            updateOne(item);
        }
    }

    private void updateOne(Item item) {
    	//degueu mais permet d'avoir les memes inputs et meme output que notre legacy code
    	new ItemImproved(item).update();
    }

    private void decreaseQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }

    private void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}
