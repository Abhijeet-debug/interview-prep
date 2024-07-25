package com.practise;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n == 0) {
			System.out.println(" 0 ");
			return;
		}

		int f1 = 1, f2 = 1;
		for (int i = 3; i <= n; i++) {
			int sum = f1 + f2;
			f1 = f2;
			f2 = sum;
		}
		System.out.println(f2);
	}

}
