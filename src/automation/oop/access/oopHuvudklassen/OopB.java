package automation.oop.access.oopHuvudklassen;

public class OopB {
    public static void main(String[] args) {
        HuvudKlassen oopA = new HuvudKlassen();
        System.out.println(oopA.getaPrivate());
        System.out.println(oopA.aNothing);
        System.out.println(oopA.aProtected);
        System.out.println(oopA.aPublic);
        System.out.println(HuvudKlassen.aStaticNothing);
        System.out.println(HuvudKlassen.aStaticProtected);
        System.out.println(HuvudKlassen.getaStaticPublic);
    }
}

