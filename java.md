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

Java 8 features:
 
Optionals: Optional is a way of replacing a nullable T reference with a non-null value. An Optional may either contain a non-null T reference (in which case we say the reference is “present”), or it may contain nothing.
Ex:
Optional<Integer> canBeEmpty1 = Optional.of(5);
canBeEmpty1.isPresent();    // returns true
canBeEmpty1.get(); //returns 5
 
Optional<Integer> canBeEmpty2 = Optional.empty();
canBeEmpty2.isPresent(); //returns false
 
 
There are 3 major ways to create an Optional.
i) Use Optional.empty() to create empty optional.
Optional<Integer> possible = Optional.empty();
ii) Use Optional.of() to create optional with default non-null value. If you pass null in of(), then a NullPointerException is thrown immediately.
Optional<Integer> possible = Optional.of(5);
possible.ifPresent(System.out::println);//prints 5
iii) Use Optional.ofNullable() to create an Optional object that may hold a null value. If parameter is null, the resulting Optional object would be empty (remember that value is absent; don’t read it null).
Optional<Integer> possible = Optional.ofNullable(null);
//or
Optional<Integer> possible = Optional.ofNullable(5);
 
The default no-args constructor is define private, so you can’t create an instance of Optional except 3 given ways above.
 
Please note that Optional is not meant to be used in these below contexts, as possibly it won’t buy us anything:
·         in the domain model layer (it’s not serializable)
·         in DTOs (it’s not serializable)
·         in input parameters of methods
·         in constructor parameters
Streams vs. Collections :
A Collection is an in-memory data structure, which holds all the values that the data structure currently has—every element in the Collection has to be computed before it can be added to the Collection. A Stream is a conceptually fixed data structure, in which elements are computed on demand. This gives rise to significant programming benefits.
àStream operations are either intermediate or terminal. While terminal operations return a result of a certain type, intermediate operations return the stream itself so you can chain multiple method calls in a row. 
 
Different ways to build streams:
1) Using Stream.of(val1, val2, val3….)
public class StreamBuilders {
     public static void main(String[] args){
         Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
         stream.forEach(p -> System.out.println(p));
     }
}
2) Using Stream.of(arrayOfElements)
public class StreamBuilders {
     public static void main(String[] args){
         Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
         stream.forEach(p -> System.out.println(p));
     }
}
3) Using someList.stream()
public class StreamBuilders {
     public static void main(String[] args){
         List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         Stream<Integer> stream = list.stream();
         stream.forEach(p -> System.out.println(p));
     }
}
4) Using Stream.generate() or Stream.iterate() functions
public class StreamBuilders {
     public static void main(String[] args){
         Stream<Date> stream = Stream.generate(() -> { return new Date();});
         stream.forEach(p -> System.out.println(p));
     }
}
5) Using String chars or String tokens
public class StreamBuilders {
     public static void main(String[] args){
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.println(p));
         
        //OR
         
        Stream<String> stream = Stream.of("A$B$C".split("\\$"));
        stream.forEach(p -> System.out.println(p));
     }
}
 
Converting streams to collections
 
 
Types on Functional interfaces :
 
Function : Represents a function that accepts one argument and produces a result.
 
Predicate : Predicate a functional interface and can therefore be used as the assignment target for a lambda expression or method reference. you can use them anywhere where you need to evaluate a condition on group/collection of similar objects such that evaluation can result either in true or false.
Ex: public static Predicate<Employee> isAdultFemale() {
    return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
}
 
 
Consumer :
 
Supplier :
 
Operator :
 
Lambda Expressions:
 
Intermediate operations on Stream:
 
Filter : is used for filtering the data , it always returns the Boolean value . If it returns true , the item is added to list else its filtered out.
Takes Predicate (functional interface)
 
Map : is used for transforming the object values .
Takes Function(functional interface) as input.
FlatMap:
 
Distinct
 
Sorted
 
Peek
 
Limit
 
Skip
 
ref: https://www.leveluplunch.com/java/examples/stream-intermediate-operations-example/
 
Terminal operations on Stream:
 
Short circuit operation
 
Default methods(Defender methods):


Types on functional interfaces:
 
1.    Function :
 
2.    Predicate :
 
3.    Consumer :
 
4.    Supplier:
 
5.    Operator:
 
Lambda Expressions:
 
Intermediate operations on Stream:
 
è Filter : is used for filtering the data , it always returns the Boolean value . If it returns true , the item is added to list else its filtered out.
-       Takes Predicate (functional interface)
 
è Map : is used for transforming the object values .
-       Takes Function(functional interface) as input.
è FlatMap:
 
è Distinct
 
è Sorted
 
è Peek
 
è Limit
 
è Skip
 
ref: https://www.leveluplunch.com/java/examples/stream-intermediate-operations-example/
 
Terminal operations on Stream:
 
Short circuit operation
 
Default methods(Defender methods):


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



type inference - done by Java compiler to define type
https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html  
method reference - ::     



## JMM

