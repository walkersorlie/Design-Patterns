// a concrete instance of an ice cream

public class Strawberry extends IceCream {
 public static final double COST = 1.05;

 public Strawberry() {
  description = "fruity strawberry";
 }

 public double cost() {
  return COST;
 }

}
