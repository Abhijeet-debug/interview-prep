package pattern_logic;

import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1, n2;
		n1 = n / 2 + 1;
		n2 = n - n1;

		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= n2; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(' ');
			}
			for (int j = 1; j <= 2 * (n2 - i) + 1; ++j) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
