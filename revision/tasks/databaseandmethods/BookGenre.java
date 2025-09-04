package revision.tasks.databaseandmethods;
import java.util.*;

enum BookGenre {
    FICTION, NONFICTION, MYSTERY, FANTASY, SCIFI
}

class BookGenreDemo {
    public static void addGenre(ArrayList<BookGenre> genres, BookGenre genre) {
        genres.add(genre);
    }

    public static void showGenres(ArrayList<BookGenre> genres) {
        if(genres.isEmpty()) {
            System.out.println("nothing to be seen here");
        } else {
            System.out.println("stored genres");
            for(BookGenre g : genres) {
                System.out.println(g);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<BookGenre> genres = new ArrayList<>();

        addGenre(genres, BookGenre.SCIFI);
    }
}