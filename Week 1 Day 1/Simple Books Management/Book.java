// A Simple Library Management Program AURA Day 1

public class Book {
    private String title;
    private String author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void borrowBook(){
        if (availableCopies <= 0)
        { throw new IllegalStateException("Books have been borrowed."); }
        availableCopies--;
    }

    public void returnBook(){
        availableCopies++;
    }
}

