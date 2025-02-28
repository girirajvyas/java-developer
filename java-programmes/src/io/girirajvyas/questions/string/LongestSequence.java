package io.girirajvyas.questions.string;

/**
 * Q1: Find first longest sequence of alphabets/numbers found in the String
 * 
 * @author giri
 *
 * #HarMan
 */
public class LongestSequence {

	public static void main(String[] args) {
		String s = "ZZZZAISSDRRIIIHHHQQQDDDDDDDZZZZZDD";
		System.out.println(findFirstLongestSequence(s));
	}

	/**
	 * Method determining the longest sequence
	 * 
	 * @param s
	 * @return
	 */
	public static final String findFirstLongestSequence(String s) {
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

		return longestSequenceElement +":"+ longestSequenceElementCount;
	}

}
