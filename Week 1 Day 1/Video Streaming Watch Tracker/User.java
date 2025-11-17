public class User {
    public String username;

    public User(String username) {
        this.username = username;
    }

    public void watchVideo(Video v) {
        v.watch();
    }
}
