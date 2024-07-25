package for_loop;

import java.util.Scanner;

public class BreakDemo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = 2;
		boolean isPrime = false;

		for (d = 2; d < n; d++) {
			if (n % d == 0) {
				isPrime = true;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}

}
