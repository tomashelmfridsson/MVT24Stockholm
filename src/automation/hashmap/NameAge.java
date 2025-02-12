package automation.hashmap;

import java.util.HashMap;

public class NameAge {
    private HashMap<String, Integer> nameAgeMap = new HashMap<>();

    public void addperson(String name, int age) {
        nameAgeMap.put(name,age);
    }

    public int getAge(String name) {
        return nameAgeMap.getOrDefault(name,-1);
    }
}
