package com.function;

public class Overloading {

	public static void main(String[] args) {

		fun(22);
		fun("Abhijeet");
	}

	static void fun(int a) {
		System.out.println(a);
	}

	static void fun(String a) {
		System.out.println(a);
	}
}
