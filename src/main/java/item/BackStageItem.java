package item;
import strategy.BackStageUpdateStrategy;
import strategy.DefautUpdateStrategy;
import strategy.IUpdateStrategy;

public class BackStageItem extends ItemImproved {
	public BackStageItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	private IUpdateStrategy strategy=new BackStageUpdateStrategy();
	
	@Override
	public void update(){
		strategy.updateItem(this);
	}
}
