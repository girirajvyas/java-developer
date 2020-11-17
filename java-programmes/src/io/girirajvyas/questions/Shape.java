package io.girirajvyas.questions;

public class Shape {

	private String name;
	static Shape shape2;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("correct main");
		Shape shape1 = new Shape("shape1");
		shape2 = shape1;
		createNewShape(shape2);
		System.out.println(shape2.getName());
	}

	public static void createNewShape(Shape shape) {
		shape = new Shape("i m new shape");
	}

	public static void main(int[] args) {
		System.out.println("wrong main");
	}
}
