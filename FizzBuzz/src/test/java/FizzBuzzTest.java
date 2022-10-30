import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzbuzzOf1is1() {
        assertEquals(1, FizzBuzz.of(1));
    }

}
