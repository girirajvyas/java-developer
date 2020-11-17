package io.girirajvyas.operators;

/**
 * 
 * <pre>
 *  Arithmetic shift operators
 *   >> : Right shift (Signed), for divide by 2^n
 *   << : Left shift (Signed), for multiply by 2^n
 *   
 *  Logical shift operators
 *   >>> : Right shift (UnSigned), for divide by 2^n
 *   <<< : Left shift (UnSigned) - NOT AVAILABLE IN JAVA
 * </pre>
 * 
 * @author giri
 *
 */
public class ShiftOperators {

	public static void main(String[] args) {
		unsignedRightShift();
		signedRightShift();
		signedLeftShift();
	}

	/**
	 * <pre>
	 * Divide by 2 = >>> 1  (2^1)
	 * Divide by 4 = >>> 2  (2^2)
	 *       .
	 *       .
	 * Divide by n = >>>    (2^n)
	 * </pre>
	 * 
	 * unsigned is also called Logical <br>
	 * Note: Used in Arrays.binarySearch();
	 */
	public static void unsignedRightShift() {
		int divide100By2 = 100 >>> 1;
		int divide100By4 = 100 >>> 2;
		System.out.println("value of 100 >>> 1 is " + divide100By2);
		System.out.println("value of 100 >>> 2 is " + divide100By4);

		// Valid for only Positive values
		int divideNegative100By2 = -100 >>> 1;
		System.out.println("value of -100 >>> 2 is " + divideNegative100By2);
		System.out.println();
	}

	/**
	 * <pre>
	 * Divide by 2 = >> 1  (2^1)
	 * Divide by 4 = >> 2  (2^2)
	 *       .
	 *       .
	 * Divide by n = >>    (2^n)
	 * </pre>
	 * 
	 */
	public static void signedRightShift() {
		int divide100By2 = 100 >> 1;
		int divide100By4 = 100 >> 2;
		System.out.println("value of 100 >> 1 is " + divide100By2);
		System.out.println("value of 100 >> 2 is " + divide100By4);

		// Valid for both Positive and negative values
		int divideNegative100By2 = -100 >> 1;
		System.out.println("value of -100 >> 1 is " + divideNegative100By2);
		System.out.println("  ");
	}

	/**
	 * <pre>
	 * Multiply by 2 = << 1  (2^1)
	 * Multiply by 4 = << 2  (2^2)
	 *       .
	 *       .
	 * Multiply by n = <<    (2^n)
	 * </pre>
	 * 
	 * Note: There is no <<< in Java
	 */
	public static void signedLeftShift() {
		int multiply100By2 = 100 << 1;
		int multiply100By4 = 100 << 2;
		System.out.println("value of 100 << 1 is " + multiply100By2);
		System.out.println("value of 100 << 2 is " + multiply100By4);

		// Valid for only Positive values
		int mutiplyNegative100By2 = -100 << 1;
		System.out.println("value of -100 << 2 is " + mutiplyNegative100By2);
	}

}
