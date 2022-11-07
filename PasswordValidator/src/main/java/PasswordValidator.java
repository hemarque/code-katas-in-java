public class PasswordValidator {
    public static boolean validate(String validPassword) {
        return hasMoreThan8Characters(validPassword);
    }

    private static boolean hasMoreThan8Characters(String validPassword) {
        return validPassword.length() > 8;
    }
}
