import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "path/to/your/file.csv";
        String line = "";
        String csvSplitBy = "\t"; // Assuming tabs separate columns

        List<Movie> movies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] movieData = line.split(csvSplitBy);
                String title = movieData[0];
                int releasedYear = Integer.parseInt(movieData[1]);
                double rating = Double.parseDouble(movieData[2]);
                String director = movieData[3];

                Movie movie = new Movie(title, releasedYear, rating, director);
                movies.add(movie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort by Released Year using Comparable
        Collections.sort(movies);

        // Sort by Rating using Comparator
        Collections.sort(movies, Movie.ratingComparator);

        // Sort by Director using Comparator
        Collections.sort(movies, Movie.directorComparator);

        // Print the sorted movies or perform other actions
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " - " + movie.getReleasedYear() + " - " + movie.getRating() + " - " + movie.getDirector());
        }
    }
}