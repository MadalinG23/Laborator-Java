import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Implementare Runnable
public class Main {
    public static void main(String[] args) {
        String csvFile = "path/to/your/file.csv";
        String csvSplitBy = "\t";

        List<Movie> movies = new ArrayList<>();

        Thread fileReaderThread = new Thread(new CsvFileReaderRunnable(csvFile, csvSplitBy, movies));
        fileReaderThread.start();

        try {
            fileReaderThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Collections.sort(movies);
        Collections.sort(movies, Movie.ratingComparator);
        Collections.sort(movies, Movie.directorComparator);

        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " - " + movie.getReleasedYear() + " - " + movie.getRating() + " - " + movie.getDirector());
        }
    }
}

class CsvFileReaderRunnable implements Runnable {
    private String csvFile;
    private String csvSplitBy;
    private List<Movie> movies;

    public CsvFileReaderRunnable(String csvFile, String csvSplitBy, List<Movie> movies) {
        this.csvFile = csvFile;
        this.csvSplitBy = csvSplitBy;
        this.movies = movies;
    }

    @Override
    public void run() {
        String line;
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
    }
}


//Implementare Thread
public class Main {
    public static void main(String[] args) {
        String csvFile = "path/to/your/file.csv";
        String csvSplitBy = "\t";

        List<Movie> movies = new ArrayList<>();

        CsvFileReaderThread fileReaderThread = new CsvFileReaderThread(csvFile, csvSplitBy, movies);
        fileReaderThread.start();

        try {
            fileReaderThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Collections.sort(movies);
        Collections.sort(movies, Movie.ratingComparator);
        Collections.sort(movies, Movie.directorComparator);

        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " - " + movie.getReleasedYear() + " - " + movie.getRating() + " - " + movie.getDirector());
        }
    }
}

class CsvFileReaderThread extends Thread {
    private String csvFile;
    private String csvSplitBy;
    private List<Movie> movies;

    public CsvFileReaderThread(String csvFile, String csvSplitBy, List<Movie> movies) {
        this.csvFile = csvFile;
        this.csvSplitBy = csvSplitBy;
        this.movies = movies;
    }

    @Override
    public void run() {
        String line;
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
    }
}