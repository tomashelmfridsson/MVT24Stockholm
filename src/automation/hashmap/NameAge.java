package automation.hashmap;

import java.util.HashMap;

// Skapa en HashMap för att lagra namn och ålder.
// Lägg till några namn och deras motsvarande ålder.
public class NameAge {

    public static void main(String[] args) {
        // Skapa en Hashmap med namn(String) som key och ålder(Integer) som värde
        HashMap<String,Integer> nameAge = new HashMap<>();
        nameAge.put("Kalle",12);
        nameAge.put("Pelle",14);
        nameAge.put("Olle",15);
        System.out.println(nameAge);
        for (String k: nameAge.keySet()) System.out.println(k);
    }



}
