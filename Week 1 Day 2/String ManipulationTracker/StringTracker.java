public class StringTracker {

    static int count = 0;

    public static String concatenate(String s) {
        String s2 = s.concat("xyz");
        count++;
        return s2;
    }
    public static String toUpperCase(String s) {
        String s2 = s.toUpperCase();
        count++;
        return s2;
    }
    public static String subString(String s) {
        String s2 = s.substring(0, 3);
        count++;
        return s2;
    }
    public static void main(String[] args) {

        String s1 = "abc";
        System.out.println(concatenate(s1));
        System.out.println(toUpperCase(s1));
        System.out.println(subString(s1));

        System.out.println("Original s1 is still " + s1);
        System.out.println(count);



    }
}
