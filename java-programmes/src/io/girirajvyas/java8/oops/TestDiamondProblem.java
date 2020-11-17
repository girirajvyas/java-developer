package io.girirajvyas.java8.oops;

/**
 * You must provide the implementation for the default method present in both
 * the interfaces
 * 
 * Compilation Error: "Duplicate default methods named defaultMethod1 with the
 * parameters () and () are inherited from the types DiamondProblemInterface2
 * and DiamondProblemInterface1"
 * 
 * @author giri
 *
 */
public class TestDiamondProblem implements DiamondProblemInterface1, DiamondProblemInterface2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	/**
	 * must override the default method
	 */
	@Override
	public void defaultMethod1() {
		// Calling the implementation from Interface 1
		DiamondProblemInterface1.super.defaultMethod1();
	}

}
