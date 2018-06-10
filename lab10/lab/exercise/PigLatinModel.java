package exercise;


import java.util.ArrayList;
import java.util.Iterator;

public class PigLatinModel implements Model {

    private String toPigLatin;
    private ArrayList<ViewObserver> views;

    public PigLatinModel() {
        toPigLatin = "";
        views = new ArrayList<ViewObserver>();
    }

    public void process(String input) {
        // TODO make pig latin
        toPigLatin = toPigLatin(input);
        notifyViews();
    }

    public void registerView(ViewObserver v) {
        views.add(v);
    }

    public void notifyViews() {
        Iterator itr = views.iterator();

        while (itr.hasNext()) {
            ViewObserver temp = (ViewObserver)itr.next();
            temp.updateView(toPigLatin);
        }
    }

    public void removeView(ViewObserver v) {
        views.remove(views.indexOf(v));
    }

    private String toPigLatin(String input) {
        if (isVowel(input.toLowerCase().charAt(0)))
            return input.concat(("way"));
        else {
            int firstVowel = findFirstVowel(input.toLowerCase());

            if (firstVowel != -1) {
                String appendPortion = input.substring(0, firstVowel);
                String end = input.substring(firstVowel);
                return end.concat(appendPortion).concat("ay");
        }
            else
                return "no vowels. can't convert to pig latin";
        }
    }

    private boolean isVowel(char letter) {
        char vowels [] = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == letter)
                return true;
        }
        return false;
    }

    private int findFirstVowel(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'y')
                return i;
        }
        return -1;
    }
}
