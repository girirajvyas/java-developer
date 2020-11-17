package io.girirajvyas.java8.oops;

@FunctionalInterface
public interface FunctionalInterfaceExample {

	void onlyMethod();
	
	// void letsTrySecondMethod();
	// As soon as I add second method I Get:
	// Invalid '@FunctionalInterface' annotation; FunctionalInterfaceExample is not a functional interface
	
	/**
	 * FunctionalInterface can have any number of default methods
	 */
	default void iAmDefaultAndCanBeAnywhere(){
		System.out.println("Hello Functional Interface");
	}
	
	/**
	 * Static methods
	 */
	static void heyIAmStaticAndEnjoyTheSameRulesAsDefault(){
		System.out.println("Hello Functional Interface");
	}
}
