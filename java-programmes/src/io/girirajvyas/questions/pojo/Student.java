package io.girirajvyas.questions.pojo;

public class Student {
	
	private int age;

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	boolean isAgeGreaterThan18(Student student) {
	    return student.getAge() > 18;
	}
}
