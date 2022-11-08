public class PasswordValidator {
    public void validate(String password) throws Exception {
        passwordHasMoreThan8Characters(password);
        if (!password.contains("_"))
            throw new Exception("Password should contain at least one underscore");
    }

    private void passwordHasMoreThan8Characters(String password) throws Exception {
        if (password.length() <= 8)
            throw new Exception("Password should have more than 8 characters");
    }
}

