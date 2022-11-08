import java.util.UUID;

public class UserRepository {
    public String save(String email) throws Exception {
        return UUID.randomUUID().toString();
    }
}
