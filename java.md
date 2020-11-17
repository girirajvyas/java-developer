# Architecture
1. JVM architecture  
2. Where does local, class variables, methods, threads are initialized in memory  
3. Garbage collection and its changes in different versions of Java  
4. What if we instantiate the same Object in finalize() method?    

# General
1. Principal concepts of OOPS?  
2. Different forms of Polymorphism?  
3. Difference between Overloading and Overriding?  
4. Access Modifiers/Specifiers in Java?
5. Difference between String, StringBuffer and StringBuilder?  
6. Is java pass by value or pass by reference? swap 2 numbers by passing them in method and changing references
7. What are the packages that you used in java?     
8. Methods in Object class?
9. If Child extends Parent and as every class extends Object, How is it possible? 
10. Object Lifecycle (from new to garbage collection)  
11. Can I instantiate Abstract class and Does it have constructor?  
12. Difference between Interface and Abstract class, and when should I use what?  
13. Difference between Comparable and Comparator  
14. final, finally and finalize()?

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

### java 8
**List all Java 8 (Released 18th March 2014) Features**  

       a. default and static methods in Interface  
       b. Lambda Expression and Functional Interfaces  
       c. forEach() method in all Collections (via static method in Iterable Interface)  
       d. Streams for Bulk data operation on Collections  
       e. Date time API (based on Joda Time)  
       f. Memory space and garbage collection improvement  
       g. Comparator interface with lot of util metods  
       h. performance improvement in Map
   
**What are defender methods and why they were introduced in Java?**  
   **Default/Defender/Virtual extension method:**  
     default methods in Interface were allowed to make changes to the existing API without actually breaking them.
     If we see Collections API, Same Interface has been implemented by many implementations, adding even a single method in interfaces results in breaking all the existing implementing classes. default method came to rescue here that lets defining the default implementation at one place which will be available for all implementations.  
     **e.g.:** `forEach()` and `spliterator()` methods added to `java.lang.Iterable`. Because of this change, these methods are available in all the collection API implementing Iterable.  
     **Ref:** https://dzone.com/articles/introduction-default-methods
   
   **static methods:**  
     These methods are same as static methods in Class.  
     Use: Create a Utility Interface instead of class having all the static methods, as anyway you do not need to initialize the class having all the static methods.  
   
**How diamond problem is avoided in Java after addition of Interface as a class can implement any number of Interface?**  
    

** Relation between Functional Interface and Lambda expressions?**  

** Lambda is implemented at Compiler level or JVM level?**  
Ref: https://stackoverflow.com/questions/29143803/java-lambdas-how-it-works-in-jvm-is-it-oop  
     https://blog.overops.com/compiling-lambda-expressions-scala-vs-java-8/

Java 8 Summary:
SUMMARY:-
 - With the introduction of Java 8, functional Programming(Style of programming that treats computation as functions/expressions and avoid changing state) has been introduced in the Java Langauge . 
 - Java 8 has introduce Lambda Expression to bring the benefits of functional Programming in java, Lambda is just a nameless function, which means it does not have name, return Type and access modifier. 
 - Java 8 has introduce Functional Interface to bring the use of lambda expression. Functional Interface is having Single Abstract Method(SAM) in it. To mark an interface Function an annotation has been introduce i.e. @FunctionInterface. 
 - Java 8 has also added method Reference which enables us to define lambda expressions by referring to methods name directly.
 - Java 8 has also introduce default concrete methods and static methods inside interface. 
 - Java 8 has introduce java.util.function package which consititue all functional interfaces like Predicate, Function, Supplier, Consumer, BinaryOperator, UnaryOperator.
 - Java 8 has introduce stream functionality with java.util.stream package– which contains classes for processing sequence of elements. This is done by Stream pipeline chaining - Syntax:- source. 0 or more Intermidiate Operation. Terminal operation. Intermediate operation like - filter, map, skip, peek, sorted, distinct etc while  Terminal operation like for each(Consumer), reduce, collect, toArray, findFirst, findAny, count etc.
 - Java 8 has added a final class Optional in java.util package, which helps us to write neat code without worrying about too many null checks.
 - Java 8(HotSpot 1.8) has also removed PremGen memory space and introduce MetaSpace just to avoid java.lang.OutOfMemoryError.
 - Java 8 has introduced Nashorn javascript engine, which is a java based engine for executing and evaluting java Script Code.
 - Java 8 has also added java.time packages to enhance java Date and Time Api features.

  Big o notation - Time complexity -> no of loops
                 memory allocation

### Java Versions
# Java SE 8:
Java 8 was released on 18 March 2014. The code name culture is dropped with Java 8 and so no official code name going forward from Java 8.

New features in Java SE 8  
Lambda Expressions  
Pipelines and Streams  
Date and Time API  
Default Methods  
Type Annotations  
Nashhorn JavaScript Engine  
Concurrent Accumulators  
Parallel operations  
PermGen Error Removed  
TLS SNI  

# Java Version SE 7
Code named Dolphin and released on July 28, 2011.  

New features in Java SE 7  
Strings in switch Statement  
Type Inference for Generic Instance Creation  
Multiple Exception Handling  
Support for Dynamic Languages  
Try with Resources  
Java nio Package  
Binary Literals, underscore in literals  
Diamond Syntax  
Automatic null Handling  

# Java Version SE 6  
Code named Mustang and released on December 11, 2006.  
  
New features in Java SE 6  
Scripting Language Support  
JDBC 4.0 API  
Java Compiler API  
Pluggable Annotations  
Native PKI, Java GSS, Kerberos and LDAP support.  
Integrated Web Services.  
Lot more enhancements.  

# J2SE Version 5.0
Code named Tiger and released on September 30, 2004.  
  
New features in J2SE 5.0  
Generics  
Enhanced for Loop  
Autoboxing/Unboxing  
Typesafe Enums  
Varargs  
Static Import  
Metadata (Annotations)  
Instrumentation  
  
# J2SE Version 1.4  
Code named Merlin and released on February 6, 2002 (first release under JCP).  
  
New features in J2SE 1.4  
XML Processing  
Java Print Service  
Logging API  
Java Web Start  
JDBC 3.0 API  
Assertions  
Preferences API  
Chained Exception  
IPv6 Support  
Regular Expressions  
Image I/O API  
  
# J2SE Version 1.3  
Code named Kestrel and released on May 8, 2000.  
  
New features in J2SE 1.3  
Java Sound  
Jar Indexing  
A huge list of enhancements in almost all the java area.  
  
# J2SE Version 1.2  
Code named Playground and released on December 8, 1998.  
  
New features in J2SE 1.2  
Collections framework.  
Java String memory map for constants.  
Just In Time (JIT) compiler.  
Jar Signer for signing Java Archive (JAR) files.  
Policy Tool for granting access to system resources.  
Java Foundation Classes (JFC) which consists of Swing 1.0, Drag and Drop, and Java 2D class libraries.  
Java Plug-in  
Scrollable result sets, BLOB, CLOB, batch update, user-defined types in JDBC.  
Audio support in Applets.  
  
# JDK Version 1.1  
Released on February 19, 1997  
  
New features in JDK 1.1  
JDBC (Java Database Connectivity)  
Inner Classes  
Java Beans  
RMI (Remote Method Invocation)  
Reflection (introspection only)  
  
# JDK Version 1.0  
Codenamed Oak and released on January 23, 1996.  