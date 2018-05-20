import java.util.ArrayList;
import java.util.Iterator;

public class Stock implements Subject {

	private String name;
	private double price;
	private ArrayList<Observer> traderList;

	public Stock(String name, double price) {
		this.name = name;
		this.price = price;
		traderList = new ArrayList<Observer>();
	}

	public void addObserver(Observer trader) {
		traderList.add(trader);
	}

	public void removeObserver(Observer traderRemoved) {
		traderList.remove(traderRemoved);
	}

	public void notifyObservers() {
		Iterator<Observer> iterator = traderList.iterator();
		while(iterator.hasNext())
			iterator.next().update(this);
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getObservers() {
		return traderList.size();
	}
}
