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
    public void returnFizzIfInputIsDivisibleBy3() {
        assertEquals("Fizz", fizzbuzz.of(3));
        assertEquals("Fizz", fizzbuzz.of(6));
        assertEquals("Fizz", fizzbuzz.of(6));
        assertEquals("Fizz", fizzbuzz.of(12));
    }

    @Test
    public void returnBuzzIfInputIsDivisibleBy5() {
        assertEquals("Buzz", fizzbuzz.of(5));
        assertEquals("Buzz", fizzbuzz.of(10));
        assertEquals("Buzz", fizzbuzz.of(20));
    }

    @Test
    public void returnFizzBuzzIfInputIs15(){
        assertEquals("FizzBuzz", fizzbuzz.of(15));
    }

    @Test
    public void returnFizzBuzzIfInputIs30(){
        assertEquals("FizzBuzz", fizzbuzz.of(30));
    }
}
