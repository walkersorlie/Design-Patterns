import java.util.*;

public class EnumerationAdapter implements Iterator {
    private Enumeration enumeration;
    Object value;

    public EnumerationAdapter(Enumeration old) {
        enumeration = old;
        value = null;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        value = enumeration.nextElement();
        return value;
    }

    // public void remove() {
    //     enumeration.remove(value);
    // }
}
