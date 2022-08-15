package main;

import java.util.Arrays;

public class RecursionSum {

	public static void main(String[] args) {
		System.out.println(Sum(new int [] {2, 6, 8, 1, 7}));
	}

	private static int Sum(int[] arr) {
		if (arr.length == 0) {
			return 0;
		} else {
			return arr[0] + Sum(Arrays.copyOfRange(arr, 1, arr.length));
			//Arrays.copyOfRange= copia um range especifico de um array devolvendo um novo array.
			//arr = array original
			// 1 = onde começa o novo array
			// arr.length = até onde será copiado
		}
		
		
	}
	
	
}
