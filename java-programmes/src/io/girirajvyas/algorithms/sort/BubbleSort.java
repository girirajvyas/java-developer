package io.girirajvyas.algorithms.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] arrayToSort = { 2, 1, 3, 9, 5, 6, 7, 4, 5, 0 };
		Integer[] arrayToSort2 = { 2, 1, 3, 9, 5, 6, 7, 4, 5, 0 };

		BubbleSort.sortByBubbleSort(arrayToSort);
		BubbleSort.sortByBubbleSortOptimized(arrayToSort2);

		System.out.println(Arrays.toString(arrayToSort));
		System.out.println(Arrays.toString(arrayToSort2));
	}

	/**
	 * Time Complexity: O(n^2)
	 * 
	 * @param arrayToSort
	 */
	private static void sortByBubbleSort(Integer arrayToSort[]) {
		for (int j = 0; j < arrayToSort.length - 1; j++) {
			// length - j - 1 : move the index forward as the array is sorted
			for (int i = 0; i < arrayToSort.length - j - 1; i++) {
				if (arrayToSort[i] > arrayToSort[i + 1]) {
					int temp = arrayToSort[i];
					arrayToSort[i] = arrayToSort[i + 1];
					arrayToSort[i + 1] = temp;
				}
			}
		}
	}

	/**
	 * <pre>
	 * Time Complexity:
	 * Worst Case: O(n^2) {Array is sorted in reverse order}
	 * Best Case: O(n) {Array already sorted, only outer for loop}
	 * </pre>
	 * 
	 * @param arrayToSort
	 */
	private static void sortByBubbleSortOptimized(Integer arrayToSort[]) {
		for (int j = 0; j < arrayToSort.length - 1; j++) {

			boolean swapped = false;
			for (int i = 0; i < arrayToSort.length - j - 1; i++) {
				if (arrayToSort[i] > arrayToSort[i + 1]) {
					int temp = arrayToSort[i];
					arrayToSort[i] = arrayToSort[i + 1];
					arrayToSort[i + 1] = temp;
					swapped = true;
				}
			}

			// Optimization
			if (!swapped) {
				// As not a single swap occurred
				// Array is completely sorted, STOP!!
				break;
			}
		}
	}

}
