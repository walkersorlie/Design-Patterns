
public class EatBreakfast {
	public static void main(String[] args) {
		BreakfastEggs omelette = new SpecificEggTypes("omelette", 3, true);
		BreakfastEggs scrambled = new SpecificEggTypes("scrambled", 2, false);
		BreakfastEggs sunny = new SpecificEggTypes("sunny", 2, false);

		omelette.makeEggs();
		System.out.println();
		scrambled.makeEggs();
		System.out.println();
		sunny.makeEggs();
	}

}
