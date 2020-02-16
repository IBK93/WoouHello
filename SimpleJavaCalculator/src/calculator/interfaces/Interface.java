package calculator.interfaces;

import java.util.Scanner;

import calculator.logic.Logic;

public class Interface {

	// We create the interface of our calculator / application.
	// We define the local attributes of the class.

	private Scanner sc = new Scanner(System.in);
	private int option = 0;
	private int numA = 0;
	private int numB = 0;
	private int result = 0;
	private Logic logic = new Logic();

	// Methods of the interface class.
	public void start() {
		showMenu();
	}

	private void showMenu() {

		System.out.println("Calculator");
		System.out.println("===========");
		System.out.println("1.- To add");
		System.out.println("2.- To Subtract");
		System.out.println("3.- Multiply");
		System.out.println("4.- Divide");
		System.out.println("0.- Exit");
		System.out.println("===========");

		getOption();
	}

	private void getNumbers() {

		System.out.print("Introduce the first number: ");
		numA = sc.nextInt();
		System.out.print("Introduce the second number: ");
		numB = sc.nextInt();
	}

	private void getOption() {

		do {
			System.out.print("Select an option: ");
			option = sc.nextInt();

			switch (option) {
			case 0:
				System.out.println("See you soon!");
				break;
			case 1:
				getNumbers();
				result = logic.toAdd(numA, numB);
				System.out.println("The result of the sum is: " + result);
				break;
			case 2:
				getNumbers();
				result = logic.toSubtract(numA, numB);
				System.out.println("The result of the subtraction is " + result);
				break;
			case 3:
				getNumbers();
				result = logic.multiply(numA, numB);
				System.out.println("The result of multiplication is: " + result);
				break;
			case 4:
				getNumbers();
				result = logic.divide(numA, numB);
				System.out.println("The result of the division is: " + result);
				break;
			default:
				System.out.println("The selected option is not available");
				System.out.println("Select one of the available options");
			}

		} while (option != 0);
	}
}
