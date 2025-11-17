public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Deewan E Ghalib", "Mirza Asadullah Khan Ghalib", 4);
        Book book2 = new Book("Man's Search For Meaning", "Viktor E. FrankL", 3);

        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();

        System.out.println(book1.getAvailableCopies());
    }
}
