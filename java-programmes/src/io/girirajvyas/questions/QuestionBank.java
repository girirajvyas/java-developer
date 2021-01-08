package io.girirajvyas.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import io.girirajvyas.questions.pojo.Child;
import io.girirajvyas.questions.pojo.Employee;
import io.girirajvyas.questions.pojo.EmployeeId;
import io.girirajvyas.questions.pojo.EmployeeLoginSystem;
import io.girirajvyas.questions.pojo.InnerClassDemo;
import io.girirajvyas.questions.pojo.Parent;

/**
 * Group of Questions related to multiple topics
 * 
 * @author giri
 *
 */
public class QuestionBank {

	public static void main(String[] args) {
		question21();
	}

	public static void question1() {
		class Fib {
			int count = 1;

			public int fibo(int n) {
				System.out.println("Hello" + count + " value recieved of n from parameter : " + n);
				count++;
				return (n < 3) ? 1 : fibo(n - 1) + fibo(n - 2);
			}
		}
		new Fib().fibo(8);
	}

	public static void question2() {

		class Employee {
			int id, age;

			public Employee(int id, int age) {
				this.id = id;
				this.age = age;
			}

			@Override
			public int hashCode() {
				return id + age;
			}

			@Override
			public boolean equals(Object obj) {
				return this.hashCode() == ((Employee) obj).hashCode();
			}

			public String toString() {
				return this.id + " : " + this.age;
			}
		}

		Map<Employee, String> map = new HashMap<>();
		Employee thirdEmployeeToRemove = null;

		for (int i = 0; i < 20; i++) {
			Employee emp = new Employee(i, i);
			map.put(emp, "Employee" + i);

			if (i == 3)
				thirdEmployeeToRemove = emp;
		}

		thirdEmployeeToRemove.age *= 3;
		System.out.println(map.get(thirdEmployeeToRemove));
	}

	public static void question3() {
		final List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			list.add(i);
		}

