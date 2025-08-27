package week9.tasks;

public record Record2(String title, String author, int pages) { }

class Main {
    public static void main(String[] args) {
        Record2 book = new Record2("1984", "george orwell", 328);

        System.out.println("title " + book.title());
        System.out.println("author " + book.author());
        System.out.println("pages " + book.pages());
    }
}
