package for_loop;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		int i = 1;
//		while (i <= n) {
//			if (i == 5) {
//				i++;
//				continue;
//			}
//			System.out.println(i);
//			i++;
//
//		}
		for (int k = 1; k <= n; k++) {
			if (k == 5) {
				continue;
			}
			System.out.println(k);
		}
	}

}
