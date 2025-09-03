package revision.finalexam.additionalhashmap;
import java.util.*;

interface Borrowable {
    void borrowBook(String date, String bookTitle);
}

class LibraryMember implements Borrowable {
    private HashMap<String, String> borrowedBooks;

    public LibraryMember() {
        this.borrowedBooks = new HashMap<>();
    }

    @Override
    public void borrowBook(String date, String bookTitle) {
        // if books is already borrowed on that date, append new one
        if (borrowedBooks.containsKey(date)) {
            String existingBooks = borrowedBooks.get(date);
            borrowedBooks.put(date, existingBooks + ", " + bookTitle);
        } else {
            borrowedBooks.put(date, bookTitle);
        }
    }

    public String getBooksBorrowed(String date) {
        return borrowedBooks.getOrDefault(date, "no books borrowed");
    }
}
