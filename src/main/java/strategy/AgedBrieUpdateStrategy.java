package strategy;
import item.Item;

public class AgedBrieUpdateStrategy extends DefautUpdateStrategy {

	@Override
	public void updateItem(Item item) {
		item.setSellIn(item.getSellIn() - 1);
		increaseQuality(item);
		if (item.getSellIn() < 0) {
			increaseQuality(item);
		}
	}
}
