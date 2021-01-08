package io.girirajvyas.utilities;

import java.util.function.Predicate;

public class Addition {
	
	public int add(Integer a, Integer b) {
		return a + b;
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		System.out.println(addition.add(1, 2));
		System.out.println(addition.add(0, 2));
		
		Predicate<String> pr = (t) -> t.equals("Giri");
		if (pr.test("Hello")) {
			System.out.println("Hi");
		}
	}
}
