package lab1;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("My Java Program Running!");
				
				int a = 5; 
				int b = 8; 
				float f = 8.0f; 
				boolean c = true; 
				boolean d = false; 
				System.out.println("b value is " + b); 
				System.out.println("b/2 value is " + b/2); 
				b++; 
				System.out.println("b value is " + b); 
				System.out.println("b/2 value is " + b/2); 
				System.out.println("b/2 value is " + b/4.0); 
				System.out.println("f value is " + f); 
				System.out.println("f/2 value is " + f/2); 
				f++; 
				System.out.println("f value is " + f); 
				System.out.println("f/2 value is " + f/2);
				
				
				float fillCost = 72.00f;
				float pricePerLitre = 1.80f;
				float litresUsed;
				float kmTravelled = 390f; 
				float kmPerLitre;
				
				litresUsed = fillCost / pricePerLitre;
				kmPerLitre = kmTravelled / litresUsed;
				
				System.out.println("Number of kilometres travelled per litre: " + kmPerLitre);

	}

}
