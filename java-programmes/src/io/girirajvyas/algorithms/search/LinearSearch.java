package io.girirajvyas.algorithms.search;

/**
 * <pre>
 * Input : arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170}
 *        x = 110;
 * Output : 6
 * Element x is present at index 6
 * 
 * Input : arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170}
 *        x = 175;
 * Output : -1
 * Element x is not present in arr[].
 * </pre>
 * 
 * <pre>
 * 	Time complexity: O(n)
 * 	O(1) < O(Log n) < O(n) < O (n Log n) < O(n^2) < O(2^n) < O(n!)
 * 
 * </pre>
 * 
 * @author giri
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };
		int x = 110;
		int output = LinearSearch.findIndexOfValueInArray(arr, x);

		if (output == -1) {
			System.out.println(output + "\n Element x is not present in arr[] ");
		} else {
			System.out.println(output + "\n Element x is present at index " + output);
		}
	}

	public static int findIndexOfValueInArray(int arr[], int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
