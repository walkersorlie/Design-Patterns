package exercise;


import java.util.ArrayList;
import java.util.Iterator;

public class FlameModel implements Model {

    private ArrayList<ViewObserver> views;
    private String toFlame;

    public FlameModel() {
        views = new ArrayList<ViewObserver>();
        toFlame = "";
    }

    public void process(String input) {

        toFlame = input.toUpperCase();
        notifyViews();
    }

    public void registerView(ViewObserver v) {
        views.add(v);
    }

    public void notifyViews() {
        Iterator itr = views.iterator();

        while (itr.hasNext()) {
            ViewObserver temp = (ViewObserver)itr.next();
            temp.updateView(toFlame);
        }
    }

    public void removeView(ViewObserver v) {
        views.remove(views.indexOf(v));
    }
}
