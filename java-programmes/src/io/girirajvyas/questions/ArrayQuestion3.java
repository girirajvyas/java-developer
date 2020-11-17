package io.girirajvyas.questions;

/**
 * Q: Find the element that is maximum in its row and minimum in its column
 * 
 * 2 3 1 <br/>
 * 4 6 5 <br/>
 * 7 8 9 <br/>
 * 10 11 12 <br/>
 * 
 * O/P: 3
 * 
 * @author giri
 *
 */
public class ArrayQuestion3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] array = { { 2, 3, 1 }, { 4, 6, 5 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int rowCount = array.length;
		int maxInRowIndex = 0;
		int maxInRow = 0;
		int minInColumn = 0;
		// iterating the array over each row having 1d array
		for (int i = 0; i < rowCount; i++) {
			// iterating over each element in that array
			for (int j = 0; j < array[i].length; j++) {
				if (maxInRow < array[i][j]) {
					maxInRow = array[i][j];
					maxInRowIndex = j;
				}
			}

			System.out.println("Max value in row : " + maxInRow + "\n Max value row index :" + maxInRowIndex);
			// assigning the max value in row to min in value to check
			minInColumn = maxInRow;
			for (int k = 0; k < rowCount; k++) {
				if (minInColumn > array[k][maxInRowIndex]) {
					minInColumn = array[k][maxInRowIndex];
				}
				System.out.println(array[k][maxInRowIndex]);
			}

			if (minInColumn == maxInRow) {
				System.out.println(minInColumn + " is the value ");
				break;
			}
		}
		/*
		 * System.out.println("Max value in row : " + maxInRow +
		 * "\n Max value row index :" + maxInRowIndex);
		 */

	}

}
