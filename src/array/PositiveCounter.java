package array;

// 70.En array med 50 inlästa tal finns.
// Ta reda på och skriv ut hur många tal som är positiva.

import java.util.Arrays;

public class PositiveCounter {
    public static void main(String[] args) {

        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()-0.5) * 2000);
        }
        System.out.println(Arrays.toString(array));

        int positiveCounter = 0;
        for (int j = 0; j < array.length; j += 2) {
            if (array[j] > 0) positiveCounter++;
        }
        System.out.println("Anatal positiva tal är "+positiveCounter);

    }
}
