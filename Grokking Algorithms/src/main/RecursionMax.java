package main;

import java.util.Arrays;

public class RecursionMax {

	public static void main(String[] args) {

		System.out.println(find(new int[] { 12, 5, 1, 8, 3 }));

	}

	private static int find(int[] arr) {
		if (arr.length == 2) {
			return arr[0] > arr[1] ? arr[0] : arr[1];
		}
		
		int min = find(Arrays.copyOfRange(arr, 1, arr.length));
			return arr[0] > min ? arr[0] : min;
		
	}
}