package lab7;

public class Product {
	
	private String productDescription;
	
	public Product( String productType) {
		
		productDescription = productType;
	}
	
	public void display() {
		System.out.println("Product description is: " + productDescription);
	}
	
	public double getWeight() {
		return 0;
	}
	
}
