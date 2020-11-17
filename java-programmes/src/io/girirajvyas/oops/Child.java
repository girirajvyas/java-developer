package io.girirajvyas.oops;

/**
 * 
 * @author giri
 *
 */
public class Child extends Parent {

	public static int a = 20;

	public Child() {
		System.out.println("In Child  Constructor");
	}

	public static void moveIsStaticMethod() {
		System.out.println("In Child's Move");
	}

	public void drawIsInstanceMethod() {
		System.out.println("In Child's draw");
		System.out.println(a);
	}
}
