package io.girirajvyas.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsPredicateDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		// sum elements based on condition
		sumElementsInList(numbers);

		// Complex scenario
		// take only the even numbers in the list, double them and finally print
		// the first one bigger than 5
		 complexScenarioWithStreams(numbers);
		 complexScenarioBeforeJava8(numbers);
	}

	private static void complexScenarioWithStreams(List<Integer> numbers) {
		System.out.println( numbers.stream()
	            .filter(StreamsPredicateDemo::isEven)
	            .map(StreamsPredicateDemo::doubleIt)
	            .filter(StreamsPredicateDemo::isGreaterThan5)
	            .findFirst());
	}
	
	private static void complexScenarioBeforeJava8(List<Integer> numbers) {
		List<Integer> l1 = new ArrayList<Integer>();
		for (int n : numbers) {
			if (isEven(n))
				l1.add(n);
		}

		List<Integer> l2 = new ArrayList<Integer>();
		for (int n : l1) {
			l2.add(doubleIt(n));
		}

		List<Integer> l3 = new ArrayList<Integer>();
		for (int n : l2) {
			if (isGreaterThan5(n))
				l3.add(n);
		}

		System.out.println(l3.get(0));
	}

	private static void sumElementsInList(List<Integer> numbers) {
		// sums all the Integers in the list
		// System.out.println(sumAll(numbers));

		// sums all the even numbers in the list
		// System.out.println(sumAllEven(numbers));

		// Instead of creating method for each scenario we will pass Predicate
		// as well for filtering condition
		System.out.println(sumAll(numbers, p -> true));
		System.out.println(sumAll(numbers, p -> p % 2 == 0));
		System.out.println(sumAll(numbers, p -> p > 3));
	}

	private static int sumAll(List<Integer> numbers) {
		int total = 0;
		for (Integer number : numbers) {
			total += number;
		}
		return total;
	}

	private static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
		int total = 0;
		for (Integer number : numbers) {
			if (p.test(number))
				total += number;
		}
		return total;
	}

	private static int sumAllEven(List<Integer> numbers) {
		int total = 0;
		for (Integer number : numbers) {
			if (number % 2 == 0)
				total += number;
		}
		return total;
	}

	public static boolean isEven(int number) {
		System.out.println("isEven:" + number);
		return number % 2 == 0;
	}

	public static int doubleIt(int number) {
		System.out.println("doubleIt:" + number);
		return number * 2;
	}

	public static boolean isGreaterThan5(int number) {
		System.out.println("isGreaterThan5:" + number);
		return number > 5;
	}
}
