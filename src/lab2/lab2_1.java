package lab2;

import java.util.Scanner;

public class lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				
				int x = 4, y = 6, z = 8;
				if(y > x && y < z) {
					System.out.println("true");
				} else {
					System.out.println("false");
				}

				
//				int myArray[];
//				
//				myArray = new int[10];
//				
				
//				System.out.print("Enter number: ");
//				
//				int number = scanner.nextInt();
//				
//				System.out.println("You entered number: " + number);
//				
				
				int[] num = new int[2];
				
//				for(int i = 0; i < num.length; i++) {
//					System.out.print("Enter number" + i + ":");
//					
//					num[i] = scanner.nextInt();
//					
//					System.out.println("You entered number: " + num[i]);
//				}
				
				int i = 0;
				while(i < num.length) {
					System.out.print("Enter number" + i + ":");
					
					num[i] = scanner.nextInt();
					
					System.out.println("You entered number: " + num[i]);
					
					i++;
				}
				
				scanner.close();
	}

}
