# Architecture
 - JVM architecture  
 - Where does local, class variables, methods, threads are initialized in memory  
 - Garbage collection and its changes in different versions of Java  
 - What if we instantiate the same Object in finalize() method?    

# General
 - Principal concepts of OOPS?  
 - Different forms of Polymorphism?  
 - Difference between Overloading and Overriding?  
 - Access Modifiers/Specifiers in Java?
 - Difference between String, StringBuffer and StringBuilder?  
 - Is java pass by value or pass by reference? swap 2 numbers by passing them in method and changing references
 - What are the packages that you used in java?     
 - Methods in Object class?
 - If Child extends Parent and as every class extends Object, How is it possible? 
 - Object Lifecycle (from new to garbage collection)  
 - Can I instantiate Abstract class and Does it have constructor?  
 - Difference between Interface and Abstract class, and when should I use what?  
 - Difference between Comparable and Comparator  
 - final, finally and finalize()?

# Generics
Bound unbound in generics?  
```<? extends T>``` vs ```<? super T>```

# Design Related/ Design Patterns
How many design patterns GOF(Gang of Four) have defined and reason why design patterns are classified into three?  
SOLID design principles?   
What is immutable Why do we want an immutable class?  
How to make class Immutable?  
How to make class Singleton with clone scenario?  
Factory Design pattern  
Facade Design Pattern  
Publisher and Subscriber code (Producer consumer)  
Association vs Aggregation vs Composition  
Composition Over Inheritance?  

# Multi-Threading
## Normal Threading
Why object class has wait(), notify(), notiftAll() methods in Java?  
Difference between yield(), sleep() and wait()?  
Multi-Threading in Colections?  
What do you mean by synchronized?
What is this in synchronized block(this)
Class level and Object level synchronization  
BlockingQue?
What is concurrent counterpart for LinkedBlockingQueue?
What is dead-lock and write a code to show dead-lock?  
Difference between process and thread ?  
Threadlocal?  
WAP to print even odd numbers using thread (By using two threads)?  

## Executor Framework
What is Executor framework and Threadpool?  
Executor vs Executor Service vs ThreadpoolExecutor?  
Advantages of Executor framework over normal Threading?  
Difference between execute() and submit() method?  
Difference between shutDown() and shutDownNow() in Executor?
Futures?  
How to handle exception in case call() from Callable has returned exception?  
Calable vs Runnable?  

# Exception Handling 
Exception Hierarchy?  
What is Exception Handling and why do we us it?  
Use of finally Block?  
What needs to be done to create my userdefined exception class?  
Extends Throwable is better or Extends Exception?  
Custom runtime exceptions and how to call it?  

# Collections
Difference between array and arrayList?  
Different implementations of List, Set and Map?  
When should you use ArrayList and when should you use LinkedList?  
Write your implementation of LinkedList?  
Write a List having features(Advantages) of both LinkedList and ArrayList?  

Difference between HashSet and TreeSet?  
How Treeset Works?  

# Map
Which datastructure HashMap internally uses to store data?  
Difference between HashMap and HashTable?  
Can we have null key in HashMap/TreeMap/HashTable
Why hash-code is required? why overriding equals is not Sufficient?
How HashMap works in Java?  
How LinkedHashMap(it maintains insertion order) works in Java?  
How ConcurrentHashMap works in Java?  
How SynchronizedHashMap works in Java?  
Multimap(Not from Guava, write your implementation)
How to sort values in HashMap?
Map having list and objects?  
Spliterator and listiterator?   

# String
How many objects will be created for : String s = new String ("ABC"); 
Count the maximum number of repeated alphabets and print the alphabet with number of occurances?  

# Additional Info:
use of '_' as an identifier might not be supported in releases after Java SE 8

# Others
JMS? and why do we use it?  
Unit test framework?

# JDBC
Difference between statement and preparedStatement?  

# JSP Servlet
JSP implicit objects and which object has the shortest scope?  
forward vs send redirect?  
Difference between Jsp and Servlet?  
How to call servlet from another servlet?


