package com.time_pass;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String name;
		float f;
		long l;

		a = sc.nextInt();
		name = sc.next();
		f = sc.nextFloat();
		l = sc.nextLong();
		System.out.println(a + " " + name + " " + f + " " + l);
	}

}
