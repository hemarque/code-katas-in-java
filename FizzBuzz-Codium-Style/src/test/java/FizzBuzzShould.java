import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    FizzBuzz fizzbuzz = new FizzBuzz();
    @Test
    public void return1IfInputIs1() {
        assertEquals(1, fizzbuzz.of(1));
    }

    @Test
    public void return2IfInputIs2() {
        assertEquals(2, fizzbuzz.of(2));
    }
}
