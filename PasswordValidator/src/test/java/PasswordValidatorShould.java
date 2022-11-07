import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorShould {
    @Test
    public void returnValidIfPasswordHasMoreThan8Characters() {
        String validPassword = "A23456789";
        boolean isValid = PasswordValidator.validate(validPassword);
        assertTrue(isValid);
    }

    @Test
    public void returnInvalidIfPasswordHas8CharactersOrLess() {
        String invalidPassword = "12345678";
        boolean isValid = PasswordValidator.validate(invalidPassword);
        assertFalse(isValid);
    }

    @Test
    public void returnInvalidIfPasswordHasNoUppercaseLetters() {
        String invalidPassword = "123456789";
        boolean isValid = PasswordValidator.validate(invalidPassword);
        assertFalse(isValid);
    }
}
