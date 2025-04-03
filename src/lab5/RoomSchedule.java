package lab5;

import java.util.ArrayList;
import java.util.Arrays;

public class RoomSchedule {

	// ArrayList<Movie> scheduledMovies;
	private static final int MAX = 6;
	private Movie[] scheduledMovies;
	private int numberOfScheduledMovies;
	private boolean realMovie = false;

	public RoomSchedule() {
		// scheduledMovies = new ArrayList<Movie>(6);
		scheduledMovies = new Movie[MAX];
		numberOfScheduledMovies = 0;
	}

	public void addMovie(Movie nextMovie) {
		
		if (nextMovie != null && numberOfScheduledMovies < scheduledMovies.length) {
			
			scheduledMovies[numberOfScheduledMovies] = nextMovie;
			System.out.println("add movie is: " +  nextMovie + " , " + Arrays.toString(scheduledMovies));
			numberOfScheduledMovies++;
			realMovie = true;
		} else {
			realMovie = false;
		}
	}

	public Movie getMovie(int index) {
		if (index > 0 && index < scheduledMovies.length) {
			return scheduledMovies[index];
		} else {
			return null;
		}
	}

	public Movie[] getTotalMovies() {
		return scheduledMovies;
	}
}
