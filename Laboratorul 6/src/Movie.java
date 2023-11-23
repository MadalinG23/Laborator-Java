import java.util.Comparator;

public class Movie implements Comparable<Movie> {
    private String title;
    private int releasedYear;
    private double rating;
    private String director;

    public Movie(String title, int releasedYear, double rating, String director) {
        this.title = title;
        this.releasedYear = releasedYear;
        this.rating = rating;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int compareTo(Movie otherMovie) {
        return Integer.compare(this.releasedYear, otherMovie.releasedYear);
    }

    public static Comparator<Movie> ratingComparator = Comparator.comparingDouble(Movie::getRating).reversed();

    public static Comparator<Movie> directorComparator = Comparator.comparing(Movie::getDirector);
}