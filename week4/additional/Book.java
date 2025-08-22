package week4.additional;
import java.util.*;;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // default
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // borrow the book
    public boolean borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true;
        } else {
            return false;
        }
    }

    // return the book 
    public boolean returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "return some string here, i am too lazy to write everything down";
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle());
    }

    // remove a book by title
    public void removeBook(String title) {
        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getTitle().equals(title)) {
                books.remove(i);
                System.out.println("the book was removed from the library");
                return;
            }
        }

        System.out.println("book not found in the library");
    }

    // list all books
    public void listBooks() {
        System.out.println("library books: ");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    // borrow a book
    public void borrowBook(String title) {
        for(Book b : books) {
            if(b.getTitle().equals(title)) {
                if (b.borrowBook()) {
                    System.out.println("the book has been borrowed");
                } else {
                    System.out.println("the book has already been borrowed by someone else");
                }
                return;
            }
        }
        System.out.println("not found in the library");
    }

    // return a book 
    public void returnBook(String title) {
        for (Book b : books) {
            if(b.getTitle().equals(title)) {
                if(b.returnBook()) {
                    System.out.println("returned");
                } else {
                    System.out.println("was never borrowed");
                }
                return;
            }
        }
        System.out.println("not found in the library");
    }
}