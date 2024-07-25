package com.function;

public class CheckPrime {

	public static Boolean isPrime(int n) {
		int d = 2;
		while (d < n) {
			if (n % d == 0) {
				return false;
			}
			d++;
		}
		return true;
	}

	public static void printUpToN(int n) {
		if (n <= 0) {
			return;
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		boolean ansPrime = isPrime(30);
		System.out.println(ansPrime);

		printUpToN(5);
	}

}
