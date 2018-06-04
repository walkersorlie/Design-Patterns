import java.util.Map;
import java.util.HashMap;

public class AssignSeating {
  public static void main (String[] args) {
    Map<String, Integer> seats = new HashMap<String, Integer>();
    seats.put("Mike", 0);
    seats.put("Dave", 0);
    seats.put("Jess", 0);
    seats.put("Amanda", 0);
    seats.put("Graham", 0);
    seats.put("Sam", 0);
    seats.put("Deon", 0);
    seats.put("Jose", 0);
    seats.put("Katarina", 0);
    seats.put("Poppy", 0);
    String[] names = {"Mike", "Dave", "Jess", "Amanda", "Graham", "Sam", "Deon", "Jose", "Katarina", "Poppy"};
    Congruential algorithm = new Congruential(100);

    for (int i = 0; i < names.length; i++) {
      while(seats.get(names[i]) == 0) {
        int newSeat = algorithm.getNext();
        if (!seats.containsValue(newSeat))
          seats.put(names[i], newSeat);
      }
      System.out.println(names[i] + " is assigned seat " + seats.get(names[i]));
    }
  }
}
