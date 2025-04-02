package lab5;

/** A class that represents the key information about a particular Movie being offered by a MovieTheatre for people to watch.
 * @author Shane Moore
 */
public class Movie {
	// FIELDS - where the data about each individual object of type Movie, will be stored:
	private String name;				// Name of the movie
	private double priceAdult;			// How much an adult should pay to watch this movie
	private double priceChild;			// How much a child should pay
	private int duration;				// How long (in minutes) the movie runs for (start to finish)
	
	// CONSTRUCTOR - responsible for establishing the initial state for each object.
	// It takes the parameters and copies them into the fields...
	
	public Movie(String title, double adultCost, double childCost, int totalTime)
	{
		name = title;
		priceAdult = adultCost;
		priceChild = childCost;
		duration = totalTime;
	}
	
	// SETTER METHODS FOR THE PRICES
	
	public void setPriceAdult(double newPrice)
	{
		if (newPrice > 0)				// Check that the proposed new value is sensible.
		{
			priceAdult = newPrice;		// If it was, then we will set that to be the field's new value from now onwards.
		}
	}
	
	public void setPriceChild(double newPrice)
	{
		if (newPrice > 0)				// Check that the proposed new value is sensible.
		{
			priceChild = newPrice;		// If it was, then we will set that to be the field's new value from now onwards.
		}
	}
	
	// GETTER METHODS FOR ALL THE FIELDS:
	
	public String getName()
	{
		return name;
	}
	
	public double getPriceAdult()
	{
		return priceAdult;
	}
	
	public double getPriceChild()
	{
		return priceChild;
	}
	
	public int getDuration()
	{
		return duration;
	}
	
	// A toString method for this class:
	
	public String toString()
	{
		// Create a description of this Movie
		String description = name + "("  + duration + " minutes)";
		
		// Now return the description
		return description;
	}
}
