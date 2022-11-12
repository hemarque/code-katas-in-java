public class UserRegistrar {
    private final UserRepository repository;
    private final PasswordValidator validator;
    private final EmailSender sender;

    public UserRegistrar(UserRepository repository, PasswordValidator validator, EmailSender sender) {
        this.repository = repository;
        this.validator = validator;
        this.sender = sender;
    }

    public String register(String email, String password) throws Exception {
        this.validator.validate(password);
        String userId = repository.save(email);
        this.sender.sendConfirmation(email);
        return userId;
    }

    public long countAllUsersByEmail(String email) {
        return repository.findAllUsersByEmail(email).count();
    }
}
