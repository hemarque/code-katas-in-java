import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    public void return1IfInputIs1() {
        assertEquals(1, FizzBuzz.of(1));
    }

}