# General Answers
**1. Principal concepts of OOPS?**  

   **A-PIE**  
   **A** - Abstraction (Hiding the implementation complexity)  
   **P** - Polymorphism (1 Interface many implementations, achieved with help of Overloading and Overriding)  
   
        a. method Overloading(**Compile Time Polymorphism**)  
        b. method Overriding(**Run Time**) through inheritance (Child extends Parent and Overrides color() method)  
        c. method Overriding(**Run Time**) through Interface (Multiple implementations, Mostly used in service and Dao layer)  

   **I** - Inheritance ( promotes code reuse via polymorphism)  
   **E** - Encapsulation ( data hiding via `private setters` that can have validation and `public getters` )  

   **Note:** Grady Booch in Object Oriented Analysis and Design
   > Abstraction and encapsulation are complementary concepts: abstraction focuses on the observable behavior of an object.encapsulation focuses upon the implementation that gives rise to this behavior. encapsulation is most often achieved through information hiding, which is the process of hiding all of the secrets of object that do not contribute to its essential characteristics

**2. Different forms of Polymorphism?**    
     *Compile Time:* Overloading  
     *Run Time:* Overriding  

**3. Difference between Overloading and Overriding?**  

  |             | OverLoading Method   |       Overriding Method                   |
  | ----------- | -------------------- | ----------------------------------------- |
  | Arguments   | **Must** Change      | **Must NOT** Change                       |
  | Return Type | **Can** Change       | **Can't** Change except for **Co-variants**|
  | Exceptions  | **Can** Change       | **Can reduce or Eliminate, Must not** throw newer or broader checked exceptions|
  | Access      |   **Can** Change     | **Can be less restrictive**               |
  | Invocation  | Reference type determines which overloaded version is selected. Happens at compile time|Object type determines which method is selected. Happens at runtime |

**4. Access Modifiers/Soecifiers in Java?**  
     Public  
     Protected (example `clone()` from `java.lang.Object`)  
     default (package private)  
     private  
     
**5. String vs StringBuffer vs StringBuilder?**  

  |  String                           |  StringBuffer                    |  StringBuilder                      |
  | --------------------------------- | -------------------------------- | ----------------------------------- |
  |  Immutable                        | Mutable                          | Mutable                             |
  |  Synchronized                     | Synchronized                     | Not Synchronized                    |
  |  use when text will not change    | use when in multi threaded env   | use when there is no multi-threading |

 **6. Is java pass by value or pass by reference? swap 2 numbers by passing them in method and changing references**
	Java is pass by value
	Example: https://github.com/girirajvyas/java-programmes/blob/master/java-programmes/src/io/girirajvyas/oops/TestPassByValue.java
	
**7. What are the packages that you used in java?**
    
  | Package name |      Use             |
  | ------------ | -------------------- |
  |  java.lang   | default package      | 
  |  java.util   |                      | 
  |  java.math   |                      |

**8. Methods in Object class?**
   There are total 9 methods in Object class and few of them can be clubbed together based on how they are used.  
     
   a. equals and hashcode (2)
     
```java
     public boolean equals(Object obj) {
        return (this == obj);
     }
    
     public native int hashCode();
```
   b. wait, notify and notifyAll (3)
   
```java
     public final void wait() throws InterruptedException {
        wait(0);
     }
     public final native void wait(long timeout) throws InterruptedException;
     public final void wait(long timeout, int nanos) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }
        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }
        if (nanos > 0) {
            timeout++;
        }
        wait(timeout);
     }
     
     public final native void notify();
     
     public final native void notifyAll();
```
   c. clone (1)

```java
      protected native Object clone() throws CloneNotSupportedException;
```
      
   d. toString (1)
     
```java
     public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
     }
```
   e. finalize (1)
   
```java
     protected void finalize() throws Throwable { }
```
   f. getClass (1)
   
```java
   public final native Class<?> getClass();
```

**9. If Child extends Parent and as every class extends Object, How is it possible?**
**10. Object Lifecycle (from new to garbage collection)**  
**11. Can I instantiate Abstract class and Does it have constructor?**  
       No, You cannot instantiate an Abstract class. Although even if you try to do new, you have to create anonymous inner class to provide the implementation of the abstract methods from abstract class 
