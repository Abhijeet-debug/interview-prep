package for_loop;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
//		while (i <= n) {
//			int j = 1;
//			while (j <= n) {
//				System.out.print(j);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(j);
				j++;
				if (j > i)
					break;
			}
			System.out.println();
			i++;
		}
	}

}
