public class Book {
    String title;
    String author;
    public static int bookCount = 0;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }
    public static void bookCount() {
        System.out.println("Book Count: " + bookCount);
    }
}
