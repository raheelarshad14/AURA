public class VidTest {
    public static void main(String[] args) {
        Video v1 = new Video(30, "Dil Kare Tau Kya Kare");
        Video v2 = new Video(10, "Bas Masla Sara Roti");

        User u1 = new User("Raheel");

        u1.watchVideo(v1);
        u1.watchVideo(v1);
        u1.watchVideo(v2);
        u1.watchVideo(v2);
        u1.watchVideo(v2);

        System.out.println("v1 has views:");
        System.out.println(v1.getViews());
        System.out.println("v2 has views:");
        System.out.println(v2.getViews());
    }
}
