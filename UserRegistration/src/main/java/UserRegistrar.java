public class UserRegistrar {
    private final UserRepository repository;

    public UserRegistrar(UserRepository repository) {
        this.repository = repository;
    }

    public void register(String s) throws Exception {
        repository.save(s);
    }
}