Java Memory Model (JMM) is a specification which guarantees visibility of fields(aka happens before) amidst reordering of instructions.

1) Out of order execution (Performance driven changes done by compiler, JVM or CPU)
	a = 3
	b = 1

2) Field Visibility (In presence of multiple threads a.k.a Concurrency)
   volatile keyword ensures that values is pushed from the local cache to shared cache and hence can be used in multi threaded environment
   
3) "Happens before" relationship 
    for volatile, synchronized keyword, Locks, Concurrent collections, Thread Operations(Join, Start), final fields.

## JVM

Open points
1.       Validate the flow
2.       Resolve in Linking flow
3.       Reason for Meta-space

Class loader Sub system
1.       Loading
Bootstrap -> rt.jar
Extension -> ext folder in Java installation folder (C:\Program Files\Java\jdk1.8.0_172\jre\lib\ext)
Application -> your project classes

2.       Linking
Verify: .class is valid or not (Verify Error)
Prepare: static variables is assigned memory and default value (Java 7: method area & java 8: meta space (part of heap only))
Resolve: resolve dependencies

3. Initialization
Initialization: static variables will be assigned original values and static block call

Runtime data Areas(Memory)
1. Method Area
class level data and static variables
Not thread safe
Note: Java 8 Meta space is there instead of Method Area

2. Heap Area
Objects
Instance variables
Not thread safe

3. Stack area
Per thread memory assigned (stack created for each thread)
Thread safe
LVA: local variable array
OS: operand stack
FD: frame data


Polymorphism

Parent p = new Parent()
Parent p = new child()
child c  = new Parent()
child c = new child()


## HashMap
There are few concepts that we should understand first before starting hash-map
hashCode: it is an integer value that uniquely identifies the key
contract between equals and hashCode: 

Quick story:
 - You go to chemist for buying a Disprin 
 - He checks the name and goes back to search for it
 - There are shelf available, he went there and start searching for box with D written on it.
 - He pull out the box and starts searching for disprin
 - Takes out the disprin and gives it back to you.

Same is the working of hash map.
 - Just replace name of medicine i.e disprin with key
 - And box of medicine with buckets
 - You write a hashcode that will act as a key to find the box containing value
 - once you find that box you use equals method to check if it is the correct one and return.

A new word that you encountered in this story id hashcode. Now, what exactly is this hash code.
It is a unique number that helps you in finding the bucket easily.

1. What is hashing
2. contract between equals and hashcode
3. Hash based
4. bucket = table = array
5. Entry<> this is declared in map and implemented in hashmap, entry has pointer to next entry


Two scenarios:

```java
public int hashCode(){
  return 1;
}

public boolean equals(){

}
```

## Java 8
Features:
Lambda expression - > Intro to functional programming (concentrate on what to do and not How to do)
Lambda Expression vs Functional Interface vs Method Reference

Less implementation
- forEach() method in Iterable interface
- default and static method in interface

Functional Interfaces:

@FunctionalInterface
public interface Function<T, R> {
    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    R apply(T t);
}

## GC 
C++ -> manuaaly free memory
Java -> Garbage collector does it for us

GC's main purpose is to Free unreferenced objects from heap memory

Person p = new Person(); // the object created here is eleigible for GC
Person p = new Person();

Island of isolation: memory dangling between 
https://www.geeksforgeeks.org/island-of-isolation-in-java/ 

Teacher1 has Teacher2 class reference
Teacher2 has Teacher1 class reference

classs Teacher1 {
   Teacher2 teacher2;
}

classs Teacher2 {
   Teacher1 teacher1;
}

Finalize() method

how to make objects eleigible for GC
1. nullify reference variables
2. Re-assign reference variable to new variable
3. local oject created inside method
4. island of isolation

5 memory spaces:

class area : static class members
method area : method related info
heap : all dynamic memory allocations
stack: local variables inside methods
pool: Undeletable objects -> check all immutable objects are here or not?

Ways to Delay in object destruction
1. increase memory 
2. Create object using singleton class
3. recreate object in finalize method

JVM has impl of GC (you can create your own by adhering to specification)
Hotspot JVM (check the other implementations)

Oracle HotSpot is most common JVM
Matore GC options

How GC works:
Step 1:
Unreferenced ojects are marked and made ready for GC

Step 2:
delete marked object

Step 3:
Optional step : Contraction

--------------------
Generational strategy for gc: i.e on the basis of age

Division of heap memory:
https://betsol.com/java-memory-management-for-java-virtual-machine-jvm/
https://blog.overops.com/improve-your-application-performance-with-garbage-collection-optimization/ 

1. young generated (minor GC)
     Eden 
     2 Survivor (S1 and S2 )
2. old generation (Major GC)
3. permanent generation: stores metadata about classes (classes not in use will be removed)
   - Till java 7 and was removed in java 8 and metaspace is introduced
   
GCs in HotSpot JVM
Serial GC: All GC events are conducted in serial manner (Stop the world event) -> after every gc contraction
Parallel GC: Minor GC multiple threads / Major GC single thread and STW event -> contraction only in old space -> more stop the world processes (Not good for GUI)
    -> Parallel old - Major GC also has multiple threads
    -> Parallel new - Major GC single thread and STW event
