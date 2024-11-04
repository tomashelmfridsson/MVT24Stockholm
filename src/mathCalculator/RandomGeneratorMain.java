package mathCalculator;

import java.util.Arrays;
import java.util.Random;

public class RandomGeneratorMain {
    // Genrera ett slumptal mellan 0 och 99
    // gissa på ett tal och svara om slumptalet är större eller mindre
    // Skriv Grattis när du gissat rätt
    // Skriv enhetstest
    // Skriv slumptalsgeneratorn i separaat klass
    // Gissningslogiken får vara i valfri klass


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

