public class Fakultet {
    // Skapa ett program som skriver ut n! (fakulteten). n ska läsas in.
    public static void main(String[] args) {
        int fakultet = 12;
        int produkt = 1;
        for (int i = 1; i <= fakultet ; i++){
            produkt = produkt * i;
            System.out.print(i +" * ");
        }
        System.out.println(" = " + produkt);
    }
}
