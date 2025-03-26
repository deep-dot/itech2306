package lab4;

public class lab4_1 {

	public static void main(String[] args) {
		// 2
		int x = 4, y = 7, z = -3;
		
		x = y;
		
		//System.out.println(x + " " +  y  + " "  + z);
		
		// output 7 7 -3
		
		
		// 3
		
		y = z;
		
		//System.out.println(x + " " +  y  + " "  + z);
		
		// 4 , 5
		
		StringBuffer  sb1 = new StringBuffer("Bird");
		StringBuffer  sb2 = new StringBuffer("Frog");
		StringBuffer sb3 = new StringBuffer("Horse");
		
		sb1.append("nest"); // output is  Birdnest Frog Hors
		
		sb2 = sb3; // output Birdnest Horse Horse
		
		sb3.append(" and cart"); //output Birdnest Horse and cart Horse and cart
		
		//sb2 = "Rabbit"; //ype mismatch: cannot convert from String to StringBuff
		
		//System.out.println(sb1 + " " + sb2 + " " + sb3);
		
		
		Pet pet1 = new Pet("Cat", "White");
		Pet pet2 = new Pet("Sausage Dog", "Brown");
		Pet pet3 = new Pet(); // default constructor
		Pet pet4 = new Pet("Rabbit", "Grey");
		Pet pet5 = new Pet("Parrot", "Green");
		
		Pet pet6 = new Pet("Buffallow", "Black", 4.5, 9500.00);

		System.out.println(pet1);
		System.out.println(pet2);
		System.out.println(pet3);
		System.out.println(pet4);
		System.out.println(pet5);
		System.out.println(pet6);
		
		pet1.setPrice(220.00);
		System.out.println(pet1.type + "'s price is: " + pet1.getPrice());
		
		pet2.setAge(9.5);
		System.out.println(pet2.type + "'s age is: " + pet2.getAge());


	}

}
