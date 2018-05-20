
public class StockMarket {

	public static void main(String[] args) {

		Stock stock1 = new Stock("MSFT", 50.5);
		Stock stock2 = new Stock("GOOG", 300.3);
		Stock stock3 = new Stock("AAPL", 150.9);

		Trader trader1 = new Trader("trader 1", stock1);
		Trader trader2 = new Trader("trader 2", stock2);
		Trader trader3 = new Trader("trader 3", stock3);

		// stock1.addObserver(trader1);
		// stock1.addObserver(trader3);
		// stock2.addObserver(trader2);
		// stock2.addObserver(trader3);
		// stock3.addObserver(trader1);
		// stock3.addObserver(trader2);

		Trade trade1 = new Trade(stock1, trader1);
		trade1.makeTrade(trader2, "buy");

		Trade trade2 = new Trade(stock2, trader1);
		trade2.makeTrade(trader2, "buy");

		Trade trade3 = new Trade(stock1, trader1);
		trade3.makeTrade(trader1, "sell");

		Trade trade4 = new Trade(stock3, trader2);
		trade4.makeTrade(trader3, "buy");

		Trade trade5 = new Trade(stock3, trader3);
		trade5.makeTrade(trader3, "sell");
	}
}
