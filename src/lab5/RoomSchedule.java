package lab5;
import java.util.Arrays;

public class RoomSchedule {

	private static final int MAX = 6;
	private Movie[] scheduledMovies;
	private int numberOfScheduledMovies;
	private int roomNumber;

	public RoomSchedule(int roomNum) {
		this.roomNumber = roomNum;
		scheduledMovies = new Movie[MAX];
		numberOfScheduledMovies = 0;
	}

	public boolean addMovie(Movie nextMovie) {
		if (nextMovie != null && numberOfScheduledMovies < scheduledMovies.length) {
			scheduledMovies[numberOfScheduledMovies] = nextMovie;
			numberOfScheduledMovies++;
			return true;
		} else {
			// Optionally log failure reason
			return false;
		}
	}


	public Movie getMovie(int index) {
		if (index >= 0 && index < scheduledMovies.length) {
			return scheduledMovies[index];
		} else {
			return null;
		}
	}
	
	public int getNumberOfScheduledMovies() {
	    return numberOfScheduledMovies;
	}

	public Movie[] getAllMovies() {
		return scheduledMovies;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Movies scheduled in this room:\n");
	    for (Movie m : scheduledMovies) {
	        if (m != null) {
	            sb.append(" - ").append(m).append("\n");
	        }
	    }
	    return sb.toString();
	}

}
