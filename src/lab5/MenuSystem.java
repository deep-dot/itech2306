package lab5;

import java.util.Scanner;

/** The purpose of this class is to be the main Use Case Handler class of the program. */
public class MenuSystem {
	private boolean stillRunning;
	private Scanner scan;
	
	private MovieTheatre curTheatre;		// The "current" MovieTheatre.
	
	public MenuSystem()
	{
		 scan = new Scanner(System.in);			// Create a Scanner for the class to use for inputs
		 
		 // Create an initial object to be the "current" movie theatre - it will have 3 rooms ...
		 curTheatre = new MovieTheatre("Village Cinemas, Melbourne Central", "Mon-Fri 8:00-21:00, Sat-Sun 8:00-23:30",3);
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
				default:
					System.out.println("That is Not Implemented Yet");
			}
		}
		
		System.out.println("Finished running the program :)  Goodbye!");
	}

	// More code to be added by students...
	
}
