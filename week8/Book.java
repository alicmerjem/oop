package week8;
import java.util.*;

public abstract class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public abstract void displayInfo();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getInfo() {
        return title + " by " + author + " (" + year + ")";
    }
}

class Novel extends Book implements Comparable<Novel> {
    public Novel(String title, String author, int year) {
        super(title, author, year);
    }

    @Override
    public void displayInfo() {
        System.out.println("Novel: " + getInfo());
    }

    @Override
    public int compareTo(Novel other) {
        return Integer.compare(this.getYear(), other.getYear());
    }
}

class Textbook extends Book implements Comparable<Textbook> {
    public Textbook(String title, String author, int year) {
        super(title, author, year);
    }

    @Override
    public void displayInfo() {
        System.out.println("Textbook: " + getInfo());
    }

    @Override
    public int compareTo(Textbook other) {
        return Integer.compare(this.getYear(), other.getYear());
    }
}

class Shelf<T extends Book & Comparable<T>> {
    private List<T> books = new ArrayList<>();

    public void addBook(T book) {
        books.add(book);
    }

    public void sortBooks() {
        Collections.sort(books);
    }

    public void printBooks() {
        for(T book : books) {
            System.out.println(book);
            book.displayInfo();
        }
    }
}

class MainLibrary {
    public static void main(String[] args) {
        // Shelf for Novels
        Shelf<Novel> novelShelf = new Shelf<>();
        novelShelf.addBook(new Novel("Pride and Prejudice", "Jane Austen", 1813));
        novelShelf.addBook(new Novel("1984", "George Orwell", 1949));
        novelShelf.addBook(new Novel("The Hobbit", "J.R.R. Tolkien", 1937));

        System.out.println("Novels before sorting:");
        novelShelf.printBooks();

        novelShelf.sortBooks();
        System.out.println("\nNovels after sorting by year:");
        novelShelf.printBooks();

        // Shelf for Textbooks
        Shelf<Textbook> textbookShelf = new Shelf<>();
        textbookShelf.addBook(new Textbook("Introduction to Algorithms", "Cormen", 2009));
        textbookShelf.addBook(new Textbook("Operating System Concepts", "Silberschatz", 2018));
        textbookShelf.addBook(new Textbook("Database System Concepts", "Elmasri", 2016));

        System.out.println("\nTextbooks before sorting:");
        textbookShelf.printBooks();

        textbookShelf.sortBooks();
        System.out.println("\nTextbooks after sorting by year:");
        textbookShelf.printBooks();
    }
}