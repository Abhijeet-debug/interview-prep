package pattern_logic;

import java.util.Scanner;

public class CharacteerPattern5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			char startingChar = (char) ('E' + j - i);
			while (j <= i) {
				System.out.print(startingChar);
				startingChar++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
