package revision.tasks.databaseandmethods;
import java.util.*;

enum MovieRating {
    G, PG, PG13, R    
}

class MovieRatingDemo {
    public static void addRating(ArrayList<MovieRating> ratings, MovieRating rating) {
        ratings.add(rating);
    }

    public static void showRatings(ArrayList<MovieRating> ratings) {
        if(ratings.isEmpty()) {
            System.out.println("no ratings stored");
        } else {
            for(MovieRating r : ratings) {
                System.out.println(r);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<MovieRating> ratings = new ArrayList<>();

        addRating(ratings, MovieRating.PG);
    }
}
