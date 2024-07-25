package com.function;

import java.util.Arrays;

public class VarArg {

	public static void main(String[] args) {

		fun(1, 2, 3, 4, 5, 65, 67, 34);
		multiple(10, 20, "Abhijeet", "Avinash");

	}

	static void fun(int... v) {
		System.out.println(Arrays.toString(v));
	}

	static void multiple(int a, int b, String... v) {

	}

}
