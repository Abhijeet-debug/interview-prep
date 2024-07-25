package com.practise;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int num = 2; num <= n; num++) {
			boolean isPrime = true;

			for (int div = 2; div <= num - 1; div++) {
				if (num % div == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(num);

		}
	}

}
