package lab5;

public class MainProgram {
	public static void main(String[] args) {
		MainProgram theMainProgram = new MainProgram();
		theMainProgram.testing();

		MenuSystem theMenu = new MenuSystem();
		theMenu.runMenu(); // Starts the menu of options, which repeats until selecting quit.
	}

	public void testing() {
		// DECLARE some variables capable of referring to objects of type Movie:
		Movie movieSonic;
		Movie movieBadBoys;
		Movie movieBarbie;
		Movie movieOppen;

		// CONSTRUCT/INSTANTIATE some Movie objects, and assign their reference to the
		// variables just declared above.
		movieSonic = new Movie("Sonic the Hedgehog", 12.50, 8.50, 98);
		movieBadBoys = new Movie("Bad Boys for Life", 17.80, 11.20, 124);
		movieBarbie = new Movie("The Barbie Movie", 16.65, 12.35, 85);
		movieOppen = new Movie("Oppenheimer", 21.65, 16.35, 103);

		// CALLING SOME METHODS on each of the Movie objects:
		System.out.println("First movie is: " + movieSonic.getName()); // Prove that getName method works
		System.out.println(" total running time: " + movieSonic.getDuration() + " minutes"); // Show that getDuration
																								// method works.
		System.out.println(" adult tickets: $" + movieSonic.getPriceAdult()); // Call the getPriceAdult() method to show
																				// it works
		System.out.println(" child tickets: $" + movieSonic.getPriceChild()); // Call the getPriceAdult() method to show
																				// it works

		System.out.println("Second movie is: " + movieBadBoys.getName()); // Prove that getName method works
		System.out.println(" total running time: " + movieBadBoys.getDuration() + " minutes"); // Show that getDuration
																								// method works.
		System.out.println(" adult tickets: $" + movieBadBoys.getPriceAdult()); // Call the getPriceAdult() method to
																				// show it works
		System.out.println(" child tickets: $" + movieBadBoys.getPriceChild()); // Call the getPriceAdult() method to
																				// show it works

		System.out.println("The toString of the first movie is:  " + movieSonic.toString());
		System.out.println("The implicit toString for the second movie is: " + movieBadBoys); // not explicitly calling
																								// it, just giving the
																								// variable
		// Now try to change the prices of tickets for the second movie, by calling the
		// setter methods:
		movieBadBoys.setPriceAdult(55.22);
		movieBadBoys.setPriceChild(22.33);

		// Call the getter methods again. They should display different values than
		// earlier, that should match what the setters were just told to use.
		System.out.println("After modifications, the prices of tickets are:");
		System.out.println(" adult tickets: $" + movieBadBoys.getPriceAdult()); // Call the getPriceAdult() method to
																				// show it works
		System.out.println(" child tickets: $" + movieBadBoys.getPriceChild()); // Call the getPriceAdult() method to
																				// show it works

		// Now try to call the setter methods using values that should be unacceptable,
		// to confirm NO CHANGE IS MADE...
		movieBadBoys.setPriceAdult(-1.11);
		movieBadBoys.setPriceChild(-0.11);
		System.out.println("After second-round modification attempts, the prices of tickets are:");
		System.out.println(" adult tickets: $" + movieBadBoys.getPriceAdult()); // Call the getPriceAdult() method to
																				// show it works
		System.out.println(" child tickets: $" + movieBadBoys.getPriceChild()); // Call the getPriceAdult() method to
																				// show it works

		///////////////////////////////////
		// TESTING of MovieTheatre CLASS //
		///////////////////////////////////

		// DECLARE some variables capable of referring to MovieTheatre objects:
		MovieTheatre village;
		MovieTheatre hoyts;

		// CONSTRUCT/INSTANTIATE some objects, and assign their references to the
		// variables:
		village = new MovieTheatre("Village Cinemas, Melbourne Central", "Mon-Fri 8:00-21:00, Sat-Sun 8:00-23:30", 3);
		hoyts = new MovieTheatre("Hoyts, Rundle Mall Adelaide", "Mon-Thur 8:00-20:00, Fri-Sun 8:00-Midnight", 4);

		// Call some Getter methods:
		System.out.println("First theatre is at: " + village.getLocation());
		System.out.println("  opening hours are: " + village.getOpenHours());
//		System.out.println("  it has " + village.getTotalRooms() + " rooms to show movies in");

		System.out.println("Second is: " + hoyts.toString());
		System.out.println("  opening hours are: " + hoyts.getOpenHours());

		// Call some Setter methods:
		hoyts.setOpenHours("Mon-Sat 9:00-21:00");
		System.out.println("  the updated opening hours are: " + hoyts.getOpenHours());
		System.out.println("---------\n");

		RoomSchedule rs1;
		rs1 = new RoomSchedule();

		rs1.addMovie(movieBarbie);
		rs1.addMovie(movieBadBoys);
		rs1.addMovie(movieSonic);
		rs1.addMovie(movieBarbie);
		rs1.addMovie(null);
		rs1.addMovie(movieBadBoys);
		rs1.addMovie(movieSonic);
		rs1.addMovie(movieSonic);
		
		RoomSchedule rs2;
		rs2 = new RoomSchedule();

		rs2.addMovie(movieSonic);
		rs2.addMovie(movieBarbie);
		rs2.addMovie(movieBadBoys);
		rs2.addMovie(movieSonic);

		System.out.println("first movies is: " + rs1.getMovie(0));
		System.out.println("third movies is: " + rs1.getMovie(2));

		Movie[] movies1 = rs1.getAllMovies();
		Movie[] movies2 = rs2.getAllMovies();
//		System.out.println("all movies are:");
//		for(Movie m:movies) {
//			System.out.println(m);
//		}

		// Task 3
		village.addRoomSchedule(rs1);
		hoyts.addRoomSchedule(rs2);
		
		System.out.println("\n");
		System.out.println("Added RoomSchedule to " + village.getLocation() + ", total added: " + village.getRoomCount());
		System.out.println("Schedule is:");
		for (Movie m : movies1) {
			System.out.println(m);
		}
		
		System.out.println("\n");
		System.out.println("Added RoomSchedule to " + hoyts.getLocation() + ", total added: " + hoyts.getRoomCount());
		System.out.println("Schedule is: ");
		for (Movie m : movies2) {
			System.out.println(m);
		}
		
		System.out.println("\n");
	}

	public void start() {

	}

}
