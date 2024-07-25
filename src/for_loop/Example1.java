package for_loop;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
//		int i = 1;
//
//		while (i <= n) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
