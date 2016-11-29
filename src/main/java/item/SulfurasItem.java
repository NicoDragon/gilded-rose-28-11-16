package item;
import strategy.SulfurasUpdateStrategy;
import strategy.DefautUpdateStrategy;
import strategy.IUpdateStrategy;

public class SulfurasItem extends ItemImproved {

	public SulfurasItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	private IUpdateStrategy strategy = new SulfurasUpdateStrategy();

	@Override
	public void update() {
		strategy.updateItem(this);
	}
}
