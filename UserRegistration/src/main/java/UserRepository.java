import java.util.HashMap;
import java.util.UUID;
import java.util.stream.Stream;

public class UserRepository {
    HashMap<String, String> users = new HashMap<String, String>();

    public String save(String email) throws Exception {
        String uuid = UUID.randomUUID().toString();
        users.put(email, uuid);
        return uuid;
    }

    public String findUserByEmail(String email) {
        return users.get(email);
    }

    public Stream<String> findAllUsersByEmail(String email) {
        return users.keySet().stream().filter(e -> e.equals(email));
    }
}
