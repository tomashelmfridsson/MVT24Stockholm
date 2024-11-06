package randomgame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomGameTest {
    // Genrera ett slumptal mellan 0 och 99
    // gissa på ett tal och svara om slumptalet är större eller mindre
    // Skriv Grattis när du gissat rätt
    // Skriv enhetstest
    // Skriv slumptalsgeneratorn i separat klass
    // Gissningslogiken får vara i valfri klass

    @Test
    void lowerNumber(){
        RandomNumber randomNumber = new RandomNumber();
        int number  = randomNumber.getCorrectNumber()-1;
        assertEquals("För lågt",randomNumber.inputNumber(number));
    }

    @Test
    void higherNumber(){
        RandomNumber randomNumber = new RandomNumber();
        int number  = randomNumber.getCorrectNumber()+1;
        assertEquals("För högt",randomNumber.inputNumber(number));
    }

    @Test
    void correctNumber(){
        RandomNumber randomNumber = new RandomNumber();
        int number  = randomNumber.getCorrectNumber();
        assertEquals("Rätt",randomNumber.inputNumber(number));
    }

}
