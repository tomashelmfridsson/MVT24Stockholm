package automation.oop.access.oopEjHuvudklassen;

import automation.oop.access.oopHuvudklassen.HuvudKlassen;

public class OopC {
    public static void main(String[] args) {
        HuvudKlassen oopA = new HuvudKlassen();
        System.out.println(oopA.aPublic);
        System.out.println(HuvudKlassen.getaStaticPublic);
    }
}
