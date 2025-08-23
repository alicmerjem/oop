package week6;
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

    @Override
    public String toString() {
        return title + " by " + author + " ( " + year + " ) ";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;
        return year == other.year && title.equals(other.title) && author.equals(other.author);
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 1949);
        Book b2 = new Book("Brave New World", "Aldous Huxley", 1932);
        Book b3 = new Book("1984", "George Orwell", 1949); // same content as b1
        
        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        for(Book b : books) {
            System.out.println(b);
        }
    }
}
