package strategy;
import item.Item;

public class BackStageUpdateStrategy extends DefautUpdateStrategy {

	@Override
	public void updateItem(Item item) {
		item.setSellIn(item.getSellIn() - 1);
		increaseQuality(item);
		if (item.getSellIn() < 10) {
			increaseQuality(item);
		}
		if (item.getSellIn() < 5) {
			increaseQuality(item);
		}
		if (item.getSellIn() < 0) {
			item.setQuality(0);
		}
	}
}
