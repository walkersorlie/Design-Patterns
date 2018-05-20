import java.util.ArrayList;

public class Trader implements Observer {

	private String name;
	private Subject market;
	private ArrayList<Stock> stockList;

	public Trader(String name, Subject market) {
		this.name = name;
		market.addObserver(this);
		stockList = new ArrayList<Stock>();
	}

	public void update(Object update) {
		// Trade trade = (Trade)update;
		Stock stock = (Stock)update;
		System.out.println(stock.getName() + " has been updated. There are " + stock.getObservers() + " observers for this stock");
	}

	public void addStock(Stock stock) {
		stockList.add(stock);
	}

	public String getName() {
		return name;
	}
}
