package io.girirajvyas.oops;

public abstract class MyAbstract {

	abstract void calc();
	
	public MyAbstract() {
		calc();
	}

	public int add(int a, int b) {
		calc();
		return (a + b);
	}

}
