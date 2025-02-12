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
    public void pelleAgeNotExist(){
        NameAge nameAge = new NameAge();
        assertEquals(-1,nameAge.getAge("Pelle"));
    }

}
