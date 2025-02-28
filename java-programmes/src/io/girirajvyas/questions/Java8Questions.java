package io.girirajvyas.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Questions {

	public static void main(String[] args) {
		findWordsWithMaxVowels();
	}

	/**
	 * 1) Given a string, find the words with the maximum number of vowels.
	 * 
	 * <b>Input</b>: "The quick brown fox jumps right over the little lazy dog." Maximum
	 * Number of Vowels: 
	 * 
	 * <b>output</b>: quick, over, little
	 */
	private static void findWordsWithMaxVowels() {
		String input = "The quick brown fox jumps right over the little lazy dog.";
		List<String> words = Arrays.asList(input.split(" ")); 
		System.out.println(words);
		
		int maxVowelCount = words
		.stream()
		.mapToInt(Java8Questions::getVowelsCount)
		.max()
		.orElse(0);
		
		System.out.println("Max Vowel Count: "+ maxVowelCount);
		
		words
		.stream()
		.filter(word -> getVowelsCount(word) == maxVowelCount)
		.forEach(System.out::println);
		
	}

	
	public static int getVowelsCount(String input) {
		return (int) input
		.chars()
		.mapToObj(ch -> (char)ch)
		.filter(ch-> "AEIOUaeiou".contains(String.valueOf(ch)))
		.count();
	}
}
