
public class AgedBrieStrategy implements UpdateStategy {

	@Override
	public void update(Item item) {
		item.setSellIn(item.getSellIn() - 1);
        increaseQuality(item);
        if (item.getSellIn() < 0) {
            increaseQuality(item);
        }
        

	}

    private void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

}
