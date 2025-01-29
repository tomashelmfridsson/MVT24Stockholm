package automation.integerarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerArrayTest {
    @Test
    public void testOfAddArray(){
        assertEquals("Heltal 5 tillagt i cell 0",IntegerArray.addArray("5"));
        assertEquals("Heltal 7 tillagt i cell 1",IntegerArray.addArray("7"));
        assertEquals("Det gick inte bra att lägga till fem då det inte är ett heltal, försök igen",
                IntegerArray.addArray("fem"));
        assertEquals("Det gick inte bra att lägga till 3,5 då det inte är ett heltal, försök igen",
                IntegerArray.addArray("3,5"));
        assertEquals("Det gick inte bra att lägga till 3.5 då det inte är ett heltal, försök igen",
                IntegerArray.addArray("3.5"));
        assertEquals("Heltal 8 tillagt i cell 2",IntegerArray.addArray("8"));
        assertEquals("Heltal 9 tillagt i cell 3",IntegerArray.addArray("9"));
        assertEquals("Heltal 10 tillagt i cell 4",IntegerArray.addArray("10"));
        assertEquals("Arrayen är full",IntegerArray.addArray("11"));
    }
}
