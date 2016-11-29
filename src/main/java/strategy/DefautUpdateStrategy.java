package strategy;
import item.Item;

public class DefautUpdateStrategy implements IUpdateStrategy {

	public void updateItem(Item item) {
		item.setSellIn(item.getSellIn() - 1);
		decreaseQuality(item);
		if (item.getSellIn() < 0) {
			decreaseQuality(item);
		}
	}

	protected void decreaseQuality(Item item) {
		if (item.getQuality() > 0) {
			item.setQuality(item.getQuality() - 1);
		}
	}

	protected void increaseQuality(Item item) {
		if (item.getQuality() < 50) {
			item.setQuality(item.getQuality() + 1);
		}
	}
}
