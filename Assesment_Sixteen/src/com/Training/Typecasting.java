package com.Training;

import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		booleanToInt();
		doubleToInt();
		intToDouble();
		longToInt();
	}

	private static void booleanToInt() {
		// Assign The Boolean Value as A True
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Boolean Value:");
		boolean booleann = scan.nextBoolean();
		int number = (booleann) ? 1 : 0;
		System.out.println(number);

	}

	private static void doubleToInt() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Double Value:");
		double nextDouble = scan.nextDouble();

		int number = (int) nextDouble;
		System.out.println("Given Double Value As a Int:" + number);

	}
	
	private static void intToDouble() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Int Value:");
		double next = scan.nextInt();

		double number = (double) next;
		System.out.println("Given int  Value As a Double:" + number);


	}
	
	private static void longToInt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Long Value:");
		double next = scan.nextLong();

		int number = (int) next;
		System.out.println("Given Long  Value As a int:" + number);

	}
}
