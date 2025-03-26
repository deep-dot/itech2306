package lab3;

import java.util.Scanner;

public class Student {

	private String name;
//	private int studentID;
	Scanner scanner = new Scanner(System.in);

	public Student(String sName, int idNumber) {
		name = sName;
		//studentID = idNumber;
	}

	public String getName() {
		
		System.out.print("Has your name " + name + " is changed? y/n ");
		
		char nameIsChanged = scanner.next().charAt(0);
		
		scanner.nextLine();
		
		if(nameIsChanged == 'y' || nameIsChanged == 'Y') {
			
			System.out.print("Enter new name: ");
			
			String cName = scanner.nextLine().trim();
			
			if(!cName.isEmpty()) {
				
				return cName;
				
			} else {
				
				do {
					System.out.println("Please enter correct name.");
					
					cName = scanner.nextLine().trim();
					
				} while(cName.isEmpty());
				
				return cName;
				
			}
			
		} else {
			
			return name;
			
		}
		
	}
	
	public Integer getStudentID() {
		
		System.out.print("Enter Student id: ");
		
		int studentID = scanner.nextInt();
		
		scanner.close();
		
		return studentID;
	}
	
	public static void main (String[] args) {
		Student Student = new Student("Steven", 4001);
		// Displaying the student's information
        System.out.println("Student Name: " + Student.getName());
        System.out.println("Student ID: " + Student.getStudentID());
	}

}
