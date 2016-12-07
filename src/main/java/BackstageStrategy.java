

public class BackstageStrategy implements UpdateStategy {

	@Override
	public void update(Item item) {
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

    private void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

}
