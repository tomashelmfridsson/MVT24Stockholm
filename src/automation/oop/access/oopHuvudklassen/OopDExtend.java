package automation.oop.access.oopHuvudklassen;

public class OopDExtend extends HuvudKlassen {
    public static void main(String[] args) {
        HuvudKlassen oopA = new HuvudKlassen();
        System.out.println(oopA.aProtected);
        System.out.println(oopA.aNothing);
        System.out.println(oopA.aPublic);

        // utan Object dvs Static
        System.out.println(HuvudKlassen.getaStaticPublic);
        System.out.println(HuvudKlassen.aStaticNothing);
        System.out.println(HuvudKlassen.aStaticProtected);
    }

    public void acess(){
        int a = this.aNothing;
        int b= this.aProtected;
        int c= this.aPublic;
    }
}
