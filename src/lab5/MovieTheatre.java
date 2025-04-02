package lab5;

/** A MovieTheatre is a complex containing multiple rooms in which movies are presented. */
public class MovieTheatre {
	// FIELDS to store the data about each movie theatre represented in the program...
	private String location;			// Describes where the theatre is, e.g. shopping centre, some major road, etc.
	private String openHours;			// Describes the opening hours - when people may go to the theatre
	
	// CONSTRUCTOR to create new objects that represent a particular MovieTheatre:
	public MovieTheatre(String location, String openHours, int totalRooms)
	{
		// Because the parameters are named the same as the fields, we must use "this" to refer to the fields and to
		// distinguish them from the parameters, because the parameters are currently "shadowing" (hiding) the fields...
		this.location = location;
		this.openHours = openHours;
		
	}
	
	// Getters for all fields:
	
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
		String description = location + " (opening hours: " + openHours + ")";
		return description;
	}
}
