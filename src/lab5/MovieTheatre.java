package lab5;
import java.util.ArrayList;
import java.util.Arrays;

/** A MovieTheatre is a complex containing multiple rooms in which movies are presented. */
public class MovieTheatre {
	// FIELDS to store the data about each movie theatre represented in the program...
	private String location;			// Describes where the theatre is, e.g. shopping centre, some major road, etc.
	private String openHours;			// Describes the opening hours - when people may go to the theatre
	private ArrayList<RoomSchedule> scheduleForRoom;
	private int roomCount;
	private int totalRoomsCount;
	
	// CONSTRUCTOR to create new objects that represent a particular MovieTheatre:
	public MovieTheatre(String location, String openHours, int totalRooms)
	{
		// Because the parameters are named the same as the fields, we must use "this" to refer to the fields and to
		// distinguish them from the parameters, because the parameters are currently "shadowing" (hiding) the fields...
		this.location = location;
		this.openHours = openHours;
		scheduleForRoom = new ArrayList<>();
		roomCount = 0;
		totalRoomsCount = totalRooms;
		
		scheduleForRoom = new ArrayList<>();  // create empty list

		// Fill the list with RoomSchedule objects
		for (int i = 1; i <= totalRooms; i++) {
			scheduleForRoom.add(new RoomSchedule(i));
		}
	}
	
	public boolean addMovieToRoomSchedule(int roomNum, Movie movieInRoom) {
		int index = roomNum - 1;

		if (movieInRoom != null && index >= 0 && index < scheduleForRoom.size()) {
			RoomSchedule room = scheduleForRoom.get(index);
			boolean success = room.addMovie(movieInRoom);

			if (success) {
				System.out.println("Movie added successfully to Room " + roomNum + ": " + movieInRoom);
				return true;
			} else {
				System.out.println("Failed to add movie to Room " + roomNum + ": Room already has 6 movies scheduled.");
			}
		} else {
			System.out.println("Invalid room number or movie is null.");
		}
		return false;
	}

	public Movie getMovieFromRoomSchedule(int roomNum, int index) {
		int roomIndex = roomNum - 1; // Convert room number to 0-based index
		
		if (roomIndex >= 0 && roomIndex < scheduleForRoom.size()) {
			RoomSchedule room = scheduleForRoom.get(roomIndex);
			Movie movie = room.getMovie(index);
			if (movie != null) {
				return movie;
			}
		}
		return null; // Either invalid room or no movie at that index
	}
	
	public void addNewRoom() {
	    int newRoomNumber = scheduleForRoom.size() + 1;
	    scheduleForRoom.add(new RoomSchedule(newRoomNumber));
	    totalRoomsCount++;
	    System.out.println("New room (Room " + newRoomNumber + ") added successfully!");
	}

	// Getters for all fields:
	
	public ArrayList<RoomSchedule> getRoomSchedule() {
		return new ArrayList<>(scheduleForRoom);
		//return scheduleForRoom;
	}

	public int getTotalRooms() {
	    return totalRoomsCount;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public String getOpenHours()
	{
		return openHours;
	}
	
	
	// SETTERS, though the Location one is unlikely to ever change, and totalRooms is also unlikely to change.
	
	public void setLocation(String newLocation)
	{
		location = newLocation;
	}
	
	public void setOpenHours(String newHours)
	{
		openHours = newHours;
	}
	
	// A toString method:
	public String toString()
	{
		String description = location + " (opening hours: " + openHours + ")" + ", Total rooms: " + totalRoomsCount;
		return description;
	}
}
