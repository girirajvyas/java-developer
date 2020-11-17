package io.girirajvyas.questions.pojo;

public class Parent {
	
	public Parent(){
		System.out.println("In Parent Constructor");
	}
	
	public void m1(){
		System.out.println("in parent : m1");
	}
	
	public void someOtherMethod(){
		System.out.println("someOtherMethod of Parent");
	}
	
	public Integer add(Integer a, Integer b){
		System.out.println("Integer implementation");
		return a + b;
	}
	
	public Integer add(String a, String b){
		System.out.println("String implementation");
		return 5;
	}
	
	public int add(int a, int b){
		System.out.println("int implementation");
		return a + b;
	}
	
	
}
