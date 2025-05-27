package library;

import java.util.List;

public class Library {
    private List<Book> books;

    @Override
    public String toString() {
        String returnString =
                String.format("""
                                There are %d books in total, of which, %d are rentable.
                                
                                """, books.size(),
                        countRentableBooks()
                );

        return returnString;
    }

    private int countRentableBooks() {
        int count = 0;
        for (Book book : books) {
            if (book.isRentable()) {
                count++;
            }
        }
        return count;
    }
}
