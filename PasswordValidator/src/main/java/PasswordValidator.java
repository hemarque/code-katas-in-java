public class PasswordValidator {
    public static boolean validate(String validPassword) {
        boolean hasAtLeast1Uppercase = false;
        for(char c : validPassword.toCharArray()){
            if (c >= 'A' && c <= 'Z'){
                hasAtLeast1Uppercase = true;
                break;
            }
        }
        return hasMoreThan8Characters(validPassword) && hasAtLeast1Uppercase;
    }

    private static boolean hasMoreThan8Characters(String validPassword) {
        return validPassword.length() > 8;
    }
}
