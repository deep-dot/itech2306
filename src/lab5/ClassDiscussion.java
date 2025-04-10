package lab5;
import java.util.ArrayList;

public class ClassDiscussion {
	
	public static void main(String[] args) {
		
	//1
		//String name = "";
		
		ArrayList<Vegetable> vegetables = new ArrayList<>();
		
		Vegetable v1 = new Vegetable("Potato");
		Vegetable v2 = new Vegetable("Carrot");
		Vegetable v3 = new Vegetable("Cauliflower");
		
		vegetables.add(v1);
		vegetables.add(v2);
		vegetables.add(v3);
		
//		for(Vegetable v: vegetables) {
//			System.out.println(v);
//		}
		
		vegetables.forEach(v -> System.out.println(v));
	}
	
}
