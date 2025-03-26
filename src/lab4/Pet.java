package lab4;

public class Pet {

	public String type;
	String colour;
	double age;
	double price;
	
	public Pet() {
		type = null;
		colour = null;
		age = 0;
		price = 0;
	}
	
	public Pet(String petType, String petColour) {
		type = petType;
		colour = petColour;
		age = 0;
		price = 100.00;
	}
	
	public Pet(String petType, String petColour, double petAge, double petPrice) {
		type = petType;
		colour = petColour;
		setAge(petAge);
		setPrice(petPrice);
	}
	
	public String getType() {
		return type;
	}
	
//	public void setType(String newType) {
//		type = newType;
//	}
	
	public String getColour() {
		return colour;
	}
	
//	public void setColour(String newColour) {
//		colour = newColour;
//	}
	
	public double getAge() {
		return age;
	}
	
	public void setAge(double newAge) {
		age = newAge;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public String toString() {
	    return type + " [colour: " + colour + ", age= " + age + ", price= " + price + " ]";
	}
}
