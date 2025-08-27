package week9.tasks;
import java.util.*;

public class Movie implements Comparable<Movie>{
    private String title;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public int compareTo(Movie other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return title + ", " + year;
    }
}

class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", 2010));
        movies.add(new Movie("blablabla", 1999));
        movies.add(new Movie("Avatar", 2009));
        movies.add(new Movie("Interstellar", 2014));
        movies.add(new Movie("Gladiator", 2000));  
        
        // sort first of all
        Collections.sort(movies);
        System.out.println("sorted movies" + movies);

        // search for a movie
        Movie key = new Movie("Interstellar", 0);
        int index = Collections.binarySearch(movies, key);

        if(index >= 0) {
            System.out.println("movie found at index" + movies.get(index));
        } else {
            System.out.println("move was not found in the system");
        }
    }
}