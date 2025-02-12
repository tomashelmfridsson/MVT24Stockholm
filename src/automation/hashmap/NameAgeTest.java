package automation.hashmap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NameAgeTest {
    @Test
    public void pelleAge(){
        NameAge nameAge = new NameAge();
        nameAge.addperson("Pelle",14);
        assertEquals(14,nameAge.getAge("Pelle"));
    }

    @Test
    public void pelleAgeRetry(){
        NameAge nameAge = new NameAge();
        nameAge.addperson("Pelle",14);
        nameAge.addperson("Pelle",14);
        assertEquals(14,nameAge.getAge("Pelle"));
    }

    @Test
    public void all14(){
        NameAge nameAge = new NameAge();
        nameAge.addperson("Pelle",14);
        nameAge.addperson("Olle",14);
        nameAge.addperson("Nisse",13);
        //assertEquals("Pelle,Olle",nameAge.getYear(14));
    }

    @Test
    public void pelleAgeNotExist(){
        NameAge nameAge = new NameAge();
        assertEquals(-1,nameAge.getAge("Pelle"));
    }

}
