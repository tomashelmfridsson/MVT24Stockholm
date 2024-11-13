package highestnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HighestNumberTest {
    @Test
    void highestNumberArray() {
        String numbers = "12 88 45 892";
        assertEquals(892, HighestNumber.numberWithArray(numbers));
    }

    @Test
    void highestNumberWithoutArray() {
        String numbers = "12 88 45 892";
        assertEquals(892, HighestNumber.numberWithoutArray(numbers));
    }

}
