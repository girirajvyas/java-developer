package io.girirajvyas.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamsConsumerDemo {
	private static void printAllElementsOfList(List<Integer> numbers) {
		// Before Java8 : External Iteration
		System.out.println("Before Java 8 demo");
		for (Integer number : numbers) {
			System.out.println(number);
		}

		// Java8 with Consumer and forEach (Anonymous inner class)
		System.out.println("Anonymous inner class demo");
		numbers.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});

		// java8 with Lambda expression as Consumer is Functional interface with
		// single method, a is the parameter passed in accept method
		// there is no return statement that is type inference done by JVM
		System.out.println("Lambda expression demo");
		numbers.forEach(a -> System.out.println(a));

		// Note: it may seem that anonymous inner class and lamda are same but
		// they are not lambda is more than just replacing anonymous inner class

		// Method reference, eta expansion, the name of the method is "expanded"
		// by the compiler in the method itself
		System.out.println("Method Referencing demo");
		numbers.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		// Print all elements
		printAllElementsOfList(numbers);
	}

}
