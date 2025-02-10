package automation.arraylist;

import java.util.ArrayList;

public class NamesArrayList {
    private ArrayList<String> namesArrayList = new ArrayList<>();

    public boolean addName(String name){
        if ( !name.equals("stop")) {
            namesArrayList.add(name);
            return true;
        } else return false;
    }

    public String writeNames() {
        String names="";
        for (String name : namesArrayList){
            names=names.concat(name).concat(" ");
        }
        return names.trim();
    }

    public void replace(int first, int last) {
        String firstName = namesArrayList.get(first);
        namesArrayList.set(first,namesArrayList.get(last));
        namesArrayList.set(last,firstName);

    }
}
