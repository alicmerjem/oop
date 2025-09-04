package revision.tasks.polymorphism;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "some string to be returned. i am way too lazy";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;
        return this.year == other.year && this.title.equals(other.title) && this.author.equals(other.author);
    }
}
