package io.girirajvyas.questions.pojo;

public class Child extends Parent{
	public Child(){
		System.out.println("In Child Constructor");
	}
	
	public void m1(){
		System.out.println("in Child : m1");
	}
	
	public void m2(){
		System.out.println("in Child : m2");
	}
	
	public void someOtherMethod(){
		System.out.println("someOtherMethod of Child");
	}
}