Concurrent MarkSweep: same as parallel old + no contraction (good for GUI) 
G1 (Garbage first - introduced in jdk7): replacement of cms

Performance Tuning / GC Tuning
 - It can be achieved by providing flags to JVM
 - Tools: Jstat, etc
 - misconception is jvm has 1 GC only.

Serial GC:
- Simplest GC
- Not used much
- Freezes all application threads when it is working
- Not elegible for server environment
- Flag: -XX:+UseSerialGC
- 

---> Open questions:
Number of JVMs in case of 5 applications?
 - Thread schedulers?
How stop the world is handled in above scenario?

Spring vs Java Singleton?
Memory Leak because of db connection?
Reflection
Volatile ->

## JVM

JVM architecture by Ashutosh
JVM - load and run java applications
Vm?
JVM?

JDK = JRE + dev tools
JRE = JVM + Libs(JDBC + JNDI + ....)

.class file  --->  Class LOader sub-system

Java nativemethod interface -> hashcode?

Class loader subsytem:
Loading - NoClassDef Error
Linking - Verification - properly formatted (Bytecodeverifier) - Failed (verify error is child of LinkageError)   
        - preparation - allocates memory in Method area to static variables and assigns default value
        - resolution - symbolic references are replaced with actual reference
Initialization - all static values will be assigned  original values (all static blocks executes: top to bottom, parent to child)

Types of ClassLoader:
Bootstrap cass loader (Premordial) - loads classes from bootstrap class path i.e jdk/jre/lib
Extension class loader - loads classes from extension class path i.e jdk/jre/lib/ext
Application|System class loader - loads classes from application path (build path)

Delegation hierarchy: Application -> Extension -> Bootstrap
check if .class present in MEthod area

Memory Types
Method Area: 
 - created at JVM startup
 - class level info
 - statiic variables initialized
Heap Area: 
  - shared among all threads
  - Objects and instance variables
  - As Arrays are objects they are stored here
  - Runtime class - > Runtime.maxMemory
  - configured via -Xmax, -Xms
Stack Area:
  - Main thread is created
  - all local   

Questions:
java command in JDK or JRE?
Wat is java runner
ClassNotFoundException vs NoClassDef Error?
Can classes be private
use of protected class?
static identifier for class?
how many class file will be generated if a file has 2 classes and you compile it?
default value of char?
Customized class loader? why?
Weblogic?
file name class name should be same or not? and related questions 
Thread safe vs not thread safe
Race cindition vs deadlock
---> Memory monitoring ?
stack frame
JDK vs OPENJDK JVM

Memory error:
```
# There is insufficient memory for the Java Runtime Environment to continue.
# Native memory allocation (malloc) failed to allocate 32744 bytes for ChunkPool::allocate
[thread 28056 also had an error]
```

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

# Setup

 - JDK
   - Oracle JDK
   - Oracle OpenJDK
   - AdoptOpenJDK
   - Azul zulu
   
 - IDE
   - Eclipse
   - STS (Curated specifically for Spring development with Eclipse at base)
   - Intellij Idea

Note: Make sure you download the correct bit version i.e 64 bit or 32 bit version depending on the operating system that you are using.


### Intellij Idea

Download:
 - Google Intellij Idea and go to downloads link or go to https://www.jetbrains.com/idea/download/#section=windows
 - You can Ultimate edition(PAID) or Community edition(FREE)
 - Detail comparison of both is given on the site. We download Community edition 
 - You can download .zip or .exe version. 
 - If you have downloaded zip you can install it directly and will be available for you
 - If you have downloaded zip, you have to extract the same and go to bin folder and click on idea.exe or idea64.exe depending on the operating system you are using.
 - On first startup, it will give you the option to import intellij Idea settings in case you have or select "Do not import settings option"

Customization at start:
 - Select theme (Dark or light) depending on your preference
 - Customize default plugins (keep defaults for starter unless you need anything specific from start)
 - Select featured plugins

Initial Setup:
 - You will be prompted with a default screen with 3 options:
    - + new Project
    - Open or import
    - Get from version control
 - Before doing any of above steps, we do 
 - Configure -> Structure for new project -> Project settings -> Project -> SDK -> Either select if available or add new by providing the path to JDK
 - Editor -> General 
   - Autoimport
     - Tick Checkbox
     - Tick Checkbox
   - Appearance
     - Tick Checkbox "Show line numbers"

# References: 
 - https://dzone.com/articles/jvm-architecture-explained
 - https://www.netjstech.com/2017/08/java-lambda-expressions-interview-questions.html
 - Effective java, Joshua Blosch - http://www.artima.com/intv/bloch14.html
 
 - Jython: https://www.ibm.com/developerworks/java/tutorials/j-jython1/j-jython1.html
 - Google analytics: https://doc.trizetto.com/display/CWSF540/Google+Analytics+Configuration
