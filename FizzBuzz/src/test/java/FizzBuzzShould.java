import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    public void return1IfInputIs1() {
        assertEquals("1", FizzBuzz.of(1));
    }

    @Test
    public void return2IfInputIs2() {
        assertEquals("2", FizzBuzz.of(2));
    }

    @Test
    public void returnFizzIfInputIs3() {
        assertEquals("Fizz", FizzBuzz.of(3));
    }
}
