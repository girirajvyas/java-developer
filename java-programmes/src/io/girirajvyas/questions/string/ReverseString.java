package io.girirajvyas.questions.string;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Reverse String
 * @author Giri
 *
 */
public class ReverseString {
	
	public static void main(String[] args) {
		String input = "Raj";
//		reverseViaCodeJava8(input);
		Integer[] numbers = {1,1,3,4};
		Optional<Integer> sum = Stream.of(numbers).reduce((a,b) -> a+b);
		Integer sum2 = Stream.of(numbers).reduce(5,(a,b) -> a+b);
		System.out.println(sum.get());
		System.out.println(sum2);
	}
	
	private static String reverseViaCodeJava8(String input) {
		input.chars().forEach(p -> System.out.println(p));
		return null;
	}
	
	private static String reverseViaCode(String input) {
		if (input == null) {
			return "";
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i=input.length()-1; i>=0; i--) {
			builder.append(input.charAt(i));
		}
		
		System.out.println(builder);
		return builder.toString();
	}
	
	private static String reverseViaStringBuilder(String input) {
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());
		return sb.reverse().toString();
	}
	
	private static String reverseViaStringBuffer(String input) {
		StringBuffer sb = new StringBuffer(input);
		System.out.println(sb.reverse());
		return sb.reverse().toString();
	}

}
