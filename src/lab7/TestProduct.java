package lab7;

public class TestProduct {

	public static void main(String[] args) {

		Product item1 = new Clothing();

		item1.display();

		Product item2 = new Product("food type");

		item2.display();

		Clothing myShirt1 = new Clothing();
		System.out.println("shirt weight is: " + myShirt1.getWeight());
		
		Product myShirt2 = new Clothing();
		System.out.println(myShirt2.getWeight());

	}

}
