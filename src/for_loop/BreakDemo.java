package for_loop;

import java.util.Scanner;

public class BreakDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = 2;
		boolean isPrime = false;
		while (d < n) {
			if (n % d == 0) {
				isPrime = true;
				break;
			}
			d++;
		}

		if (isPrime) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime ");
		}
	}

}
