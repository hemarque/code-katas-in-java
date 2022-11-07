import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorShould {
    @Test
    public void returnValidIfPasswordMatchTheRules() {
        String validPassword = "Ab3456789";
        boolean isValid = PasswordValidator.validate(validPassword);
        assertTrue(isValid);
    }

    @Test
    public void returnInvalidIfPasswordHas8CharactersOrLess() {
        String invalidPassword = "12345678";
        assertInvalidPassword(invalidPassword);
    }

    @Test
    public void returnInvalidIfPasswordHasNoUppercaseLetters() {
        String invalidPassword = "123456789";
        assertInvalidPassword(invalidPassword);
    }

    @Test
    public void returnInvalidIfPasswordHasNoLowercaseLetters() {
        String invalidPassword = "A23456789";
        assertInvalidPassword(invalidPassword);
    }

    @Test
    public void returnInvalidIfPasswordHasNoNumbers() {
        String invalidPassword = "AbCdEfGhI";
        assertInvalidPassword(invalidPassword);
    }

    private void assertInvalidPassword(String invalidPassword) {
        boolean isValid = PasswordValidator.validate(invalidPassword);
        assertFalse(isValid);
    }
}
