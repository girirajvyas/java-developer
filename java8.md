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
 
 - Filter : is used for filtering the data , it always returns the Boolean value . If it returns true , the item is added to list else its filtered out.
  - Takes Predicate (functional interface)
 - Map : is used for transforming the object values .
   - Takes Function(functional interface) as input.
 - FlatMap:
 
è Distinct
 
è Sorted
 
è Peek
 
è Limit
 
è Skip
 
ref: https://www.leveluplunch.com/java/examples/stream-intermediate-operations-example/
 
Terminal operations on Stream:
 
Short circuit operation
 
Default methods(Defender methods):






type inference - done by Java compiler to define type
https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html  
method reference - ::     


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