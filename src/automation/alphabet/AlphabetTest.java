package automation.alphabet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlphabetTest {
    @Test
    public void testA(){
        assertEquals('A',ConvertAlphabet.fromInteger(1));
    }
    @Test
    public void testZ(){
        assertEquals('Z',ConvertAlphabet.fromInteger(26));
    }

    @Test
    public void test1(){
        assertEquals(1,ConvertAlphabet.fromChar('A'));
    }

    @Test
    public void test26(){
        assertEquals(26,ConvertAlphabet.fromChar('Z'));
    }

    @Test
    public void testNumbers(){
        assertEquals("ABC",ConvertAlphabet.fromIntegersArray(new int[]{1, 2, 3}));
    }

    @Test
    public void testWord(){
        assertArrayEquals(new int[]{8,5,12,12,15,0,23,15,18,12,4},ConvertAlphabet.fromWord("Hello World"));
    }

    @Test
    public void strangeChar(){
        assertEquals(-1,ConvertAlphabet.fromChar('#'));
    }

    @Test
    public void integerOutOfBounds(){
        assertEquals(' ',ConvertAlphabet.fromInteger(100));
    }
}
