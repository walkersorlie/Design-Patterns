
public class SpecificEggTypes extends BreakfastEggs {
    private String eggType;
    private int numOfEggs;
    private boolean sAndP;

    public SpecificEggTypes(String eggType, int numOfEggs, boolean sAndP) {
        this.eggType = eggType;
        this.numOfEggs = numOfEggs;
        this.sAndP = sAndP;
    }

    public void setEggs(int num) {
        numOfEggs = num;
    }

    public void crackEggs() {
        System.out.println("Cracking " + numOfEggs + " eggs");
    }

    public void prepareEggs() {
        switch(eggType) {
            case "omelette":
                System.out.println("Stirring the eggs");
                break;
            case "scrambled":
                System.out.println("Stirring and adding milk to the eggs");
                break;
            case "sunny":
                System.out.println("Never stir sunny side up!");
                break;
        }
    }

    public void cook() {
        switch(eggType) {
            case "omelette":
                System.out.println("Flipping the omelette while cooking");
                break;
            case "scrambled":
                System.out.println("Scrambling the eggs.");
                break;
            case "sunny":
                System.out.println("Cooking the eggs sunny side up.");
                break;
        }
    }

    public boolean wantSaltAndPepper() {
        return sAndP;
    }

    public void serve() {
        System.out.println("Placing the eggs on a plate");
    }
}
