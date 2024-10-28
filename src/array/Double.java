package array;

public class Double {
    // 68.En array med 50 inlästa tal finns. Fördubbla värdet på talen på varje plats i arrayn.

    public static void main(String[] args) {
        long[] array = new long[50];
        array[0]=1;
       for (int i=1; i < array.length; i++){
           array[i] = array[i-1]*2;
        }
        System.out.println(array[array.length-1]);
    }
}
