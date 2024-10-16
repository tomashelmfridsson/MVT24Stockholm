public class BiggerThen {
    // 18.Skapa ett program där värden på variablerna X och Y läses in. Tilldela variabel A
    // värdet 2 om X är större än 5 + Y, annars tilldela A värdet 5. Skriv ut variabeln A.

    public static void main(String[] args) {
        int x = 20;
        int y = 7;
//        int a;
//        if (x > 5 + y) a = 2;
//        else a = 5;
//        System.out.println(a);
        int a = bigger(x,y);
        System.out.println("Värdet på A är: "+a);
    }

    static int bigger(int x, int y){
        if (x > 5 + y) return 2;
        else return 5;
    }

}
