# java internals

 - JVM
 - JMM


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