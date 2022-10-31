import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    FizzBuzz fizzbuzz = new FizzBuzz();
    @Test
    public void returnTheSameNumberIfInputIsNot3() {
        assertEquals("1", fizzbuzz.of(1));
        assertEquals("2", fizzbuzz.of(2));
        assertEquals("4", fizzbuzz.of(4));
    }


    @Test
    public void returnFizzIfInputIs3() {
        assertEquals("Fizz", fizzbuzz.of(3));
    }

    @Test
    public void returnBuzzIfInputIs5() {
        assertEquals("Buzz", fizzbuzz.of(5));
    }

    @Test
    public void returnFizzIfInputIs6() {
        assertEquals("Fizz", fizzbuzz.of(6));
    }
}
