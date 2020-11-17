package io.girirajvyas.algorithms.search;

import java.util.Arrays;

/**
 * <b>Given a sorted array<b>
 * 
 * <pre>
 * 	Time complexity: 
 *    Worst case: O(Log n)
 *    Best case: O(1)
 *    
 * 	Hierarchy: O(1) < O(Log n) < O(n) < O (n Log n) < O(n^2) < O(2^n) < O(n!)
 * </pre>
 * 
 * @author giri
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		// sorted array
		int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91, 99 };
		int value = 99;
		int output = binarySearch(arr, 0, arr.length, value);

		System.out.println("My Implementation: " + output);
		System.out.println("Java Implementation: " + Arrays.binarySearch(arr, value));
	}

	public static int binarySearch(int arr[], int fromIndex, int toIndex, int value) {

		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high) {
			// if only '<' then you will miss last value when low = high

			// u can use unsigned right shift for divide by 2
			// int mid = (low + high) >>> 1;
			int mid = (low + high) / 2;
			int midVal = arr[mid];

			if (value < midVal) {
				high = mid - 1;
			} else if (value > midVal) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
