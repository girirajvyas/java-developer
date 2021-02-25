# java versions

This place is to consolidate all the major version changes that occur in Java with a timeline
# Summary

- java 7
  - invokeDynamic
  - 
- java 8
  - Lambda 
  - Along with functional interfaces that has SAM
    - Function -> apply method
      - UnaryOperator
    - Predicate -> test
    - Consumer -> accept
    - Supplier -> get
  - Streams introduced for processsing the data
    - Intermediate operations:
      - map
      - flatmap
      - peek
      - limit
      - skip
      - filter
      - distinct
      - sorted
    - Terminal Operations
      - collect
      - reduce
      - findFirst
      - FindAny
      - anymatch
      - nonMatch
      - allMatch
      - min
      - max
      - count
      - foreach
      - foreachordered
      - toArray
- Java 9 - Sept 2017
  - Project Jigsaw (No JRE folder)
  - .of method to get Immutable collections
  - Streams api has:
    Intermediate:     
      - dropWhile
      - takeWhile
      - iterate
    - ofNullable - creation method
  - JShell
  - Money and Currency api
  - G1GC default GC
  - Deprecate CMS: https://openjdk.java.net/jeps/291
  - AOT COmpilation:
    - Ahead-of-Time Compilation - https://openjdk.java.net/jeps/295
       - Above depens on:Java-Level JVM Compiler Interface - https://openjdk.java.net/jeps/243
- Java 10 - March 2018
  - Timeline changed from here: Time based release versioning https://openjdk.java.net/jeps/322
  - var keyword
  - Java based JIT compiler Experimental Graal - https://openjdk.java.net/jeps/317
  - Parallel Full GC for G1: https://openjdk.java.net/jeps/307
- Java 11 - Sept 2018
  - Deprecate Nashorn JavaScript engine that was introduced in java 8
  - ZGC garbage collector introduced
- java 12: - March 2019
  - Shenandoah GC
  - Switch expressions Preview-1
- java 13: - Sept 2019
  - Switch expressions Preview-2
  - Text blocks-preview-1
- java 14: March 2020
  - Helpful NullPointerExceptions: https://openjdk.java.net/jeps/358
  - Switch expressions-standard
  - instanceOf improvements
  - Text blocks-preview-2
  - Remove CMS GC
- Java 15: Sept 2020
  - Sealed classes - preview
  - Text blocks - 
  - Records - second preview
- Java 16 March 2021

## Java 14
 - Sealed classes
 - Record - https://openjdk.java.net/jeps/359 - preview (Final https://openjdk.java.net/jeps/395)
 - Remove CMS (deprecated in java 9)
 - Switch Statements
 - improved nullpointer

## Java 12
 - Shenandoah GC


## Java 11

 - Deprecate Nashorn JavaScript engine that was introduced in java 8
 - ZGC garbage collector introduced

## Java SE 10

**New features in Java SE 10**  
 - Time based release versioning
 - var keyword

## Java SE 9

At JavaOne 2011, proposed to release java 9 in 2016  
     Early 2016, rescheduled for March 2017 and again postponed to July 2017
        Finally, released on **21st September 2017** 

Also, In September 2017, Mark Reinhold, chief Architect of the Java Platform, proposed to change the release train to **"one feature release every six months"** rather than the current two-year schedule at that time, and later the proposal took effect.

