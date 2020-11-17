package io.girirajvyas.questions;

import java.util.Map;
import java.util.TreeMap;

/**
 * Q: Remove the Column in the given array having minimum sum of its elements
 * 
 * @author giri
 *
 */
public class ArrayQuestion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] twoDimensionalArray = { { 10, 20, 30, 40, 50 }, { 11, 22, 33, 44, 55 }, { 1, 2, 3, 4, 5 },
				{ 10, 20, 30, 40, 50 }, { 1, 2, 3, 4, 5 } };

		// By Method-1
		removeRowMethod1(twoDimensionalArray);
		// By Method-2
		removeRowMethod2(twoDimensionalArray);
	}

	public static void removeRowMethod1(int[][] twoDimensionalArray) {
		Map<Integer, int[]> map = new TreeMap<Integer, int[]>();

		int i = 0;
		for (int[] arrayObject : twoDimensionalArray) {
			int total = 0;
			for (int value : arrayObject) {
				total = total + value;
			}
			System.out.printf("total of %s loop is : %s\n ", i, total);
			map.put(total, arrayObject);
			i++;
		}

		for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}

	public static void removeRowMethod2(int[][] twoDimensionalArray) {
		int[][] resultArray = new int[4][4];
		int total = 0;
		int nextRowTotal = 0;
		int rowToremove = 0;
		for (int i = 0; i < twoDimensionalArray.length; i++) {
			// Current loop
			total = 0;
			for (int j = 0; j < twoDimensionalArray[i].length; j++) {
				total = total + twoDimensionalArray[i][j];
			}
			System.out.printf("total of row no. %s is %s\n", i, total);

			// i+1 loop to check total of next loop
			nextRowTotal = 0;
			if (i < twoDimensionalArray.length - 1) {
				for (int j = 0; j < twoDimensionalArray[i].length; j++) {
					nextRowTotal = nextRowTotal + twoDimensionalArray[i + 1][j];
				}
			}
			System.out.printf("total of next row no. %s is %s\n", i + 1, nextRowTotal);

			if (nextRowTotal < total && nextRowTotal != 0) {
				rowToremove = i + 1;
			}
			System.out.println("------------------------------------------");
		}

		System.out.println("Row to be removed is: " + rowToremove);

		for (int k = 0; k < twoDimensionalArray.length; k++) {
			// we could have directly got the output array without iterating
			// over the inner array but as we have to remove the last column we
			// will iterate
			for (int f = 0; f < twoDimensionalArray[k].length; f++) {
				if (k != rowToremove && f < twoDimensionalArray[f].length - 1) {
					resultArray[k][f] = twoDimensionalArray[k][f];
				}
			}
		}

		System.out.println("Given Array is: ");
		for (int[] innerArray : twoDimensionalArray) {
			String s = new String();
			for (int value : innerArray) {
				s = s + String.valueOf(value) + ",";
			}
			System.out.println(s + "\n");
		}

		System.out.println("required o/p : ");
		for (int[] innerArray : resultArray) {
			String s = new String();
			for (int value : innerArray) {
				s = s + String.valueOf(value) + ",";
			}
			System.out.println(s + "\n");
		}
	}
}
