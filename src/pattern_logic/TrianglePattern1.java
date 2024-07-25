package pattern_logic;

import java.util.Scanner;

public class TrianglePattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int i = 1;
		while (i <= row) {
			int j = 1;
			while (j <= i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}

