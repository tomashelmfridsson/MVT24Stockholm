package automation.arraylist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NamesArrayTest {
    @Test
    public void name(){
        NamesArrayList names = new NamesArrayList();
        names.addName("Pelle");
        assertEquals("Pelle",names.writeNames());
    }

    @Test
    public void names(){
        NamesArrayList names = new NamesArrayList();
        names.addName("Pelle");
        names.addName("Olle");
        names.addName("Ville");
        names.addName("stop");
        assertEquals("Pelle Olle Ville",names.writeNames());
    }

    @Test
    public void replace(){
        NamesArrayList names = new NamesArrayList();
        names.addName("Pelle");
        names.addName("Olle");
        names.addName("Ville");
        names.addName("stop");
        names.replace(0,2);
        assertEquals("Ville Olle Pelle",names.writeNames());
    }
}
