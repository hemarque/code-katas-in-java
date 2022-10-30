import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    public void returnTheSameNumberIfInputIsNot3() {
        assertEquals("1", FizzBuzz.of(1));
        assertEquals("2", FizzBuzz.of(2));
        assertEquals("4", FizzBuzz.of(4));
        assertEquals("7", FizzBuzz.of(7));
        assertEquals("8", FizzBuzz.of(8));
    }

    @Test
    public void returnFizzIfInputIsDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.of(3));
        assertEquals("Fizz", FizzBuzz.of(6));
        assertEquals("Fizz", FizzBuzz.of(9));
    }


    @Test
    public void returnBuzzIfInputIsDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.of(5));
        assertEquals("Buzz", FizzBuzz.of(10));
    }

    @Test
    public void returnFizzBuzzIfInputIsDivisibleBy3and5() {
        assertEquals("FizzBuzz", FizzBuzz.of(15));
        assertEquals("FizzBuzz", FizzBuzz.of(30));
        assertEquals("FizzBuzz", FizzBuzz.of(45));
    }

}
