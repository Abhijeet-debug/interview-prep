package com.practise1;

import java.util.Scanner;

public class SumOfproduct {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c = s.nextInt();

		if (c == 1) {
			int sum = (n * (n + 1)) / 2;
			System.out.println(sum);
			return;
		} else if (c == 2) {
			int product = 1;
			for (int i = 1; i <= 10; i++) {
				product *= i;
			}
			System.out.println(product);
		} else {
			System.out.println("-1");
		}
	}

}
