public class UserRegistrar {
    private final UserRepository repository;

    public UserRegistrar(UserRepository repository) {
        this.repository = repository;
    }

    public String register(String email) throws Exception {
        return repository.save(email);
    }
}
