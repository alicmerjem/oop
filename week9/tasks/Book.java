package week9.tasks;

import java.util.*;

class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String toString() {
        return title + " (" + pages + " pages)";
    }
}

class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Java Basics", 300),
            new Book("Advanced Java", 450),
            new Book("Algorithms", 200),
            new Book("Data Structures", 350)
        );

        // Sort by number of pages using Comparator + lambda
        books.sort((b1, b2) -> b1.pages - b2.pages);

        // Print the sorted list
        books.forEach(System.out::println);
    }
}
