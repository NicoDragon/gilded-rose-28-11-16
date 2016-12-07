
public class DefautStrategy implements UpdateStategy{

	@Override
	public void update(Item item) {
		item.setSellIn(item.getSellIn() - 1);
		decreaseQuality(item);
        if (item.getSellIn() < 0) {
        	decreaseQuality(item);
        }		
	}

	private void decreaseQuality(Item item) {
		if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
	}

}
