package lab2;

import java.util.Scanner;

public class lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int numbers[] = new int[10];
				
				Scanner scanner = new Scanner(System.in);
				

				int[] num = new int[10];
				int i;
				
				// 4
				for(i = 0; i < num.length; i++) {
					System.out.print("Enter number " + i + ":");
					
					num[i] = scanner.nextInt();
					
					System.out.println("You entered number: " + num[i]);
				}
				
				
				
				// 5, 6, 7
				//    7, 15, 5, 18, 6, 2, 17, 21, 4, 14 
				i = 0;
//				while(i < num.length) {
//					System.out.print("Enter whileLoopNum number " + i + ":");
//					
//					num[i] = scanner.nextInt();
//					
//					System.out.println("You entered number: " + num[i]);
//					
//					i++;
//				}
//				
		//
//				System.out.print("Enter doWhile number: ");
//				
//				int doWhileNum = scanner.nextInt();
//				
//				System.out.println("Numbers that less than and equal to the entered number " + doWhileNum + " are: ");
//				
//				i = 0;
//				do {
//					if(num[i] <= doWhileNum) {
//						System.out.println(num[i] + "\t ");
//					}
//					i++;
//				} while (i < num.length);
				
				
				
				// 8 and 9
				int largest = num[0];
				
				for(i = 0; i < num.length; i++){
					if(largest > num[i]) {
						largest = num[i];
					}
				}
				
				System.out.println("Largest number out of provided number is: " + largest);
				
				
				//10, 11, 12
				int[] reverse = new int[10];
				
				System.out.print("Original array: ");
				for (i = 0; i < num.length; i++) {
				    System.out.print(num[i] + " ");
				}
				
				System.out.print("\n Reverse of original array is: ");
				
			//	by using for loop
				for(i = num.length - 1; i >= 0; i--) {
					System.out.print(reverse[i] + " ");
				}
				
			// by using while loop
				i = num.length-1;
				while( i >= 0) {
					System.out.print(reverse[i] + " ");
					i--;
				}
				
				scanner.close();

	}

}
