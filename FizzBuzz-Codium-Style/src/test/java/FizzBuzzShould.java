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
    public void returnFizzIfInputHasA3() {
        assertEquals("Fizz", fizzbuzz.of(34));
        assertEquals("Fizz", fizzbuzz.of(37));
        assertEquals("Fizz", fizzbuzz.of(83));
    }

    @Test
    public void returnBuzzIfInputIsDivisibleBy5() {
        assertEquals("Buzz", fizzbuzz.of(5));
        assertEquals("Buzz", fizzbuzz.of(10));
        assertEquals("Buzz", fizzbuzz.of(20));
    }

    @Test
    public void returnFizzBuzzIfInputIsDivisibleBy15() {
        assertEquals("FizzBuzz", fizzbuzz.of(15));
        assertEquals("FizzBuzz", fizzbuzz.of(30));
        assertEquals("FizzBuzz", fizzbuzz.of(45));
    }

    @Test
    public void getFirst100Elements() {
        String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n" +
                "11\nFizz\nFizz\n14\nFizzBuzz\n16\n17\nFizz\n19\nBuzz\n" +
                "Fizz\n22\nFizz\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz\n" +
                "Fizz\nFizz\nFizz\nFizz\nFizz\nFizz\nFizz\nFizz\nFizz\nBuzz\n" +
                "41\nFizz\nFizz\n44\nFizzBuzz\n46\n47\nFizz\n49\nBuzz\n" +
                "Fizz\n52\nFizz\nFizz\nBuzz\n56\nFizz\n58\n59\nFizzBuzz\n" +
                "61\n62\nFizz\n64\nBuzz\nFizz\n67\n68\nFizz\nBuzz\n" +
                "71\nFizz\nFizz\n74\nFizzBuzz\n76\n77\nFizz\n79\nBuzz\n" +
                "Fizz\n82\nFizz\nFizz\nBuzz\n86\nFizz\n88\n89\nFizzBuzz\n" +
                "91\n92\nFizz\n94\nBuzz\nFizz\n97\n98\nFizz\nBuzz";
        assertEquals(expected, fizzbuzz.getFirst100Elements());

    }

}
