
public class Trade {
  private Trader trader;
  private Stock stock;

  public Trade(Stock stock, Trader trader) {
    this.trader = trader;
    this.stock = stock;
  }

  public void makeTrade(Trader newTrader, String type) {
    if (type.equals("buy")) {
      newTrader.addStock(stock);
      stock.addObserver(newTrader);
      System.out.println(newTrader.getName() + " bought " + stock.getName() + " for $" + stock.getPrice());
      stock.notifyObservers();
    }
    else if (type.equals("sell")) {
      stock.removeObserver(trader);
      System.out.println(trader.getName() + " sold " + stock.getName() + " for $" + stock.getPrice());
      stock.notifyObservers();
    }
  }
}
