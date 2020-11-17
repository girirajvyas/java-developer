package io.girirajvyas.algorithms.sort;

import java.util.Arrays;

/**
 * Class implementing Selection Sort Algorithm
 * 
 * @author giri
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		Integer[] arrayToSort = { 2, 1, 3, 9, 5, 6, 7, 4, 5, 0 };
		int minValueIndex = 0;
		SelectionSort selectionSort = new SelectionSort();
		for (int i = 0; i < arrayToSort.length; i++) {
			// find the Max/Minimum element in via linear search
			minValueIndex = selectionSort.findMinViaLinearSearch(arrayToSort, i);
			System.out.println("Min Index is " + minValueIndex);
			
			// Swap that with the rightmost/leftmost element
			arrayToSort = selectionSort.swap(arrayToSort, minValueIndex, i);
			System.out.println("Array After " + (minValueIndex + 1) + " Iterations:  " + Arrays.toString(arrayToSort));
		}
		System.out.println(Arrays.toString(arrayToSort));
	}

	
	public Integer findMinViaLinearSearch(Integer[] arr, Integer startIndex) {
		int minValueIndex = 0;
		for (int i = startIndex; i < arr.length; i++) {
			if (arr[startIndex] < arr[i]) {
				minValueIndex = i;
			}
		}
		return minValueIndex;
	}

	public Integer[] swap(Integer[] arr, Integer minElementIndex, Integer swapElementIndex) {
		Integer temp = arr[minElementIndex];
		arr[minElementIndex] = arr[swapElementIndex];
		arr[swapElementIndex] = temp;
		return arr;
	}
}
