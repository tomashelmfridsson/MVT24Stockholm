package automation.oop.access.oopHuvudklassen;

public class HuvudKlassen {
    public int aPublic = 0;
    private int aPrivate = 1;
    int aNothing = 2;
    protected int aProtected = 3;
    // static ärvs inte i objekt utan tillhör klassen
    static int aStaticNothing = 4;
    protected static int aStaticProtected = 5;
    private static int aStaticPrivate =6;
    public static int getaStaticPublic = 7;

    public int getaPrivate() {
        return aPrivate;
    }

}
// Private visas bara i klassen
// Nothing visas i package men ej i subclass.
// Protected visas i subclass och i package
// Public visas överallt i alla package