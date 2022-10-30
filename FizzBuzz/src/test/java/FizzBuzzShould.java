import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    public void returnTheSameNumberIfInputIsNot3() {
        assertEquals("1", FizzBuzz.of(1));
        assertEquals("2", FizzBuzz.of(2));
        assertEquals("4", FizzBuzz.of(4));
    }

    @Test
    public void returnFizzIfInputIs3() {
        assertEquals("Fizz", FizzBuzz.of(3));
    }

}
