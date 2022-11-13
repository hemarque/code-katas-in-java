import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderValidatorShould {
    @Test
    public void validateOrderFormat() {
        OrderValidator validator = new OrderValidator();

        assertThrows(BadOrderFormatException.class, () -> validator.validate("::"));
    }
}
