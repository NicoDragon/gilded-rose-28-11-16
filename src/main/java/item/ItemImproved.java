package item;
import strategy.DefautUpdateStrategy;
import strategy.IUpdateStrategy;

public class ItemImproved extends Item {

	public ItemImproved(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	private IUpdateStrategy strategy=new DefautUpdateStrategy();
	
	public void update(){
		strategy.updateItem(this);
	}
}
