package automation.oop.access.oopEjHuvudklassen;

import automation.oop.access.oopHuvudklassen.HuvudKlassen;

public class OopEExtended extends HuvudKlassen {
    public static void main(String[] args) {
        HuvudKlassen oopA = new HuvudKlassen();
        System.out.println(oopA.aPublic);

        System.out.println(HuvudKlassen.aStaticProtected);
        System.out.println(HuvudKlassen.getaStaticPublic);
    }

    public void access(){
        int a = this.aProtected;
    }
}
