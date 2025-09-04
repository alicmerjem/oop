package revision.tasks.inheritance;

// Base LibraryItem class
class LibraryItem {
    private String id;
    private String title;
    private int year;

    // Constructor
    public LibraryItem(String id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to return summary
    public String getSummary() {
        return "[" + id + "] " + title + " (" + year + ")";
    }
}

// Book class
class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(String id, String title, int year, String author, String genre) {
        super(id, title, year);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String getSummary() {
        return super.getSummary() + " - Author: " + author + ", Genre: " + genre;
    }
}

// DVD class
class DVD extends LibraryItem {
    private String director;
    private int duration; // in minutes

    public DVD(String id, String title, int year, String director, int duration) {
        super(id, title, year);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String getSummary() {
        return super.getSummary() + " - Director: " + director + ", Duration: " + duration + " min";
    }
}

// Magazine class
class Magazine extends LibraryItem {
    private int issueNumber;
    private String month;

    public Magazine(String id, String title, int year, int issueNumber, String month) {
        super(id, title, year);
        this.issueNumber = issueNumber;
        this.month = month;
    }

    @Override
    public String getSummary() {
        return super.getSummary() + " - Issue: " + issueNumber + ", Month: " + month;
    }
}
