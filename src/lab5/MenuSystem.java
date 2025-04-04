package lab5;

import java.util.Scanner;

/**
 * The purpose of this class is to be the main Use Case Handler class of the
 * program.
 */
public class MenuSystem {
	private boolean stillRunning;
	private Scanner scan;

	private MovieTheatre curTheatre; // The "current" MovieTheatre.

	public MenuSystem() {
		scan = new Scanner(System.in); // Create a Scanner for the class to use for inputs

		// Create an initial object to be the "current" movie theatre - it will have 3
		// rooms ...
		curTheatre = new MovieTheatre("Village Cinemas, Melbourne Central", "Mon-Fri 8:00-21:00, Sat-Sun 8:00-23:30",
				3);
	}

	public int selectRoom() {
		// Scanner scan = new Scanner(System.in);
		int roomCount = curTheatre.getTotalRooms();
		int enterRoomNum;

		while (true) {
			System.out.println("Total number of rooms in current theatre are " + roomCount);
			System.out.print("Select room number please: ");
			enterRoomNum = scan.nextInt();

			if (enterRoomNum >= 1 && enterRoomNum <= 3) {
				break;
			} else {
				System.out.println("Invalid input. Please enter a number between 1 and 3.");
			}
		}

		return enterRoomNum;
	}

	public Movie obtainMovieDetails() {
		String title = "";
		double adultCost = -1;
		double childCost = -1;
		int totalTime = -1;

		// Validate title
		while (title.trim().isEmpty()) {
			System.out.print("Enter movie title: ");
			title = scan.nextLine();
			if (title.trim().isEmpty()) {
				System.out.println("❌ Movie title cannot be empty. Please try again.");
			}
		}

		// Validate adult ticket cost
		while (adultCost < 0) {
			System.out.print("Enter adult ticket cost: ");
			if (scan.hasNextDouble()) {
				adultCost = scan.nextDouble();
				if (adultCost < 0) {
					System.out.println("❌ Cost cannot be negative.");
				}
			} else {
				System.out.println("❌ Invalid input. Please enter a valid number.");
				scan.next(); // consume invalid input
			}
		}

		// Validate child ticket cost
		while (childCost < 0) {
			System.out.print("Enter child ticket cost: ");
			if (scan.hasNextDouble()) {
				childCost = scan.nextDouble();
				if (childCost < 0) {
					System.out.println("❌ Cost cannot be negative.");
				}
			} else {
				System.out.println("❌ Invalid input. Please enter a valid number.");
				scan.next(); // consume invalid input
			}
		}

		// Validate duration
		while (totalTime <= 0) {
			System.out.print("Enter total duration of movie (in minutes): ");
			if (scan.hasNextInt()) {
				totalTime = scan.nextInt();
				if (totalTime <= 0) {
					System.out.println("❌ Duration must be greater than zero.");
				}
			} else {
				System.out.println("❌ Invalid input. Please enter a whole number.");
				scan.next(); // consume invalid input
			}
		}

		scan.nextLine(); // consume leftover newline after nextInt

		return new Movie(title, adultCost, childCost, totalTime);
	}

	public void showSchedule() {
		int selectedRoom = selectRoom();

		// Adjust for 0-based indexing
		RoomSchedule room = curTheatre.getRoomSchedule().get(selectedRoom - 1);

		int movieCount = room.getNumberOfScheduledMovies();

		if (movieCount == 0) {
			System.out.println("No movies scheduled in Room " + selectedRoom);
		} else {
			System.out.println("Movies scheduled in Room " + selectedRoom + ":");
			for (int i = 0; i < movieCount; i++) {
				Movie m = room.getMovie(i);
				System.out.println((i + 1) + ". " + m);
			}
		}
	}

	public void addMovieToSchedule() {
		int selectedRoom = selectRoom();

		Movie movie = obtainMovieDetails();

		boolean success = curTheatre.addMovieToRoomSchedule(selectedRoom, movie);

		if (success) {
			System.out.println("Movie added successfully to Room " + selectedRoom + ".");
		} else {
			System.out.println("Failed to add movie. Room may be full or invalid.");
		}
	}

	public void runMenu()
	{
		stillRunning = true;			// The menu will still present itself.
		
		while (stillRunning)
		{
			System.out.println("The following are your options:");
			System.out.println("1. Add a new Room to the Movie Theatre");
			System.out.println("2. Add a movie to a Room's schedule");
			System.out.println("3. Display a Room's current schedule of movies");
			System.out.println("4. Display summary about the Movie Theatre");
			System.out.println("0. Quit");
			System.out.println("What do you want to do next?");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 0:
				stillRunning = false;
				break;
				case 1:
					stillRunning = true;
					curTheatre.addNewRoom(); 
					break;
				case 2:
					stillRunning = true;
					addMovieToSchedule();
					break;
				case 3:
					stillRunning = true;
					showSchedule();
					break;
				case 4:
					stillRunning = true;
					System.out.println(this.curTheatre);
					break;
				default:
					System.out.println("That is Not Implemented Yet");
			}
		}
		
		System.out.println("Finished running the program :)  Goodbye!");
	}

	// More code to be added by students...

}
