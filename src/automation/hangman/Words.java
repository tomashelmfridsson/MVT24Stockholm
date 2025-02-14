package automation.hangman;

import java.util.ArrayList;

public class Words {
    private static ArrayList<String> words = new ArrayList<>();

    static{
        words.add("YXA");
        words.add("BORTA");
        words.add("HEMMA");
    }

    public static String randomWord(){
        return words.get((int) (Math.random()*words.size()));
    }

}
