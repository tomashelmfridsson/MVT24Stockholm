package automation.hashmap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AlphabetTest {
    @Test
    public void testA(){
        assertEquals('!',Alphabet.convert('A'));
    }
    @Test
    public void testQuestionMark(){
        assertEquals('B',Alphabet.convert('?'));
    }
    @Test
    public void testText(){
        assertEquals("/¤@@{",Alphabet.convertText("Hello"));
    }

    @Test
    public void testSympolMap(){
        assertEquals('A',Alphabet.symbolsMap.get('!'));
    }

}
