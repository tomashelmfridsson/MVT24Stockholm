package automation.hashmap;

import java.util.HashMap;
import java.util.Scanner;

// Skapa en HashMap där varje bokstav är en nyckel till korresponderande symbol i symbols.
// Det kan vara enklare att spara dem som Character och använda metoden charAt för att
// plocka ut bokstäverna
public class Alphabet {
    private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";
    protected static HashMap<Character, Character> symbolsMap = new HashMap<>();

    static {
        for (int i = 0; i < alphabet.length(); i++) {
            symbolsMap.put(alphabet.charAt(i), symbols.charAt(i));
            symbolsMap.put(symbols.charAt(i), alphabet.charAt(i));
        }
    }

    private static void createHashMap() {
        for (int i = 0; i < alphabet.length(); i++) {
            symbolsMap.put(alphabet.charAt(i), symbols.charAt(i));
            symbolsMap.put(symbols.charAt(i), alphabet.charAt(i));
        }
    }

    public static void main(String[] args) {
        createHashMap();
        System.out.println(symbolsMap);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Skriv en mening");
//        String text = scanner.nextLine();
    }

    public static char convert(char c) {
        return symbolsMap.get(c);
    }

    public static String convertText(String text) {
        text= text.toUpperCase();
        String symbols = "";
        for (int i = 0; i < text.length(); i++) {
           symbols=symbols.concat(String.valueOf(symbolsMap.get(text.charAt(i))));
        }
        return symbols;
    }
}
