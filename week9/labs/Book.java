package week9.labs;
import java.util.*;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "book title: " + title + ", author: " + author + ", year: " + year;
    }
}

class Library {
    private HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    private String clean(String input) {
        return input.trim().toLowerCase();
    }

    public void addBook(Book book) {
        books.put(clean(book.getTitle()), book);
    }

    public void removeBook(String title) {
        books.remove(clean(title));
    }

    public Book findByTitleStart(String prefix) {
        String cleanPrefix = clean(prefix);

        for(Map.Entry<String, Book> entry : books.entrySet()) {

            if(entry.getKey().startsWith(cleanPrefix)) {
                
                return entry.getValue();
            }
        }
        return null; // if not found
    }
}

class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        library.addBook(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997));
        library.addBook(new Book("Hamlet", "William Shakespeare", 1603));

        // Search by exact title
        Book exact = library.findByTitleStart("The Hobbit");
        System.out.println("Exact search result: " + exact);

        // Search by partial title
        Book partial = library.findByTitleStart("Ha");
        System.out.println("Partial search result: " + partial);

        // Remove a book
        library.removeBook("Hamlet");
        Book removed = library.findByTitleStart("Hamlet");
        System.out.println("After removal: " + removed);
    }
}
