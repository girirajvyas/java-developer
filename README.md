# java-developer

I have tried to collect and consolidate the topics that you can read in java and the order in which you can start learning them. I know their can never be an exhaustive list that covers everything about java. This is just to cover the tip of an iceberg.

You can follow files in the repo in following order

 - java_versions.md (you can do setup and then read this as well, these are interchangable)
 - java_setup.md
 - [ds-algo-java](https://github.com/girirajvyas/ds-algo-java) (Read only if you are starting up and need to setup basics)
 - hierarchy.md (this will give you hierarchy of major classes used in the Java)
 - java_collections.md (if you read the hierarchy beforehand then you know what you are going to expect here)
 - java.md (different topics/questions and their explaination)
 - java8.md (different topics/questions and their explaination)
 
On high level, we can have the topics as below:
Java:
 - Setup
  - JDK, JRE, JVM 
  - java_versions
  - jre folder removed in java 14?
  - user variable vs system variable
 - Internals
   - JVM
     - JVM architecture
     - lass loader
   - JMM
     - Memory management -> Garbage collection
     - Types of garbage collector
     - Garbage Collection
 - Basics:
    - OOPS Principle, 
    - immutability (key in hashMap example) 
    - Final vs Effective Final
    - Variable hiding
    - how to write you own annotation
    - Types of reference:
        - phantom reference -> Why finalize() method is deprecated on java 9
        - escape reference
    - finally vs finalize
    - static block vs initialization block vs constructor
 - Comparable vs comparator
 - Serializable (static and transient) and externalizable
 - Cloning
    - Deep Copy vs Shallow Copy?  
    - Why do we need to clone?  
    - Default java implementation?     
    - How to Clone Object in Java?  
 - String
   - String s = "abc", where does this is store in memory
   - String Constant Pool
   - Why Immutable
 - Collections
    - New collection added in latest version
    - Difference between different collections
    - Internal of Treemap? -> Comparable and comparator
    - Time complexity of various collections
    - Working of hashmap
    - Hashmap vs concurrentHashMap vs synchronizedHashMap
    - How to get unmodifiable collection/Snychronosed
    - Arraylist(synchronized: copyOnWriteArrayList) vs LinkedList(when to use which one) 
    - Set internal working
    - Sorting of HashMap on values ?
    - Benefit of arrayDeque vs Stack
    - Concurrent hash map and vs Collections.synchronizedmap
    - Arraylist (Random Access) vs Linkedlist (Sequential Access) Differences
        - Insertion order difference?
    - Iterator.remove
      - Iterator fail fast
    - ConcurrentHashMap working -> segments -> how locking is implemented (Re-entant lock)
    - Treemap vs LinkedHashMap
    - Linkedlist:
         - Check Circular LinkedList or check if for loop in linkedlist - Sliding window solution
         - Intersection point in 2 linkedlist 
 - Concurrency
    - Executor framework
    - Thread start and run
    - Threading
     - Semaphore
     - locks
     - Locking
     - CompletableFutures
    - semaphore / countdown latch/ cyclic barrier/ exchanger
    - Inter thread communication
    - start vs run
    - Wait notify notifyall -> 
    - Internal vs external locks
    - Synchronized vs lock
    - Write a program for deadlock
    - try with resource (Autoclosable)
    - Marker interface () 
    - Detect deadlock (heapdump, jconsole)
    - Execurtor framework
    - submit vs execute
    - future and callable
    - Train booking -> how to create thread
      -> Executor framework -> AtomicInteger
      -> Countdownlatch vs semaphore
    - Readonly request multithreading required?
    - https://www.baeldung.com/mdc-in-log4j-2-logback
    - Race condition ()
    - Volatile or AtomicInteger (algorithm used by atomicInteger)
    - Countdownlatch
    - callable, future (why future.get used when it is a blocking call), new non-blocking one added is CompletableFuture, practical use
    - permgen vs metaspace and what is benefit of removing this
    - Threadpool 
    - volatile uses which memory area
    - ConcurrentHashMap working -> segments -> how locking is implemented (Re-entant lock)
    - Stampedlock
    - Bounded context
    - polling vs listener, polling vs observer
 - Exception:
    - Exception hierarchy(Inheritance) 
    - Write custom exception
    - extends RuntimeException vs extends Exception
    - Multiple catch
    - Exception Handling:
       - try with resource
       - try and finally only
       - try catch and finally sequence
       - Connection close (try.. catch) -> try with resource -> Autocloseable (close) method
    - Stackoverflow vs Outofmemory 
    - NoClassDefError vs CLassNotFoundException
    - instanceOf vs getCLass()
 - Latest Version enhancements (java 11 13)

Java 8
 - Optional.of vs Optional.ofNullable
 - Spliterator vs Iterator (Internal vs Exernal iterator)
 - StampedLock -> concurrentadders -> accumulators
 - List new methods - replaceall vs sort
 - java.util.concurrent.locks.Condition usage
 - StringJoiner
 - final variables in inner classes
 - Method references (Call by value example)
 - Immutable class
 - findAny, findFirst
 - lambda
 - https://beginnersbook.com/2017/10/java-8-arrays-parallel-sort-with-example/
 - List all Java 8 Features  
 - What are defender methods and why they were introduced in Java?   
 - How diamond problem is avoided in Java after addition of Interface as a class can implement any number of Interface?  
 - Relation between Functional Interface and Lambda expressions?  
 - Lambda is implemented at Compiler level or JVM level?  
 - Functional Interfaces added by Java in java.util.function with their use?  
 - lambda expression use and code?  
 - Functional Interface, give example of Runnable, Comparator?  
 - Stream api and any use case?  
 - collectors in java 8?  
 - distinct, sort and frequency example? 

Process
 - Code review process
 - Coding standards
 - release process

Design:
 - Disign patterns (GoF) -> state, visitor, builder, Builder, Template method
   - Singleton/protype/factory/AbstractFactory/builder
 - Design principle (SOLID, DRY, KISS, YAGNI)
    - Solid: 2 patterns to achieve liskov substitution principle
             - break the inheritance/patterns
             - tell dont ask
 - Microservices architecture patterns
 - Cohesion vs Coupling | Association vs aggregation vs composition
 - Code snippet to identify the pattern (Factory pattern)
 - Thread safe singleton
 - Immutable class
 - system design for stock exchange sysytem
 - He asked me to design Uber Cab service. He gave me an instant that there are 5 lakh drivers and they all are sending a request to the server & database at a particular time. He asked how can you manage these requests efficiently. I gave answers by using the concepts of Load Balancer, Sharding, Master Slave etc. and he was pretty much happy to listen the concepts.(https://www.geeksforgeeks.org/write-interview-experience/)
 - Working of log analyzer

 
Spring:
 - Core:
  - New Scope is spring
 - Boot:
    - DispatcherServlet -> 
    - @SpringBootApplication details
    - @Autoconfiguration works?
    - Swagger
    - Logging
    - Exception Handling (@ControllerAdvice)
    - Actuator
    - @EnableConfuration internal working 
 - Security:
 - Data:
 - Cloud: 

NFRs:
 - Scalability
 - Resilient
 - High availability
 - Security
   - Burrp
   - Owasp top 10 
   - 1 way ssl 2 way ssl
 - connection pooling
 - transaction management

REST:
 - SOAP vs REST (JAX-WS and JAX-RS)
 - HTTP questions: Origin port
 - Http status, Idempotent, CORS -> option method
 - Design a api
 - Versioning and naming conventions
 - Exception handling in REst
 - Return type conversion from xml and json
 - Security
 - Swagger
 - CORS
 - Options call
 - Request Lifecycle
 - RequestParam vs 
 - https://stackoverflow.com/questions/56729786/difference-between-idempotent-and-safe-http-methods-in-rest-apis
 - Put vs Post (idempotent)
 - Http safe methods?
 - What is patch (patch vs put)
 - What is Restful?
 - Why rest is Stateless?
 - Why rest lightweight?
 - How to maintain session rest?
 - Custom datatype?
 - E-Tag?
 - put vs patch?
 - Implement security in Rest?
 - Rest methods and which one is idempotent?
 - Which Framework you have used and why?
 - How did you configure the said framework?
 - How did you handle CORS?
 - Authentication in Rest? OAUTH/OAuth2/Basic
 - Exception Handling in Rest?
 - Custom Response 200 even if there is exception?
 - API Documentation? Springfox-swagger2
 - Code for any of the Rest call?
 - What are the annotations that are from Spring and which are form JAX-RS ?
 - Stateless vs StateFul SOAP vs REST
 - Spring Implementation:  @Controller vs @Restcontroller, @ResponseBody vs RequestBody, @Path vs @RequestMapping
 - Jersey Implementation: Json to object in rest jersey implementation?

SOAP
 - Which SOAP-WS did you use?  
 - Which annotations are used to create WS?  
 - What happens if I do not annotate a method with @WebMethod?  
 - Where do I specify the url for WS?  
 - How will this ws will be called?  
 - envelope in Soap

Authentication types:
 - OAuth
 - Basic

Micro-services:
 - Why 2 phase commit cannot be used
 - Scalability (Scalecube)
 - Decomposition -> Migrate Monolith to microservices
 - How you manage Interservice communication and transaction (SAGA or {CQRS with event emitter})
 - Server side discovery vs client side discovery
 - https://microservices.io/articles/scalecube.html
 - failfast microoservices
 - https://blog.risingstack.com/designing-microservices-architecture-for-failure/
 - Scale cube
 - CAP Theorem
 - disadvantages of Microservices

ORM
 - join vs join fetch in sping data jpa

Hibernate
 - Session vs SessionFactory?  
 - Is Session/SessionFactory Thread-Safe? if Yes/No Why?
 - Proxy Object in Hibernate?
 - How ORM Works?  
 - Object life-cycle?    
 - LazyInitializationException?
 - What is LazyLoading in Hibernate?  
 - What are the types of cache?  
 - Why their is caching? Why do we need Secondary cache(Advantages)?  
 - One-to-One, One-to-many, many-to-many configurations and real time scenarios?  
 - Composite key mapping in hibernate entity?  
 - Use of NativeQuery?  
 - SQL vs HQL?  
 - How to execute store procedure in Hibernate?  
 - Pagination with Hibernate?  
 - Inheritence in Hibernate?
 - Why to use hibernate over jdbc?  
 - Which collections can be used in it?  
 - How to define a field that is not a prime key as auto increment in entity?  
 - What is CLOB-BLOB?  
 - What is lazy initialization?  (FetchType.EAGER vs FetchType.LAZY)
 - Dirty checking in hibernate?  
 - Second level cache and use case?  
 - merge Vs update  
 - save vs saveorupdate vs persist  
 - get vs load?  
 - What is hibernate proxy(get vs load)
 - Transaction management in hibernate?  
 - Transactional  - with propagation and isolation

Database:
 - NoSql 
 - In memory db
    - memcache
    - Hazelcast (Caching)
    - Redis
 - Different Joins
 - Sum of salary by department query (Employee, Salary table)
 - Joins (inner and outer join)?  
 - Triggers and its uses?    
 - Indexes and its uses?  
 - Normalization of DB?  
 - Find second(nth) max value of column?  
 - Oracle vs MS SQL Server vs Sybase (syntax differences)?  
 - Group by having query
 - Vertical scaling and horizontal scaling
 - Relational DB vs NoSql DB

Java Messaging Systems:
 - topics vs ques

Unit testing

CI/CD

Algorithms and datastructures
Find duplicate in unsorted array:
 - Sort and find dupplicate
 - Bitset algorithm (Time and space complexity inversion)
 - HashMap -> (put value and count) or HashSet (returns true if value exists)
 - Negate all elements and sum approach

Linkedlist:
- Check Circular LinkedList or check if for loop in linkedlist - Sliding window solution
- Intersection point in 2 linkedlist 

Find missing and duplicate if you have list from 100 to 10,000
 - Bitset algorithm
 - Hashmap

Problem:Integer Array having duplicates -> non duplicated record and original sequence should be maintained
Solution: LinkdedHashMap

Problem: 
Stream:
List<Fruits> = ["Banana", "Banana", "Apple", "Mango", "Apple", "Mango"]
Find repeated -> 
Put in key, value -> HashMap

Problem:
Polymorphism
Parent p = new Parent()
Parent p = new child()
child c  = new Parent()
child c = new child()
*static method cases


SDLC
 - Waterfall
 - Agile 
   - Estimates
   - Scrum
   - Kanban
 - Lean
 
Miscellaneous (Glovo):
 - Horizontal scaling vs Vertical scaling
 - JVM -> Type of memory/ garbage collection
 - How will you find space time complexity of a given code
 - Process vs thread
- SQL vs No SQL
- Monolith vs microservices (Advantages and disadvantages)
- When do you have stackoverflowerror and how do you resolve this
- time complexity for inserting an element in arraylist and linkedlist
- HashTable?
- How do you design an api
- SOLID Principles
- api design
- code revw
- StackOverflowError

Angular  
 - Why Angular?  
 - Shared module in Angular?  
 - Request, Response Interceptor?  
 - Advantage of Observable over Http?  
 - Advantage of modularization in Angular?  
 - Difference between ui route and ng route?  
 - Isolated scope in Angular?  
 - default scope in directive
 - bind
 - Angular 1 vs 2 and now 10 
 - Protractor  
 - Input output  
 - Transquolation  
 - DTD  
 - Document types  
 - Mocking Json data  
 - Chaining  
 - Strict mode dependency injection
 - Directives vs components (Example)
 - Inter component Communication: (@Input/@Output) (via Service annotated with @Injectable) [# for modal] 

Other  
 - Intro to Vue.js?  
 - $ and JQuery
 - connection pooling
 - transaction management
 - ionic vs phonegap

Java Script  
 - Call and apply bind in JS?  
 - Prototype and Prototype chain?  
 - Inheritence prototype?  
 - Closure?  
 - Array Function?  
 - Variable scopes (in closure as well)?  
 - Highest order function, first class function  
 - Pure function and impure function  
 - Function composition  
 - is javascript object oriented language  
 - javascript vs java  
 - Context switching  
 - add, multiply, divide in JS  
 - new type in ES6  
 - Difference ES6 and TypeScript?   
 - Generators   
 - Abstract and interface in ES6  
 - this?  
 - $scope and scope