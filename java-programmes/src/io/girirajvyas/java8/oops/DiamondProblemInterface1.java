package io.girirajvyas.java8.oops;

public interface DiamondProblemInterface1 {

	default void defaultMethod1(){
		System.out.println("Interface 1 --> In  defaultMethod1");
	}
	
	default void defaultMethod2(){
		System.out.println("Interface 1 --> In  defaultMethod2");
	}
	public void method2();
	
}
