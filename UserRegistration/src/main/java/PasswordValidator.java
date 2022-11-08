public class PasswordValidator {
    public void validate(String password) throws Exception {
        passwordHasMoreThan8Characters(password);
    }

    private void passwordHasMoreThan8Characters(String password) throws Exception {
        if (password.length() <= 8)
            throw new Exception("Password should have more than 8 characters");
    }
}

