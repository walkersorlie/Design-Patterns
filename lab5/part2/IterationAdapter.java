import java.util.*;

public class IterationAdapter {
  private Iterator itr;

  public IterationAdapter(Iterator old) {
    itr = old;
  }

  public boolean hasMoreElements() {
    return itr.hasNext();
  }

  public Object nextElement() {
    return itr.next();
  }

}
