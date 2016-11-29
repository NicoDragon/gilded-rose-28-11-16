package item;
import strategy.AgedBrieUpdateStrategy;
import strategy.DefautUpdateStrategy;
import strategy.IUpdateStrategy;

public class AgedBrieItem extends ItemImproved {

	private IUpdateStrategy strategy=new AgedBrieUpdateStrategy();
	@Override
	public void update(){
		strategy.updateItem(this);
	}
	public AgedBrieItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

}