		new Thread() {
			@Override
			public void run() {
				for (int i : list) {
					System.out.println(i);
				}
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				/*
				 * for(int i : list){ if(i ==50){ list.remove(i); } }
				 */
				// Above code causes ConcurrentModificationException
				for (int i = 1; i <= 100; i++) {
					if (i == 50) {
						list.remove(i);
					}
				}
			}
		}.start();

	}

	public static void question4() {
		try {
			System.out.println("inside try");
			throw new Exception();
		} catch (Exception e) {
			int i = 10 / 0;
			System.out.println("inside catch with value if i as" + i);
		} finally {
			System.out.println("inside finally");
		}
	}

	public static void question5() {
		class A {
		}
		class B extends A {
		}
		class C extends A {
		}

		A[] arr = new B[10];
		// arr[0] = new A();// java.lang.ArrayStoreException:
		// org.test.CdkGlobal$1A
		arr[1] = new B();
		// arr[2] = new C();// java.lang.ArrayStoreException:
		// org.test.CdkGlobal$1C

		System.out.println(arr.length);
	}

	public static void question7() {
		abstract class A {
			int a = gun();

			abstract int gun();

			int fun() {
				return 100;
			}
		}

		class B extends A {
			int b = fun();

			int gun() {
				return b;
			}
		}

		B obj = new B();
		System.out.println(obj.a + obj.b);
		// Edited to see exact values
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

	public static void question9() {
		int i = 0;
		while (Integer.valueOf(i) == Integer.valueOf(i))
			;
		{
			i++;
		}
		System.out.println(i);
	}

	public static void question10() {
		final List<Integer> myList = new ArrayList<>();
		myList.add(10);
		myList.add(10);
		System.out.println(myList.size());
	}

	public static void question11() {
		List<? extends Object> list = new ArrayList<>();
		// list.add("test");//the method is not applicable for type string
		// list.add(new Object());

		List<String> list1 = new ArrayList<>();
		list1.add("test");
		list1.add(new String());
		// list1.add(new Object());

	}

	public static void question12() {
		Parent p = new Parent();
		p.m1();
		System.out.println(p.getClass());
		// p.m2();//method m2 is undefined for type parent

		Parent p2 = new Child();
		p2.m1();
		System.out.println(p2.getClass());
		// p2.m2(); //method m2 is undefined for type parent

		// Child c = new Parent();//Cannot convert from parent to child
/*
		Child c1 = new Child();
		c1.m1();
		c1.m2();*/

	}

	public static void question13() {
		// Add method of Set takes Object, Hence it will work for HashMap
		Set hashSet = new HashSet<>();
		hashSet.add("Test");
		hashSet.add(1);
		System.out.println(hashSet);

		// TreeSet Compare its keys to sort and when it tries to compare
		// String and Integer it gets ClassCastException
		Set set = new TreeSet<>();
		set.add("test");
		set.add(1);
		System.out.println(set);
	}

	public static void question14() {
		// As we have new object created every time and HashCode is not
		// overridden hence we will have output as 4
		Map<Employee, String> myMap = new HashMap<Employee, String>();
		myMap.put(new Employee(new EmployeeId(1, "1")), "Employee1");
		myMap.put(new Employee(new EmployeeId(2, "2")), "Employee2");
		myMap.put(new Employee(new EmployeeId(1, "1")), "Employee1");
		myMap.put(new Employee(new EmployeeId(1, "1")), "Employee1");
		System.out.println("myMap size is :" + myMap.size());

		// print all the records inserted above
		Set<Entry<Employee, String>> entrySet = myMap.entrySet();
		Iterator<Entry<Employee, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<Employee, String> emp = itr.next();
			System.out.println(emp.getKey().getEmpId().getKin() + "   " + emp.getValue());
		}

		// now we will have only one instance and insert same object as key 4
		// times with different values, O/P is 1 with last entry as O/P
		Employee emp = new Employee(new EmployeeId(1, "1"));
		Map<Employee, String> myMapCheck = new HashMap<Employee, String>();
		myMapCheck.put(emp, "test Emp");
		myMapCheck.put(emp, "test Emp1");
		myMapCheck.put(emp, "test Emp2");
		myMapCheck.put(emp, "test Emp3");
		System.out.println("myMapCheck size is : " + myMapCheck.size() + " with value as " + myMapCheck.get(emp));
	}
	
	public static void question15(){
		Employee employee = new Employee();
		employee.setEmpId(new EmployeeId(48320, "Giri"));
		
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(employee);
		
		employee.setEmpId(new EmployeeId(48322, "Giriraj"));
		set.add(employee);
		
		System.out.println(set.size());
	}
	
	public static void question16(){
		Parent p = new Child();
		p.add(Integer.valueOf(5), Integer.valueOf(5));
		//p.add(null, 4);
		p.m1();
		Parent c = (Parent)p;
		c.someOtherMethod();
		
		Parent p1 = new Parent();
		Child c1 = (Child) p1;
		c1.someOtherMethod();
	}
	
	public static void question17() {
		EmployeeLoginSystem system = new EmployeeLoginSystem(1001, "Giri", "V");
		system.increment();
		
		EmployeeLoginSystem system2 = new EmployeeLoginSystem(1003, "raj", "V");
		system2.increment();
		
		EmployeeLoginSystem system3 = new EmployeeLoginSystem(1002, "Giriraj", "V");
		system3.increment();
	}
	
	public static void question18(){
		try{
			int data = 30/0;
			System.out.println("I survived");
			return;
		} catch(ArithmeticException  e){//it was below in question
			System.out.println("Exception 1");
			return;
		} catch (Exception e){
			System.out.println("Exception 2");
		} finally{
			System.out.println("Finally Block");
		}
		
		System.out.println("Thank You");
	}
	
	public static void question19(){
		//how to access variable form inner class
		InnerClassDemo demo = null;
	}
	
	public static void question20(){
	  List<Integer> list = Arrays.asList(1,2,3,4,5);
	  Optional<Integer> element = list.stream().filter(e -> e == 5).findFirst();
	  System.out.println(element); 
	}
	
	public static void question21() {
	    Map<EmployeeForMap, String> map = new HashMap<>();
	    EmployeeForMap employeeToRemove = null;

	    for (int i = 0; i < 20; i++) {
	    	EmployeeForMap emp = new EmployeeForMap(i, i);
	        map.put(emp, "Employee" + i);
	    
	        if (i == 3)
	            employeeToRemove = emp;
	    }

	    employeeToRemove.age *= 3;
	    System.out.println(map.get(employeeToRemove));
	}
}