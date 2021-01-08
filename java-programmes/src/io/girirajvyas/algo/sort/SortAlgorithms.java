package io.girirajvyas.algo.sort;

public class SortAlgorithms {

	public static void main(String[] args) {
		Integer[] arrayToSort = { 2, 1, 3, 9, 5, 6, 7, 4, 5, 0 };
		printArray(arrayToSort);
		bubbleSort(arrayToSort);
		printArray(arrayToSort);
	}

	private static void bubbleSort(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	private static void swap(Integer[] arr, int i, int j) {
		// nothing to swap as same index
		if (i == j) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = arr[i];
	}
	
	private static void printArray(Integer[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
