import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void returnTheSameNumberIfInputIsNot3() {
        assertEquals("1", fizzbuzz.of(1));
        assertEquals("2", fizzbuzz.of(2));
        assertEquals("4", fizzbuzz.of(4));
        assertEquals("7", fizzbuzz.of(7));
        assertEquals("8", fizzbuzz.of(8));
    }

    @Test
    public void returnFizzIfInputIsDivisibleBy3() {
        assertEquals("Fizz", fizzbuzz.of(3));
        assertEquals("Fizz", fizzbuzz.of(6));
        assertEquals("Fizz", fizzbuzz.of(9));
    }


    @Test
    public void returnBuzzIfInputIsDivisibleBy5() {
        assertEquals("Buzz", fizzbuzz.of(5));
        assertEquals("Buzz", fizzbuzz.of(10));
    }

    @Test
    public void returnFizzBuzzIfInputIsDivisibleBy3and5() {
        assertEquals("FizzBuzz", fizzbuzz.of(15));
        assertEquals("FizzBuzz", fizzbuzz.of(30));
        assertEquals("FizzBuzz", fizzbuzz.of(45));
    }

    @Test
    public void returnFizzIfItHasA3(){
        assertEquals("Fizz", fizzbuzz.of(13));
        assertEquals("Fizz", fizzbuzz.of(31));
    }

    @Test
    public void returnFizzIfItHasA5(){
        assertEquals("Buzz", fizzbuzz.of(52));
        assertEquals("Buzz", fizzbuzz.of(56));
    }

    @Test
    public void returnFizzBuzzIfItHasA3andA5(){
        assertEquals("FizzBuzz", fizzbuzz.of(53));
    }

    @Test
    public void returnThe100FirstElements() {
        String expected =
                "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\n"
                +"Buzz\n11\nFizz\nFizz\n14\nFizzBuzz\n16\n"
                +"17\nFizz\n19\nBuzz\nFizz\n22\nFizz\nFizz\n"
                +"Buzz\n26\nFizz\n28\n29\nFizzBuzz\nFizz\n"
                +"Fizz\nFizz\nFizz\nFizzBuzz\nFizz\nFizz\nFizz\nFizz\n"
                +"Buzz\n41\nFizz\nFizz\n44\nFizzBuzz\n46\n47\n"
                +"Fizz\n49\nBuzz\nFizz\nBuzz\nFizzBuzz\nFizz\nBuzz\n"
                +"Buzz\nFizz\nBuzz\nBuzz\nFizzBuzz\n61\n62\nFizz\n"
                +"64\nBuzz\nFizz\n67\n68\nFizz\nBuzz\n71\n"
                +"Fizz\nFizz\n74\nFizzBuzz\n76\n77\nFizz\n79\n"
                +"Buzz\nFizz\n82\nFizz\nFizz\nBuzz\n86\nFizz\n"
                +"88\n89\nFizzBuzz\n91\n92\nFizz\n94\nBuzz\n"
                +"Fizz\n97\n98\nFizz\nBuzz\n";

        String response = fizzbuzz.first100Elements();
        assertEquals(expected, response);
    }
}
