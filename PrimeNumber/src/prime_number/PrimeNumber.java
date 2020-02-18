package prime_number;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		// We want to know if a number is a prime number or not
		// We define the local attributes of the class.

		Scanner sc = new Scanner(System.in);
		int ourNumber = 0;
		int option = 0;

		// Menu

		do {
			System.out.println("-------------------");
			System.out.println("0. Exit ");
			System.out.println("1. Check Number");
			System.out.print("Select an option: ");
			option = sc.nextInt();
			System.out.println("-------------------");

			switch (option) {
			case 0:
				System.out.println("See you soon!");
				break;
			case 1:
				System.out.print("Introduce a number: ");
				ourNumber = sc.nextInt();

				// Check if our number is a prime number or not
				// Print the result

				if (ourNumber % 2 != 0 && ourNumber % 3 != 0 && ourNumber % 5 != 0 && ourNumber % 7 != 0
						&& ourNumber % 11 != 0) {
					System.out.println("The number " + ourNumber + " is a prime number");

				} else {
					System.out.println("The number " + ourNumber + " is not a prime number");

				}
				break;

			// If you choose a wrong option
			default:
				System.out.println("The selected option is not available");
				System.out.println("Select one of the available options");
			}
		} while (option != 0);

		// We close the Scanner
		sc.close();
	}
}
