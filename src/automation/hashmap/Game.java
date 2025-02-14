package automation.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pos = "start";
        HashMap<String, String> map = new HashMap<>();
        map.put("start", "Du står på en väg, vill du gå NORR eller SÖDER?");
        map.put("söder", "Du ser en sjö, vill du SIMMA  eller gå RUNT?");
        map.put("norr", "Vägen leder långt norr ut det blir kallt, vill du vända JA eller NEJ");
        map.put("runt", "Det finns flera träd att klättra i, vill du prova, JA eller NEJ");
        map.put("stigen", "Det finns en grotta vill du gå in, JA eller NEJ");
        while (true) {
            System.out.println(map.get(pos));
            String option = scanner.nextLine().toLowerCase();
            switch (pos) {
                case "start":
                    if(option.equals("norr")) pos = "norr";
                    if(option.equals("söder")) pos = "söder";
                    break;
                case "norr":
                    if(option.equals("ja")) pos = "start";
                    if(option.equals("nej")) {
                        System.out.println("Du fryser för mycket och måste avsluta");
                        System.exit(0);
                    }
                    break;
                case "söder":
                    if(option.equals("simma")){
                        System.out.println("Det var längre att simma än du trodde, du sjunker");
                        System.exit(0);
                    }
                    if(option.equals("runt")) pos = "runt";
                    break;
                case "runt":
                    if(option.equals("JA")){
                        System.out.println("Det var högt du får svindel och trillar ner");
                        System.exit(0);
                    }
                    if(option.equals("NEJ")) {
                        System.out.println("Klokt val du går nerför stigen istället");
                        pos = "stigen";
                    }
                    break;
                case "stigen":
                    if(option.equals("JA")){
                        System.out.println("Du hittar Skatten och vinner!!!!!");
                        System.exit(0);
                    }
                    if(option.equals("NEJ")) {
                        System.out.println("Det var läskigt mörkt, du vänder tillbaka till trädet");
                        pos = "runt";
                    }
                    break;
            }
        }

    }
}
