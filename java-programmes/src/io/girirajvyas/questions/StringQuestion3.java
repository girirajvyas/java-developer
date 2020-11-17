package io.girirajvyas.questions;

/**
 * String s = "jhdjfjfjjdhggdjdjhgggdkjgjdjdjdg";
 * 
 * write a method that will return true if every g in input string is coupled
 * with another string
 * 
 * @author giri
 *
 */
public class StringQuestion3 {

	// TODO: Not working code
	public static void main(String[] args) {
		String input = "jhdjfjfjjdhggdjdjhgggdkjgjdjdjdg";
		boolean consecutiveG = false;
		boolean firstGOccured = false;
		for (Character c : input.toCharArray()) {
			System.out.println("Character is: " + c);
			if (c == 'g' && !firstGOccured) {
				firstGOccured = true;
				continue;
			}

			if (c == 'g' && firstGOccured) {
				consecutiveG = true;
				firstGOccured = false;
			} else {
				consecutiveG = false;
				firstGOccured = false;
			}
		}

		System.out.println("consecutive g are there: " + consecutiveG);

	}
}
