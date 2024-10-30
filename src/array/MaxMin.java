package array;

import java.util.Arrays;

// 74.En array med 50 inlästa tal finns.
// Leta upp det största och det minsta talet i arrayn och
// skriv ut dem.
class MaxMin {
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(array));
        long starttid = System.nanoTime();
        int max = 0;
        int min = 1000;
//        for (int j : array) {
//            if (j > max) max = j;
//            if (j < min) min = j;
//        }
        for (int j=0; j < array.length; j++) {
            if (array[j] > max) max = array[j];
            if (array[j] < min) min = array[j];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(System.nanoTime()-starttid);


        long starttid2 = System.nanoTime();
        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).min());
        System.out.println(System.nanoTime()-starttid2);
    }
}
