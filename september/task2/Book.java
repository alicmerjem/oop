package september.task2;
import java.util.*;


enum Genre {
    FICTION, NONFICTION, SCIENCE, HISTORY
}

public class Book {
    private String title;
    private String author;
    private Genre genre;

    public Book(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

class EBook extends Book {
    public EBook(String title, String author, Genre genre) {
        super(title, author, genre);
    }
}

class PrintedBook extends Book {
    public PrintedBook(String title, String author, Genre genre) {
        super(title, author, genre);
    }
}

class Library<T extends Book> {
    private List<T> books;

    public Library(List<T> books) {
        this.books = books;
    } 

    public List<T> getBooks() {
        return books;
    }

    public void setBooks(List<T> books) {
        this.books = books;
    }

    // filter by genre
    public Optional<List<T>> filterByGenre(Genre genre) {
        List<T> result = new ArrayList<>();

        for(T book : books) {
            if(book.getGenre() == genre) {
                result.add(book);
            }
        }

        if(result.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(result);
        }
    }

    // get by title
    public Optional<T> getByTitle(String title) {
        for(T book : books) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}