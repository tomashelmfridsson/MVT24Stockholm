package array;

// 69.En array med 50 inlästa tal finns. Addera talet 2 till talen på indexplats 0, 2, 4,… i
// arrayn.

import java.util.Arrays;

public class Add2 {
    public static void main(String[] args) {

        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int j = 0; j < array.length; j += 2) {
            array[j] = array[j] +2;
        }
        System.out.println(Arrays.toString(array));

    }
}
