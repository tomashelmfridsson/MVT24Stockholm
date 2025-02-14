package automation.hangman;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HangmanTest {
    @Test
    public void randomWords(){
        assertFalse(Words.randomWord().isEmpty());
    }

    @Test
    public void letterExist(){
        assertTrue(Guess.letterInput('L'));
    }

    @Test
    public void letterNotExist(){
        assertFalse(Guess.letterInput('Ö'));
        assertEquals(9,Guess.getFailedGuessLeft());
    }
}
