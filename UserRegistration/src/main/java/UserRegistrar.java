public class UserRegistrar {
    private final UserRepository repository;

    public UserRegistrar(UserRepository repository) {
        this.repository = repository;
    }

    public void register(String email) throws Exception {
        repository.save(email);
    }
}
