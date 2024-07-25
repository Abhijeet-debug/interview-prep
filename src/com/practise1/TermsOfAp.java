package com.practise1;

import java.util.Scanner;

public class TermsOfAp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		for (int i = 1; x > 0; ++i) {
			int value = 3 * i + 2;
			if (value % 4 != 0) {
				System.out.print(value + " ");
				x--;
			}
		}
	}

}
