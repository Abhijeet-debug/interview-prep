package com.function;

public class Prime2ToN {

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

	public static void printPrimes(int n) {

		for (int i = 2; i < n; i++) {
			// need to check is I is prime or not
			Boolean ansIsPrime = isPrime(i);
			if (ansIsPrime) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		printPrimes(100);

	}

}
