public class PasswordValidator {
    public static boolean validate(String password) {
        return hasMoreThan8Characters(password) &&
                hasAtLeast1Uppercase(password) &&
                hasAtLeast1Lowercase(password) &&
                hasAtLeast1Number(password) &&
                hasUnderscore(password);
    }

    private static boolean hasMoreThan8Characters(String password) {
        return password.length() > 8;
    }

    private static boolean hasAtLeast1Uppercase(String password) {
        return hasAtLeast1CharacterOfThisSet(password, 'A', 'Z');
    }

    private static boolean hasAtLeast1Lowercase(String password) {
        return hasAtLeast1CharacterOfThisSet(password, 'a', 'z');
    }

    private static boolean hasAtLeast1Number(String password) {
        return hasAtLeast1CharacterOfThisSet(password, '0', '9');
    }

    private static boolean hasUnderscore(String password) {
        boolean hasUnderscore = false;
        for (char c : password.toCharArray()) {
            if (c == '_') {
                hasUnderscore = true;
                break;
            }
        }
        return hasUnderscore;
    }

    private static boolean hasAtLeast1CharacterOfThisSet(String password, char charStart, char charEnds) {
        boolean hasAtLeast1Number = false;
        for (char c : password.toCharArray()) {
            if (c >= charStart && c <= charEnds) {
                hasAtLeast1Number = true;
                break;
            }
        }
        return hasAtLeast1Number;
    }

}
