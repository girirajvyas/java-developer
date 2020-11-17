package io.girirajvyas.oops;

public class Parent {
	public static int a = 10;

	public Parent() {
		System.out.println("In Parent's Constructor");
	}

	public static void moveIsStaticMethod(){
		System.out.println("In Parent's move method");
	}
	
	public void drawIsInstanceMethod() {
		System.out.println("In Parent's  draw method");
		System.out.println(a);
	}
}
