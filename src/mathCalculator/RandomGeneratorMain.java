package mathCalculator;

import java.util.Arrays;
import java.util.Random;

public class RandomGeneratorMain {

                   

    public static void main(String[] args) {

        int[] arrayRandom = new int[10];
        for (int i = 0; i < 100000; i++) {
            int number = (int) (Math.floor(Math.random() * 10));
            // System.out.println(number);
            arrayRandom[number] = arrayRandom[number] + 1;
        }
        System.out.println(Arrays.toString(arrayRandom));


        Random random = new Random();
        arrayRandom = new int[10];
        for (int i = 0; i < 100000; i++) {
            int number = random.nextInt(10);
            arrayRandom[number] = arrayRandom[number] + 1;
        }
        System.out.println(Arrays.toString(arrayRandom));
    }
}

