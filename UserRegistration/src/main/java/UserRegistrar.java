public class UserRegistrar {
    private final UserRepository repository;
    private final PasswordValidator validator;

    public UserRegistrar(UserRepository repository, PasswordValidator validator) {
        this.repository = repository;
        this.validator = validator;
    }

    public String register(String email, String password) throws Exception {
        this.validator.validate(password);
        return repository.save(email);
    }

    public User findUserByEmail(String email) {
        return repository.findUserByEmail(email);
    }

    public long countAllUsersByEmail(String email) {
        return repository.findAllUsersByEmail(email).count();
    }
}
