public class User {
    private final String email;
    private final String uuid;
    private final String password;

    public User(String email, String password, String uuid) {
        this.email = email;
        this.password = password;
        this.uuid = uuid;
    }

    public String getId() {
        return this.uuid;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }
}
