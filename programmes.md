# Questions with code 
https://github.com/girirajvyas/java-programmes/tree/master/java-programmes/src/io/girirajvyas/questions 

# Other Questions
Find the max element in array, second max element in a array.?  
`int i[] = {4, 5 , 8 , 9, 3};`

Output of below Code
```
try{
	int i = 10/0;
}catch (Exception){
		//or int i = 10/0;
		System.out.println("Exception caught");
}finally {
		System.out.println("Finally");
}
System.out.println("NOw");
```

Output of below Code
```
public class Employee {
	public Employee()
  private int empId;
	//getter
	//setter
	
	//no hashcode and equals
}

psvm(){
	HashSet set = new HashSet();
	set.add(1);
	set.add(1);
}
```

Output of below Code
```
Public class Animal {
	public static(in one case) void move(){

	}
}
Public class Dog extends Animal {
		public/protected/private void move(){

		}
}

Dog d = new Dog();
d.move();
```

Can we override static method? If no whether it will be runtime error or compile time?  
Ans: this instance method cannot override the static method from parent  

If I have a student class with int id and String name and I put this in hashMap/TreeMap what will happen?  

Apply encapsulation in your Employee class?    

Overriding: A a = new B(); a.i; a.j; // i is in A j is in B  

Can two Threads access two methods of same class simultaneously?  
  ```
    class Employee{
      void methodA(){

      }
      void methodB(){

      }
    }
  ```
a: Now I have two threads ThreadA and ThreadB, ThreadA wants to access methodA and ThreadB wants to access methodB, is it possible at the same time?  
  Ans: It is possible only if one is static so that it will acquire class level lock and other is non static and hence it will acquire instance level   lock
b: if I make both methods static but not synchronized, Then can they access it simultaneously? Yes  
c: if 1 method is static and another is non static?  

What will happen in below case?
```
<bean id = "123" class = "Employee">
<bean id = "456" class = "Employee">
```
Ans: it will work fine as a new instance with 456 is created for Employee class.
