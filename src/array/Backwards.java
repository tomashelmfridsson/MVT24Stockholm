package array;

import java.util.Arrays;
import java.util.Random;

// 76.En array med 10 inlästa tal finns. Lägg över dessa tal i en annan array så att talen
// kommer i omvänd ordning.

//77.Skapa ett program som läser in 10 heltal till en array
// och sedan skriver ut talen baklänges.
public class Backwards {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(array));

        int[] arrayBackwards = new int[10];
        for (int j = array.length - 1; j >= 0; j--) {
            // System.out.println(array[j]);
            arrayBackwards[array.length-1-j] = array[j];
        }
        System.out.println(Arrays.toString(arrayBackwards));

        // slumpgenerator
        Random random = new Random();
        System.out.println(random.nextInt(0,100));

    }

}
