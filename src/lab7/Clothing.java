package lab7;

public class Clothing extends Product {

	public Clothing() {
		super("clothing");
	}
	
	@Override
	public void display() {
		System.out.println("this is clothing type.");
	}
	
	@Override
	public double getWeight() {
		return 0.2;
	}
}