Ref: https://stackoverflow.com/questions/260666/can-an-abstract-class-have-a-constructor   

**12. Difference between Interface and Abstract class, and when should I use what?**  
**13. Difference between Comparable and Comparator**  

**Association vs Aggregation vs Composition**  
Ref: https://www.baeldung.com/java-composition-aggregation-association  

**Composition Over Inheritance?**  
https://www.journaldev.com/12086/composition-vs-inheritance  
https://javarevisited.blogspot.com/2013/06/why-favor-composition-over-inheritance-java-oops-design.html  

### Cloning

   **Summary**
1. implements Cloneable
2. __super.clone__ throws **CloneNotSupportedException** if the CLass overriding clone method does not **implement Cloneable**  
3. override Object's clone method and call __super.clone()__
4. two types of cloning : **Deep copy** __vs__ **Shallow Copy**



1. implements Cloneable
  Cloneable is a **Marker interface**. A marker interface is an interface that does not contain any method. Its sole purpose is to tell the JVM that the class implementing this interface need the clone of it. Marker Interfaces are not written after JAVA 5 as they were replaced by Annotations after that.
  
2. __super.clone__ throws **CloneNotSupportedException** if the CLass overriding clone method does not **implement Cloneable**  
   Object class has protected clone method as below:
   ```
   protected native Object clone() throws CloneNotSupportedException;
   ```
   In order to create a clone we have to override this method and call **super.clone** expicitly,   which makes JVM to create copy for the specified object. But, for this it checks if the class overriding this method implements Cloneable interface or not, if not it throws **CloneNotSupportedException**
   
   3. override Object's clone method
   super.clone() creates copy of all the primitives and its Wrapper(i.e immutable classes) and assign it to the new Object.  
   So, Default behavior of super.clone() in this scenario works fine
   ```
   public Object clone() throws CloneNotSupportedException{
   		return super.clone();
   	}
   ```
  
 - Deep Copy vs Shallow Copy  
 - Why do we need to clone?  
 - Default java   
 - How to Clone Object in Java?  





Polymorphism

Parent p = new Parent()
Parent p = new child()
child c  = new Parent()
child c = new child()








# Concurrency

parallel vs concurrent
https://stackoverflow.com/questions/1897993/what-is-the-difference-between-concurrent-programming-and-parallel-programming

# SOAP
WSGEN vs WSIMPORT
To create a Web Service using the Java-WS specification, you need several artifacts. The porpuose of apt, wsgen and wsimport is to automate this procedure.

There are two ways to create a Web Service: Bottom-Up (First code, then WSDL) and Top-Down (First WSDL then code).

Buttom-Up approach:

apt: Uses source code, generates WSDL (and artifacts)
wsgen: Uses compiled code, generates WSDL (and artifacts)
Top-Down

wsimport: Uses the WSDL, generates java code for the service/client implementation.
The advantage of using apt is that having the source code the script will be able to get the parameters names and use them on the WSDL.

### Exception
        Throwable
             |
Exception             Error
  |
Runtime (No need to handle exception here)

1. Why to create custom Exception
   To have application specific Exceptions, For instance if you have any functional requirements and the condition does not pass, you throw customized FunctionalException to tell the end user that there is an issue Functionally with the error number.
   Example: TranZformFunctionalException
   
2. How will you create Custom Exception, Tell me when will you extend Throwable, Exception, Error, Runtime
   Depend on requirement
   extends Throwable: 
   extends Exception: 
   extends Error: 
   extends Runtime: 
   
3. NoClassDefFoundError vs ClassNotFoundException
4. Write one custom Exception


# References: 
 - https://dzone.com/articles/jvm-architecture-explained
 - https://www.netjstech.com/2017/08/java-lambda-expressions-interview-questions.html
 - Effective java, Joshua Blosch - http://www.artima.com/intv/bloch14.html
 
 - Jython: https://www.ibm.com/developerworks/java/tutorials/j-jython1/j-jython1.html
 - Google analytics: https://doc.trizetto.com/display/CWSF540/Google+Analytics+Configuration
 
 http://ocpj8.javastudyguide.com/ch01.html
