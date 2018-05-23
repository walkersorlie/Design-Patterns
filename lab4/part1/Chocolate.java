// a concrete instance of ice cream

public class Chocolate extends IceCream {
 public static final double COST = 1.09;

 public Chocolate() {
  description = "rich chocolate";
 }

 public double cost() {
  return COST;
 }
}
