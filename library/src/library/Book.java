package library;

public class Book {
    private int serialNumber;
    private String author;
    private String title;
    private Genre genre;
    private boolean isRentable;

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean isRentable() {
        return isRentable;
    }
}
