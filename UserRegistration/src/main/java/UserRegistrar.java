public class UserRegistrar {
    private final UserRepository repository;

    public UserRegistrar(UserRepository repository) {
        this.repository = repository;
    }

    public String register(String email) throws Exception {
        return repository.save(email);
    }

    public User findUserByEmail(String email) {
        return repository.findUserByEmail(email);
    }

    public long countAllUsersByEmail(String email) {
        return repository.findAllUsersByEmail(email).count();
    }
}
