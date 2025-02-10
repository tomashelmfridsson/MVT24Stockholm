package automation.arraylist;

import java.util.ArrayList;

// Namn	Värde
//pi		3.1415926535
//e		2.7182818284
//sqrt2	1.4142135623
//phi		1.6180339887
//ln10		2.3025850929
public class MathConstants {
    public static void main(String[] args) {
        ArrayList<Double> constants = new ArrayList<>();
        System.out.println(constants.add(3.1415926535));
        constants.add(Math.E);
        constants.add(0,1.4142135623);
        System.out.println(constants);
        System.out.println(constants.indexOf(1.4142135623));
        constants.remove(constants.size()-2);
        System.out.println(constants);
        System.out.println(constants.contains(Math.E));
        ArrayList<Double> constantsClone = (ArrayList<Double>) constants.clone();
        System.out.println(constantsClone);
        if (constants.equals(constantsClone)) System.out.println("Lika");
        constantsClone.clear();
        System.out.println(constantsClone);
        if (!constants.equals(constantsClone)) System.out.println("Olika");
        if (constantsClone.isEmpty()) System.out.println("Tom");
        constantsClone.add(1.6180339887);
        constantsClone.add(2.3025850929);
        constants.addAll(constantsClone);
        System.out.println(constants);
        System.out.println(constants.get(constants.size()-1));
        constants.remove(2.3025850929);
        System.out.println(constants);
        constants.set(1,Math.PI);
        System.out.println(constants);
        System.out.println(constants.getClass());
    }
}
