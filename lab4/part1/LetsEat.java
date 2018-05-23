public class LetsEat {
	public static void main(String[] args) {
		IceCreamShop dq = new DairyQueen();
		IceCream cone;

		cone = dq.orderCone("Chocolate");
		System.out.println("Enjoy your " + cone.getDescription() + " ice cream, which costs " + cone.cost());

		cone = dq.orderCone("Strawberry");
		System.out.println("Enjoy your " + cone.getDescription() + " ice cream, which costs " + cone.cost());
	}

}
