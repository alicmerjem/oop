package revision.tasks.collectionslambdas;
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

    public String getTitle() { return title; }

    @Override
    public String toString() {
        return title + " by " + author + " , year: " + year;
    }
}

class Library {
    private Map<String, Book> collection = new HashMap<>();

    private String clean(String input) {
        return input.trim().toLowerCase();
    }

    public void addBook(Book book) {
        String key = clean(book.getTitle());
        collection.put(key, book);
    }

    public void removeBook(String title) {
        collection.remove(clean(title));
    }

    public Book findByTitle(String prefix) {
        prefix = clean(prefix);

        for(String key : collection.keySet()) {
            if(key.startsWith(prefix)) return collection.get(key);
        }
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("the hobbit", "j.r.r. tolkien", 1937));
        lib.addBook(new Book("1984", "george orwell", 1949));

        Book found = lib.findByTitle("the");
        System.out.println(found);

        lib.removeBook("1984");
    }
}