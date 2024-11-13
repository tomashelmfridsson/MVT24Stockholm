package highestnumber;

import java.util.Arrays;

public class HighestNumber {
    public static int numberWithArray(String numbers) {
        String[] numbersStringArray = numbers.split(" ");
        int max = 0;
        for (int i = 0; i < numbersStringArray.length; i++) {
            if (Integer.parseInt(numbersStringArray[i]) > max) {
                max = Integer.parseInt(numbersStringArray[i]);
            }
        }
        return max;
    }

    public static int numberWithoutArray(String numbers) {
        int lastSpace = 0;
        int max =0;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == ' ' || i == numbers.length() - 1) { // need to check end of line
                String numberString = numbers.substring(lastSpace, i+1);
                numberString = numberString.trim();  // trim removes spaces
                lastSpace = i;
                if ( Integer.parseInt(numberString) > max ) max =  Integer.parseInt(numberString);
            }
        }
        return max;

    }
}
