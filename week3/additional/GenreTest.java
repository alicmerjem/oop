package week3.additional;
import java.util.*;

enum BookGenre {
    FICTION, NONFICTION, SCIFI, FANTASY, HISTORY
}

public class GenreTest {
    public static void addGenre(ArrayList<BookGenre> genres, BookGenre genre) {
        genres.add(genre);
    }

    public static void showGenres(ArrayList<BookGenre> genres) {
        for (BookGenre g : genres) {
            System.out.println(g);
        }
    }

    public static void main(String[] args) {
        ArrayList<BookGenre> list = new ArrayList<>();
        addGenre(list, BookGenre.FICTION);
        addGenre(list, BookGenre.HISTORY);
        addGenre(list, BookGenre.SCIFI);
        showGenres(list);
    }
}