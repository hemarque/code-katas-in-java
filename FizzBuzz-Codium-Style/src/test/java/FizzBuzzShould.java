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
    public void returnFizzBuzzIfInputIsDivisibleBy15() {
        assertEquals("FizzBuzz", fizzbuzz.of(15));
        assertEquals("FizzBuzz", fizzbuzz.of(30));
        assertEquals("FizzBuzz", fizzbuzz.of(45));
    }

    @Test
    public void getFirst100Elements() {
        String expected = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n" +
                "11\nFizz\n13\n14\nFizzBuzz\n16\n17\nFizz\n19\nBuzz\n" +
                "Fizz\n22\n23\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz\n" +
                "31\n32\nFizz\n34\nBuzz\nFizz\n37\n38\nFizz\nBuzz\n" +
                "41\nFizz\n43\n44\nFizzBuzz\n46\n47\nFizz\n49\nBuzz\n" +
                "Fizz\n52\n53\nFizz\nBuzz\n56\nFizz\n58\n59\nFizzBuzz\n" +
                "61\n62\nFizz\n64\nBuzz\nFizz\n67\n68\nFizz\nBuzz\n" +
                "71\nFizz\n73\n74\nFizzBuzz\n76\n77\nFizz\n79\nBuzz\n" +
                "Fizz\n82\n83\nFizz\nBuzz\n86\nFizz\n88\n89\nFizzBuzz\n" +
                "91\n92\nFizz\n94\nBuzz\nFizz\n97\n98\nFizz\nBuzz";
        assertEquals(expected, fizzbuzz.getFirst100Elements());

    }

}
