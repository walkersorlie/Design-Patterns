
public abstract class BreakfastEggs {

    final void makeEggs() {
        crackEggs();
        prepareEggs();
        cook();
        if (wantSaltAndPepper()) System.out.println("Adding salt and pepper");
        serve();
    }

    abstract void crackEggs();

    abstract void prepareEggs();

    abstract void cook();

    abstract boolean wantSaltAndPepper();

    abstract void serve();
}
