public class PasswordValidator {
    public static boolean validate(String validPassword) {
        return  hasMoreThan8Characters(validPassword) &&
                hasAtLeast1Uppercase(validPassword) &&
                hasAtLeast1Lowercase(validPassword) &&
                hasAtLeast1Number(validPassword);
    }

    private static boolean hasAtLeast1Number(String validPassword) {
        boolean hasAtLeast1Number = false;
        for(char c : validPassword.toCharArray()){
            if (c >= '0' && c <= '9'){
                hasAtLeast1Number = true;
                break;
            }
        }
        return hasAtLeast1Number;
    }

    private static boolean hasAtLeast1Lowercase(String validPassword) {
        boolean hasAtLeast1Lowercase = false;
        for(char c : validPassword.toCharArray()){
            if (c >= 'a' && c <= 'z'){
                hasAtLeast1Lowercase = true;
                break;
            }
        }
        return hasAtLeast1Lowercase;
    }

    private static boolean hasAtLeast1Uppercase(String validPassword) {
        boolean hasAtLeast1Uppercase = false;
        for(char c : validPassword.toCharArray()){
            if (c >= 'A' && c <= 'Z'){
                hasAtLeast1Uppercase = true;
                break;
            }
        }
        return hasAtLeast1Uppercase;
    }

    private static boolean hasMoreThan8Characters(String validPassword) {
        return validPassword.length() > 8;
    }
}
