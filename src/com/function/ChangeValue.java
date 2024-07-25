package com.function;

import java.util.Arrays;

public class ChangeValue {

	public static void main(String[] args) {
		// create a Array
		int[] arr = { 1, 4, 67, 5, 55 };
		change(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void change(int[] num) {
		num[0] = 23;
	}

}
