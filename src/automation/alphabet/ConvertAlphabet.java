package automation.alphabet;

public class ConvertAlphabet {
    private static final String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static char fromInteger(int i) {
        try {
            return alphabet.charAt(i);
        } catch (StringIndexOutOfBoundsException e){
            return ' ';
        }
    }

    public static int fromChar(char c){
        for (int i=0; i < alphabet.length(); i++){
            if (alphabet.charAt(i) == c) return i;
        }
        return -1;
    }

    public static String fromIntegersArray(int[] numbersArray) {
        String text = "";
        for (int j : numbersArray) {
            text = text.concat(String.valueOf(fromInteger(j)));
        }
        return text;
    }

    public static int[] fromWord(String words) {
        int[] numberArray = new int[words.length()];
        for (int i = 0; i < words.length(); i++){
            numberArray[i] = fromChar(words.toUpperCase().charAt(i));
        }
        return numberArray;
    }
}
