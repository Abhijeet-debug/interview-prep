package com.function;

import java.util.Scanner;

public class Greting {
	static void gretting() {
		System.out.println("Namaste India");
	}

	public static int sum() {

		Scanner in = new Scanner(System.in);
		System.out.println(" Enter 1st Number :");
		int num1 = in.nextInt();
		System.out.println(" Enter 2nd Nymber :");
		int num2 = in.nextInt();
		int sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		gretting();
		int result = sum();
		System.out.println(result);
	}
}
