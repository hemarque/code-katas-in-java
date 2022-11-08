public class User {
    private final String email;
    private final String uuid;

    public User(String email, String uuid) {
        this.email = email;
        this.uuid = uuid;
    }

    public String getUserId() {
        return this.uuid;
    }
}
