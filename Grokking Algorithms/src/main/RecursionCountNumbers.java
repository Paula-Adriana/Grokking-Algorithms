package main;

import java.util.Arrays;

public class RecursionCountNumbers {

	public static void main(String[] args) {
		System.out.println(count(new int[] {2, 5, 9, 45, 10}));
	}
	
	private static int count(int[] arr) {
			if (arr.length == 0) {
				return 0;
			} else {
				return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
			}
		}
	

}
