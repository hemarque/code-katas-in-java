public class PasswordValidator {
    public static boolean validate(String validPassword) {
        return validPassword.length() > 8;
    }
}
