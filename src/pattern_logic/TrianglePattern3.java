package pattern_logic;

import java.util.Scanner;

public class TrianglePattern3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int count = i;
		while (i <= n) {
			int j = 1;
			
			while (j <= i) {
				System.out.print(count);
				count++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
