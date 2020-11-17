package io.girirajvyas.blog.finalkeyword;

/**
 * 1. Final class cannot be extended by any class. It is the final version of
 * the class and end of its inheritance
 * 
 * @author giri
 *
 */
public final class FinalDemo {

	/**
	 * 2.a initialize directly
	 */
	final int a = 5;

	/**
	 * 2.b final field if not initialized in constructor gives compilation
	 */
	final int x;

	/**
	 * initializing field in constructor
	 * 
	 * @param x
	 */
	public FinalDemo(int x) {
		this.x = x;
	}

	/**
	 * 3. static final fields needs to be initialized else compilation error
	 * As this value belongs to class it cannot be initialized in constructor
	 */
	static final int y = 0;

	/**
	 * 4. final local variable demo
	 */
	private void nonFinalMethod() {
		// a. you can declare, but if you use without initialization compilation
		final int k;
		Integer i;

		// The local variable i may not have been initialized
		// System.out.println(k);
		// System.out.println(i);

		// b. lazy initialization perfectly fine
		final int j;
		j = 5;

		// The final local variable j may already have been assigned
		// j=6;

		// c. Illegal modifier for parameter c; only final is permitted
		// static int c;
	}

	/**
	 * 5. final methods cannot be overridden in child class
	 */
	private final void finalMethod() {
		System.out.println("I am final implementation");
	}

	/**
	 * Compilation error in final initialized in static block
	 */
	static {
		// Cannot make a static reference to the non-static field x
		// x = 5;

		// The final field FinalDemo.y cannot be assigned
		// y = 6;
	}

	/**
	 * The type NonFinal cannot subclass the final class FinalDemo
	 */
	/*	public class NonFinal extends FinalDemo {

	}*/

}
