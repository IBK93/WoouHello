package arrays.intefaces;

import java.util.Scanner;

import arrays.methods.Methods;

public class Interface extends Methods {

	protected static void start() {

		System.out.println("Wellcome to Array Analyzer");
		System.out.println("--------------------------");
		System.out.println("In the first instance you should create your Array");
		arrayCreation();
		showMenu();
	}

	private static void showMenu() {
		
		System.out.println("");
		System.out.println("Options");
		System.out.println("==========================");
		System.out.println("1.- Maximum value");
		System.out.println("2.- Minimum value");
		System.out.println("3.- Sum the elements of each row");
		System.out.println("4.- Sum the elements of each column");
		System.out.println("5.- Check symmetry");
		System.out.println("6.- Calculate the average");
		System.out.println("7.- Transpose the Array");
		System.out.println("0.- Exit");
		System.out.println("===========================");

		getOption();
	}

	private static void getOption() {
		
		int option = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("------------------");
			System.out.print("Select an option: ");
			option = sc.nextInt();

			switch (option) {
			case 0:
				System.out.println("See you soon!");
				break;
			case 1:
				maxValue();
				break;
			case 2:
				minValue();
				break;
			case 3:
				rowsSum();
				break;
			case 4:
				columnsSum();
				break;
			case 5:
				symmetric();
				break;
			case 6:
				arithmeticAverage();
				break;
			case 7:
				transposeArray();
				break;
			default:
				System.out.println("The selected option is not available");
				System.out.println("Select one of the available options");
			}

		} while (option != 0);
	}
}