**New features in Java SE 9**  
 - JEP 222: JShell
 - Project jigsaw (https://stackoverflow.com/questions/46388117/where-is-jre-folder-in-java-9)
 - Money and currency Api
 - .of in list,set and map
 - Streams api enhancement

https://beginnersbook.com/2018/04/java-9-features-with-examples/

## Java SE 8:

**Release date:** 18 March 2014 (03/2014)
**Code name:** The code name culture is dropped with Java 8 and so no official code name going forward from Java 8.

**New features in Java SE 8**  
 - Lambda Expressions  
 - Pipelines and Streams  
 - Date and Time API  
 - Default Methods  
 - Type Annotations  
 - Nashhorn JavaScript Engine  
 - Concurrent Accumulators  
 - Parallel operations  
 - PermGen Error Removed  
 - TLS SNI  

## Java Version SE 7

**Relase date:** July 28, 2011 (07/2011)  
**Code name:** Dolphin  

**New Features**  
 - Strings in switch Statement  
 - Type Inference for Generic Instance Creation  
 - Multiple Exception Handling  
 - Support for Dynamic Languages  
 - Try with Resources  
 - Java nio Package  
 - Binary Literals, underscore in literals  
 - Diamond Syntax  
 - Automatic null Handling  


Lambda (Java's implementation of lambda functions), Jigsaw (Java's implementation of modules), and part of Coin were dropped from Java 7, and released as part of Java 8 (except for Jigsaw, which was released in Java 9).

## Java Version SE 6  

**Relase date:** December 11, 2006 (12/2006)  
**Code name:** Mustang  

**New features**  
 - Scripting Language Support  
 - JDBC 4.0 API  
 - Java Compiler API  
 - Pluggable Annotations  
 - Native PKI, Java GSS, Kerberos and LDAP support.  
 - Integrated Web Services.  
 - Lot more enhancements.  
 - G1 was first introduced as an experimental option in Java SE 6 Update 14 (Experimental)
 
## J2SE Version 5.0

**Relase date:** September 30, 2004 (09/2006)  
**Code name:** Tiger  

**New features**  
 - Generics  
 - Enhanced for Loop  
 - Autoboxing/Unboxing  
 - Typesafe Enums  
 - Varargs  
 - Static Import  
 - Metadata (Annotations)  
 - Instrumentation  

## J2SE Version 1.4  

**Relase date:** February 6, 2002 (02/2002)  
**Code name:** Merlin  
**Trivia:**
 - first release under JCP
**New features**  
 - XML Processing  
 - Java Print Service  
 - Logging API  
 - Java Web Start  
 - JDBC 3.0 API  
 - Assertions  
 - Preferences API  
 - Chained Exception  
 - IPv6 Support  
 - Regular Expressions  
 - Image I/O API  

## J2SE Version 1.3  

**Relase date:** May 8, 2000 (05/2000)  
**Code name:** Kestrel  
**New features**  
 - New features in J2SE 1.3  
 - Java Sound  
 - Jar Indexing  
 - A huge list of enhancements in almost all the java area.  
  
## J2SE Version 1.2  

**Relase date:** December 8, 1998 (12/1998)  
**Code name:** Playground  
**New features**  
 - Collections framework.  
 - Java String memory map for constants.  
 - Just In Time (JIT) compiler.  
 - Jar Signer for signing Java Archive (JAR) files.  
 - Policy Tool for granting access to system resources.  
 - Java Foundation Classes (JFC) which consists of Swing 1.0, Drag and Drop, and Java 2D class libraries.  
 - Java Plug-in  
 - Scrollable result sets, BLOB, CLOB, batch update, user-defined types in JDBC.  
 - Audio support in Applets.  
  
## JDK Version 1.1  
**Relase date:** February 19, 1997 (02/1997)  
**Code name:**   

**New features**  
 - JDBC (Java Database Connectivity)  
 - Inner Classes  
 - Java Beans  
 - RMI (Remote Method Invocation)  
 - Reflection (introspection only)  
  
## JDK Version 1.0  
**Relase date:** January 23, 1996 (01/1996)  
**Code name:** Oak  


# References
 - https://www.javatpoint.com/java-versions
 - https://en.wikipedia.org/wiki/Java_version_history
 - https://medium.com/@hrishiraskar/java-versions-wise-feature-history-2fba2c59305e
 - https://www.marcobehler.com/guides/a-guide-to-java-versions-and-features
 - https://blog.ippon.tech/comparing-java-lts-releases/
 - https://howtodoinjava.com/java-version-wise-features-history/
 - https://www.javatpoint.com/java-versions
 - https://howtodoinjava.com/java14/helpful-nullpointerexception/
 - Java official roadmap: https://www.oracle.com/java/technologies/java-se-support-roadmap.html
 - openjdk: https://blog.joda.org/2018/09/time-to-look-beyond-oracles-jdk.html?showComment=1536303755275#c5934330550793525320
 - https://www.petefreitag.com/item/911.cfm