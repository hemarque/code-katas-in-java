public class UserRegistrar {
    private final UserRepository repository;
    private final PasswordValidator validator;
    private final EmailSender sender;

    public UserRegistrar(UserRepository repository, PasswordValidator validator, EmailSender sender) {
        this.repository = repository;
        this.validator = validator;
        this.sender = sender;
    }

    public void register(String email, String password) throws Exception {
        validator.validate(password);
        repository.save(email);
        sender.sendConfirmation(email);
    }
}
