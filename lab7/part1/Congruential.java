public class Congruential implements RandomSequence {
  private int max;

  public Congruential(int max) {
    this.max = max;
  }

  public int getNext() {
    java.util.Random randomNumber = new java.util.Random();
    return (int)(max * randomNumber.nextFloat());
  }
}
