package io.girirajvyas.questions.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Java8Test {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student s = new Student();
		
		Student s1 = new Student();
		s1.setAge(20);
		
		list.add(s1);
		list.stream().
				filter(s::isAgeGreaterThan18).forEach(x -> System.out.println(x));
		
	
		//Optional<Student> empStudent3 = list.stream().filter(s -> s.getAge()>18).findAny();
	}
}
