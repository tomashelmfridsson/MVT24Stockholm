package automation.hangman;

import java.util.ArrayList;
import java.util.HashMap;

public class Guess {
    private static String word = Words.randomWord();
    private static int failedGuessLeft = 10;
    public static HashMap<Integer, Character> myResult = new HashMap<>();

    static{
        for (int i = 0; i < word.length(); i++) {
            myResult.put(i, ' ');
        }
    }

    public static int getFailedGuessLeft() {
        return failedGuessLeft;
    }

    public static int getWordNbrOfLetters() {
        return word.length();
    }

    public static ArrayList<Integer> indexOfLetter(char c) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                array.add(i);
                myResult.replace(i, c);
            }
        }
        return array;
    }

    public static boolean letterInput(char c) {
        if (word.contains(String.valueOf(c))) {
            return true;
        } else {
            failedGuessLeft--;
            return false;
        }
    }

    public static boolean endOfGame(){
        for (int i:myResult.keySet()){
            if (myResult.get(i)==' ') return false;
        }
        return true;
    }

}
