package week3;
import java.util.*;

enum MovieRating {
    G, PG, PG13, R;
}

public class MovieRatingManager {
    public static void addRating(ArrayList<MovieRating> ratings, MovieRating rating) {
        ratings.add(rating);
    }    


    public static void showRatings(ArrayList<MovieRating> ratings) {
        for (MovieRating rating : ratings) {
            System.out.println(rating);
        }
    }

    public static void main(String[] args) {
        ArrayList<MovieRating> myRatings = new ArrayList<>();
        addRating(myRatings, MovieRating.PG);
        showRatings(myRatings);
    }
}