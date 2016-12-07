public class ItemImproved {

	private Item item;

	private UpdateStategy updateStrategy;

	public ItemImproved(Item item) {
		this.item = item;
		//la strategy est déterminé à la création. faudrait il la déterminer à chaque update pour gérer les changements dynamiques ?
		creerStrategyEnFonctionTypeItem(item);
	}

	private void creerStrategyEnFonctionTypeItem(Item item2) {
		
        if ("Sulfuras, Hand of Ragnaros".equals(item.getName())) {
            updateStrategy=new SulfurasStrategy();
        }
        else if ("Aged Brie".equals(item.getName())) {
			updateStrategy=new AgedBrieStrategy();
		} else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
			updateStrategy=new BackstageStrategy();
		} else {
			updateStrategy=new DefautStrategy();
		}
	}
	
	public void update(){
		updateStrategy.update(item);
	}
}
