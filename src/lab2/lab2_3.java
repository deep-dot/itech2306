package lab2;

import java.util.Scanner;

public class lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1

				Scanner scanner = new Scanner(System.in);

				int selection = 1;

				int day, week, month;

				String[] dayNames = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

				String[] monthNames = { "invalid", "Jan", "Feb", "March", "April", "May", "June", "July", "August", "Sep",
						"Oct", "Nov", "Dec" };

				int i = 0;

				do {
					do {

						System.out.println("Enter week number between 1 to 5 :");

						week = scanner.nextInt();

						if (week < 1 || week > 5) {
							System.out.print("That is not valid intput");
							i++;
						}
					} while (week < 1 || week > 5);

					do {

						System.out.println("Enter day number between 1 to 7 :");

						day = scanner.nextInt();

						if (day < 1 || day > 7) {
							System.out.print("That is not valid intput");
							i++;
						}
					} while (day < 1 || day > 7);

					do {

						System.out.println("Enter month number between 1 to 12 :");

						month = scanner.nextInt();

						if (month < 1 || month > 12) {
							System.out.print("That is not valid intput");
							i++;
						}
					} while (month < 1 || month > 12);

//					1st Wednesday of October 
//					3rd Saturday of July 

					String date = switch (week) {
					case 1 -> week + "st " + dayNames[day - 1] + " of " + monthNames[month];
					case 2 -> week + "nd " + dayNames[day - 1] + " of " + monthNames[month];
					case 3 -> week + "rd " + dayNames[day - 1] + " of " + monthNames[month];
					case 4 -> week + "th " + dayNames[day - 1] + " of " + monthNames[month];
					case 5 -> week + "th " + dayNames[day - 1] + " of " + monthNames[month];
					default -> "Not a right selection.";
					};
					System.out.println(date);

					System.out.println("enter 0 to exit or press 1 to enter anothe date:");

					selection = scanner.nextInt();

				} while (selection != 0);

				scanner.close();

	}

}
