import java.math.BigInteger;
import java.util.Random;

public class Additive implements RandomSequence {
  private final BigInteger A = new BigInteger(20, new Random(){});
  private final BigInteger M = new BigInteger(20, new Random(){});
  private BigInteger SEED;

  public Additive(int max) {
    SEED = new BigInteger(max, new Random(){});
  }

  public int getNext() {
    SEED = (A.multiply(SEED)).mod(M);
    System.out.println(SEED);
    return SEED.intValue();
  }
}
