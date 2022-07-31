package main;

public class BinarySearch {

	public static void main(String[] args) {
		//Find the position of an item with binary search
		
		int[] myList = {0,2,5,6,8,12,15};
		
	     System.out.println(binarySearch(myList, 12));
	}

	private static int binarySearch(int[] list, int number) {
		
		int low = 0;
		int high = list.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			int guess = list[mid];
			
			if (guessEqualsNumber(guess, number)) {
				return mid;
			} else if (guessGreaterThanNumber(guess, number)) {
				high = mid - 1;
			} else if (guessLessThanNumber(guess, number)) {
				low = mid +1;
			}
		}
		
		return -1;
	}

	private static boolean guessLessThanNumber(int guess, int number) {
		if (guess > number) {
			return false;
		}
		return true;
	}

	private static boolean guessGreaterThanNumber(int guess, int number) {
		if (guess < number) {
			return false;
		}
		return true;
	}

	private static boolean guessEqualsNumber(int guess, int number) {
		if (guess != number) {
			return false;
		}
		return true;
	}
		
	}
	
	