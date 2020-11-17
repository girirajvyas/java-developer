package io.girirajvyas.questions;

/**
 * Q1: Find first longest sequence of alphabets/numbers found in the String
 * 
 * @author giri
 *
 * #HarMan
 */
public class StringQuestion1 {

	public static void main(String[] args) {
		String s = "ZZZZAISSDRRIIIIIIIHHHQQQDDDDDDDZZZZZDD";
		System.out.println(longest(s));
	}

	/**
	 * Method determining the longest sequesnce
	 * 
	 * @param s
	 * @return
	 */
	public static final String longest(String s) {
		// variables to keep track of current and longest sequence element
		String longestSequenceElement = "";
		String currentSequenceElement = "";
		Integer longestSequenceElementCount = 0;
		Integer currentSequenceElementCount = 0;

		for (int i = 0; i < s.length(); i++) {
			Character currentLetter = s.charAt(i);
			// First iteration assignments
			if (i == 0) {
				currentSequenceElement = currentLetter.toString();
				longestSequenceElement = currentSequenceElement;
				currentSequenceElementCount++;
				longestSequenceElementCount++;
				continue;
			}

			// Resetting logic : if iterating element and current sequence
			// element are not same
			if (currentLetter.toString().equals(currentSequenceElement)) {
				currentSequenceElementCount++;
			} else {
				currentSequenceElement = currentLetter.toString();
				currentSequenceElementCount = 1;
			}

			// Check if current iteration element count is greater than longest
			// element count
			if (currentSequenceElementCount > longestSequenceElementCount) {
				longestSequenceElement = currentSequenceElement;
				longestSequenceElementCount = currentSequenceElementCount;
			}
		}

		return longestSequenceElement + longestSequenceElementCount;
	}

}
