package arrays.methods;

import java.util.Scanner;

public class Methods {

	protected static int rowsNum;
	protected static int columnsNum;
	protected static int[][] array;

	protected static void arrayCreation() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Array Creation");
		System.out.println("--------------");
		System.out.print("Number of rows in the array: ");
		rowsNum = sc.nextInt();
		System.out.print("Number of columns in the array: ");
		columnsNum = sc.nextInt();

		array = new int[rowsNum][columnsNum];

		System.out.println("Give values to the array");
		for (int i = 0; i < rowsNum; i++) {
			for (int j = 0; j < columnsNum; j++) {
				System.out.print("Array [" + (i + 1) + "][" + (j + 1) + "]: ");
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("");
		System.out.println("This is the array you have created");
		for (int i = 0; i < array.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}

	protected static void maxValue() {

		int max = 0;
		int row = 0;
		int col = 0;

		// Find the maximum value and the position: row, column;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println("Maximum number: " + max);
		System.out.println("Row: " + (row + 1));
		System.out.println("Column: " + (col + 1));

	}

	protected static void minValue() {

		int row = 0;
		int col = 0;
		int min = array[0][0];

		// Find the minimum value and the position: row, column;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < min) {
					min = array[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println("Minimum number: " + min);
		System.out.println("Row: " + (row + 1));
		System.out.println("Column: " + (col + 1));
	}

	protected static void arithmeticAverage() {

		// Sum of all the elements
		// Average of the array

		double average = 0;
		int totalSums = 0;
		int arrayElements = 0;

		for (int i = 0; i < array.length; i++) {
			arrayElements += array[i].length;
			for (int j = 0; j < array[i].length; j++) {
				totalSums += array[i][j];
			}
		}

		// round the average to the second decimal cipher;

		average = (double) totalSums / (double) arrayElements;
		double averageWholePart = Math.floor(average);
		average = (average - averageWholePart) * Math.pow(10, 2);
		average = Math.round(average);
		average = (average / Math.pow(10, 2)) + averageWholePart;

		System.out.println("Sum of all the components " + totalSums);
		System.out.println("Arithmetic average: " + average);
	}

	protected static void rowsSum() {

		// Sum all the rows elements;

		int rowsSum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				rowsSum += array[i][j];
			}
			System.out.println("The sum of the row [" + (i + 1) + "] is: " + rowsSum);
			rowsSum = 0;
		}
	}

	protected static void columnsSum() {

		// Sum all the columns elements;

		int columSum = 0;

		for (int j = 0; j < columnsNum; j++) {
			for (int i = 0; i < rowsNum; i++) {
				columSum += array[i][j];
			}
			System.out.println("The sum of the column [" + (j + 1) + "] is: " + columSum);
			columSum = 0;
		}
	}

	protected static void symmetric() {

		// In this method we check if the array is symmetric

		boolean symmetric = true;
		if (rowsNum == columnsNum) {
			int i, j;
			i = 0;
			while (i < rowsNum && symmetric == true) {
				j = 0;
				while (j < i && symmetric == true) {
					if (array[i][j] != array[j][i]) {
						symmetric = false;
					}
					j++;
				}
				i++;
			}
			if (symmetric == true) {
				System.out.println("The created Array is symmetric");
			} else {
				System.out.println("The created Array is not symmetric");
			}
		} else {
			System.out.println("The created Array is not symmetric");
		}
	}

	protected static void transposeArray() {

		// Show the transposed array

		// The array can be square or non-square
		// In each case we should do something different
		int aux;

		if (array.length == array[0].length) {
			// Square
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < i; j++) {

					aux = array[i][j];
					array[i][j] = array[j][i];
					array[j][i] = aux;
				}
			}

			System.out.println("The transposed array is: ");
			for (int i = 0; i < array.length; i++) {
				System.out.print("| ");
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + " ");
				}
				System.out.println("|");
			}

		} else {
			// non-square
			int[][] nonSquareArray = new int[array[0].length][array.length];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					nonSquareArray[j][i] = array[i][j];
				}
			}

			System.out.println("The transposed array is: ");
			for (int i = 0; i < nonSquareArray.length; i++) {
				System.out.print("| ");
				for (int j = 0; j < nonSquareArray[i].length; j++) {
					System.out.print(nonSquareArray[i][j] + " ");
				}
				System.out.println("|");
			}
		}
	}
}
