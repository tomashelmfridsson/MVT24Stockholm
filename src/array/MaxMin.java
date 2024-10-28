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
        int max =0;
        int min = 1000;
        for (int j : array) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).min());
    }
}
