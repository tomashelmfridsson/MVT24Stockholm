public class FirstIsHighest {
    // Skapa ett program där två jämförs och det första talet
    // skrivs ut om det är störst
    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 15;
        if (number1 != number2) {
            boolean firstIsHighest = number1 > number2;
            if (firstIsHighest) {
                System.out.println(number1);
            } else {
                System.out.println("false");
                System.out.println(number2 + " is the largest");
            }

            // Överkurs
            System.out.println((number1 > number2) ? number1 : number2);
            
        }  else System.out.println("Talen är lika");;

    }
}
