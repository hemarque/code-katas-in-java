import java.util.HashMap;
import java.util.UUID;
import java.util.stream.Stream;

public class UserRepository {
    HashMap<String, User> users = new HashMap<>();

    public String save(String email, String password) throws Exception {
        String uuid = UUID.randomUUID().toString();
        User user = new User(email, password, uuid);
        users.put(email, user);
        return uuid;
    }

    public User findUserByEmail(String email) {
        return users.get(email);
    }

    public Stream<String> findAllUsersByEmail(String email) {
        return users.keySet().stream().filter(e -> e.equals(email));
    }
}
