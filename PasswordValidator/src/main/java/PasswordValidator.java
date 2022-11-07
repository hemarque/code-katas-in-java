public class PasswordValidator {
    public static boolean validate(String validPassword) {
        return hasMoreThan8Characters(validPassword) &&
                hasAtLeast1Uppercase(validPassword) &&
                hasAtLeast1Lowercase(validPassword) &&
                hasAtLeast1Number(validPassword);
    }

    private static boolean hasMoreThan8Characters(String validPassword) {
        return validPassword.length() > 8;
    }

    private static boolean hasAtLeast1Uppercase(String validPassword) {
        return hasAtLeast1CharacterOfThisSet(validPassword, 'A', 'Z');
    }

    private static boolean hasAtLeast1Lowercase(String validPassword) {
        return hasAtLeast1CharacterOfThisSet(validPassword, 'a', 'z');
    }

    private static boolean hasAtLeast1Number(String validPassword) {
        return hasAtLeast1CharacterOfThisSet(validPassword, '0', '9');
    }

    private static boolean hasAtLeast1CharacterOfThisSet(String validPassword, char charStart, char charEnds) {
        boolean hasAtLeast1Number = false;
        for (char c : validPassword.toCharArray()) {
            if (c >= charStart && c <= charEnds) {
                hasAtLeast1Number = true;
                break;
            }
        }
        return hasAtLeast1Number;
    }

}
