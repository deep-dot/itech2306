package lab5;
import java.util.ArrayList;

public class ClassDiscussion {
	
	public static void main(String[] args) {
		
	//1
		String name = "";
		
	//2 'history is the given name on the association that is field name of the class 'Student' which represent the group of the objects of the class 'Unit'. Yes, this word will get included in the code file.
		//3 it is uni-directional association that represents, students may have many units history. However, unit class object would not have any kind of infomation that tells about student class object details.
	
		ArrayList<Vegetable> vegetables = new ArrayList<>();
		
		Vegetable v1 = new Vegetable();
		Vegetable v2 = new Vegetable();
		Vegetable v3 = new Vegetable();
		
		vegetables.add(v1);
		vegetables.add(v2);
		vegetables.add(v3);
		
		for(Vegetable v: vagetables) {
			system.out.println(v);
		}
	}
	
}
