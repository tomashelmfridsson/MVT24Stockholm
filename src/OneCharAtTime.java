public class OneCharAtTime {
    // 34.Skapa ett program som har en mening och skriver ut
    // ett tecken i taget tills en * finns.
    public static void main(String[] args) {
        String string = "Bästa klassen ni är så bra* eller hur";
         int i=0;
        while (string.charAt(i) != '*') {
            System.out.print(string.charAt(i));
            i++;
        }
        System.out.println();
        for (int j=0; j < string.length(); j++) {
            if (string.charAt(j) != '*') System.out.print(string.charAt(j));
            else break;
        }
    }
}