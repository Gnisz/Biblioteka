package model;

public class Book {

    private static Long idCounter = 0L;

    private Long id;
    private String author;
    private String title;
    private String isbn;

    public Book(String author, String title, String isbn) {
        this.id = idCounter++;
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return  "\nid=: " + id +
                "\nauthor: " + author +
                "\ntitle: " + title +
                "\nisbn: " + isbn;
    }
}
