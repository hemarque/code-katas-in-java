public class PasswordValidator {
    public void validate(String password) throws Exception {
        passwordHasMoreThan8Characters(password);
        passwordContainsAtLeastOneUnderscore(password);
    }

    private void passwordContainsAtLeastOneUnderscore(String password) throws Exception {
        if (!password.contains("_"))
            throw new PasswordWithoutUnderscoreException();
    }

    private void passwordHasMoreThan8Characters(String password) throws Exception {
        if (password.length() <= 8)
            throw new PasswordWithLessThan9CharactersException();
    }
}

