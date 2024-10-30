package array;

// 73.En array med 50 inlästa tal finns. Beräkna och skriv ut
// summan och medelvärdet av de 50 talen.

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {

        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum = sum + array[j];
        }
        System.out.println("Medelvärdet är " + (sum / array.length));

    }
}
