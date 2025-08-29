package week9.labs;
import java.util.*;

public class Movie {
    private String title;
    private String director;
    private int year;

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }
    
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "title: " + title + ", director: " + director + ", year: " + year; 
    }
}

class MovieCollection {
    private HashMap<String, Movie> movies;

    public MovieCollection() {
        movies = new HashMap<>();
    }

    private String clean(String input) {
        return input.trim().toLowerCase();
    }

    public void addMovie(Movie movie) {
        movies.put(clean(movie.getTitle()), movie);
    }

    public void removeMovie(String title) {
        movies.remove(clean(title));
    }

    public Movie findByTitleStart(String prefix) {
        String cleanPrefix = clean(prefix);

        for(Map.Entry<String, Movie> entry : movies.entrySet()) {
            if(entry.getKey().startsWith(cleanPrefix)) {
                return entry.getValue();
            }
        }
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        MovieCollection collection = new MovieCollection();

        // Add some movies
        collection.addMovie(new Movie("Inception", "Christopher Nolan", 2010));
        collection.addMovie(new Movie("Interstellar", "Christopher Nolan", 2014));
        collection.addMovie(new Movie("The Matrix", "Wachowski Brothers", 1999));

        // Search by exact title
        Movie exact = collection.findByTitleStart("Inception");
        System.out.println("Exact search result: " + exact);

        // Search by partial title
        Movie partial = collection.findByTitleStart("Int");
        System.out.println("Partial search result: " + partial);

        // Remove a movie
        collection.removeMovie("The Matrix");
        Movie removed = collection.findByTitleStart("The Matrix");
        System.out.println("After removal: " + removed);
    }
}