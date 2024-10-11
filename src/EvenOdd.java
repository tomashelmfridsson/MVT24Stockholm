public class EvenOdd {
    // 13.Skapa ett program som läser in ett tal och skriver ut om det är jämnt.
    // (Använd modulooperatorn)

    public static void main(String[] args) {
        int x = 2; // 0001 = 1 //0010 =2 // 0011 =3 // 1111=15
        if (x % 2 == 0) System.out.println("even");
        if (x % 2 != 0) System.out.println("odd");

        //Överkurs
        if( (x & 1) == 0 ) System.out.println("even");

    }

}
