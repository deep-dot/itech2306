package lab3;

import java.util.Scanner;

public class lab3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = "Hi, how are you?";
		String str1 = "Hey, i am good, thank you. How about you?";
		// String str3 = "Great! we won the match today.";
		Lab3Main lab3object = new Lab3Main();

//		lab3object.stringProcessing(str);
//		lab3object.stringProcessing(str1);
//		
//		System.out.print("Enter String please: ");
//		str1 = scanner.nextLine();
//		lab3object.stringProcessing(str1);

//		String s1 = "Kuldeep";
//		String s2 = "Ramandeep";
//	
//		lab3object.stringChecking(s1, s2);

		// travel 13.6 kilometres;
		System.out.print("Total distance travelled: ");
		double journeyDistance = scanner.nextDouble();

		boolean lateHours = true;

		double totalFare = lab3object.calculateFare(journeyDistance, lateHours);

		System.out.print("Total taxi fare is: " + totalFare);
	}

	public void stringProcessing(String str) {

		System.out.println(str);
		System.out.println("Length of entered string is: " + str.length());
		System.out.println("To uppercase: " + str.toUpperCase());
		System.out.println("To lowercase: " + str.toLowerCase());
		System.out.println("Original String is: " + str);
		System.out.println(" ");

	}

	public void stringChecking(String s1, String s2) {

		System.out.println(s1);
		System.out.println(s2);

		if (s1.equals(s2)) {
			System.out.println("Strings are equal.");
		} else {
			System.out.println("Strings are not equal.");
		}

		System.out.println('"' + s1 + '"' + " begins with " + '"' + s1.subSequence(0, 3) + '"');
		System.out.println('"' + s2 + '"' + " begins with " + '"' + s2.subSequence(0, 5) + '"');

		System.out.println(
				"Second substring " + '"' + s1.subSequence(3, 7) + '"' + " in " + '"' + s1 + '"' + " found at index 3");
	}

	public double calculateFare(double journeyDistance, boolean lateHours) {

		// base fee of $4.00
		float baseFee = 4f;
		// $5 if the taxi is used during “late hours”
		float lateHourBaseFee = 5f;
		// normal hours the rate is $0.45 (i.e. 45 cents) per kilometre,
		float ratePerKm = 0.45f;
		// “late hours” the rate is $0.61 per kilometre,
		float lateHourRatePerKm = 0.61f;

		if (lateHours) {
			double totalLateHourFare = lateHourBaseFee + (lateHourRatePerKm * journeyDistance);
			return totalLateHourFare;
		} else {
			double totalFare = baseFee + (ratePerKm * journeyDistance);
			return totalFare;
		}
	}
	}

