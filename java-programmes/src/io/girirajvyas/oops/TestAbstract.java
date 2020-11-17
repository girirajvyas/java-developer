package io.girirajvyas.oops;

public class TestAbstract {
	
	public static void main(String[] args) {
		MyAbstractImplementor impl = new MyAbstractImplementor();
		System.out.println(impl.substract(5, 3));
		System.out.println(impl.add(5, 3));
	}
}
