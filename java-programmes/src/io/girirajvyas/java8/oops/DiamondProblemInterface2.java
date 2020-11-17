package io.girirajvyas.java8.oops;

public interface DiamondProblemInterface2 {

	default void defaultMethod1() {
		System.out.println("Interface 2 --> In  defaultMethod1");
	}

	/**
	 * we have the method with same name in DiamondProblemInterface1, but
	 * without parameter and hence in this scenario we need not provide the
	 * implementation in the implementing class
	 * 
	 * @param s
	 */
	default void defaultMethod2(String s) {
		System.out.println("Interface 2 --> In  defaultMethod2");
	}

	public void method2();

}
