import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorShould {
    @Test
    public void returnValidIfPasswordHasMoreThan8Characters(){
        String validPassword = "123456789";
        boolean isValid = PasswordValidator.validate(validPassword);
        assertTrue(isValid);
    }
}
