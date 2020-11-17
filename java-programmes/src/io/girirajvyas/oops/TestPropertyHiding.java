package io.girirajvyas.oops;

/**
 * Over-riding basically supports late binding . Therefore, which method will be
 * called is decided at run time.It is for non-static methods. Hiding is for all
 * other members (static methods , instance members, static members). It is
 * based on the early binding . More clearly , the method or member to be called
 * or used is decided during compile time.
 * 
 * When you make a variable of the same name in a subclass, that's called
 * hiding. The resulting subclass will now actually have both properties. You
 * can access the one from the superclass with super.var or
 * ((SuperClass)this).var. The variables don't even have to be of the same type;
 * they are just two variables sharing a name, much like two overloaded methods.
 * 
 * References:
 * https://stackoverflow.com/questions/10722110/overriding-member-variables-in-java
 * https://stackoverflow.com/questions/10594052/overriding-vs-hiding-java-confused
 * 
 * @author giri
 * 
 */
public class TestPropertyHiding {
	
	public static void main(String ags[]) {
		Parent b = new Child();
		//Child b = new Child();
		//((Parent) b).draw();
		b.drawIsInstanceMethod();//here method of child will be called
		b.moveIsStaticMethod();
		System.out.println(b.a);// 
	}
}
