package io.girirajvyas.ds.arrays;

public class TestArrays {

	public static void main(String[] args) {
		// arrays are not dynamic hence we have to provide while initializing
		int[] arr = new int[7];

		// arrays starts from 0 index
		arr[0] = 20;
		arr[1] = 35;
		arr[2] = -15;
		arr[3] = 7;
		arr[4] = 55;
		arr[5] = 1;
		arr[6] = -22;
		//arr[7] = 11; // java.lang.ArrayIndexOutOfBoundsException: 7
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
