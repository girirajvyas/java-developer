# clean code (Java)

> The code you write has 2 users  
> 1. End user i.e people using it
> 2. Developers maintaining it
> We should consider the need of both the users


Comments are code smells which could have been avoided with a better method name
Unit Tests are better than documentation.

## Module 1: Naming
1.1 Naming
Garage Service story: 
dont use I for interface


## Module 2: Functions
less parameters in funcion


# Unit test

 - Program must be written for people to read, and only incidentally for machines to execute.
 - Write Tests for People
 - So who should you be writing the tests for?
   - For the person trying to understand your code.
   - Avoid Re-Factoring in Test class as it will make it hard to read
   - Good tests act as documentation for the code they are testing
  - Very many people say TDD when they really mean, 'I have good unit tests'("I have GUTs?"). - Alistair Cockburn (The modern programming professional has GUTs)
    - GUTs - Good Unit Tests
  - A unit test is test of behaviour whose success or failure is wholly determined by the correctness of the unit under test.555

# clean design (Java)

## 4 principles of simple design
Coined by kent beck

What are principles?
 - Run All tests
 - Minimize duplication
 - Maximize clarity
 - Keep it Small

Why?
 - With Agile, XP and specially LEAN where we focus on reducing waste, main focus is on today's requirement and keeping things simple. YAGNI (You Aint gonna need it)

### Run All tests

 - Any system that is built should work (Obviuously!!!)
 - Design evolves (It is not created)
   - Without automated tests, developers would be reluctant to improve design
 - Testable code leads to better design
 - TDD is proven to produce testable code

### Minimize duplication

 - Changing code at a later point of time becomes hard
 - more testing for the duplicated code

### Maxiize clarity

 - Better naming conventions or methods and variables
 - Follow clean code in summary or single responsibility to be precise

### Keep it small

 - Effort involved in getting anything perfect is really high
 - If the effort you put in does not yield significant returns, do we need to put that efforts?
 - If any new component(package, class, method) does not help in improving clarity or reducing duplication, thing again if it is needed
   - new level of indirection introduces additional complexity

## Technical Debt
The cost of prioritizing fast delivery over code quality for long periods of time

Fast Delivery  
 - Easiest fix/change
 - Fast
 - Poor written code

Code quality:  
 - Takes more time
 - Adds a bit of complexity
 - Maintainable

## Saving the day with Solid

The SOLID principles were first conceptualized by Robert C. Martin in his 2000 paper, [Design Principles and Design Patterns](https://fi.ort.edu.uy/innovaportal/file/2032/1/design_principles.pdf). These concepts were later built upon by Michael Feathers, who introduced us to the SOLID acronym.

> If it looks like a duck, quacks like a duck, but needs batteries - you probably have the wrong abstraction.   
> - SOLID motivational poster

Tutorial:
SOLID Software Design Principles in Java by Dan Geabunea

##Overview
Pyramid of clean code
1. Continous refactoring
2. TDD
3. Design Patterns
4. SOLID


4. SOLID
Acronym for 5 software design principles that help us to keep the technical debt under control

S - Single Responsibility (class or module having single responsibility are easy to maintain)
O - Open to extension and closed to modification ()
L - Liskov substitution principle (If a class is inheriting a parent class, it should implement all the methods){a child should be able to replace the parent}
I - Interface saggregation principle (multiple )
D - Dependency inversion ()

Top Benefits:
1. Easy to understand and reason about
2. changes are faster and has minimal risk level
3. Highly maintainable over long period of time
4. Cost effective

.... other ways to keep your architecture clean is Constant refactoring, Design patterns and Unit testing (TDD)

### Problems that appear when SOLID principles are not used
Code fragility:
Fragility is the tendency of the software to break many every time when it is changed

Code rigidity:
Rigidity is the tendency for the software to be difficult to change, even in simple ways.
Every chane causes a cascade of subsequent changes in dependent modules

"Fragility and Rigidity are symptoms of high technnical debt"

**Cost of change and customer responsivness increases with time should be taken into consideration**

## SRP: Single Responsibility Principle

What is SRP?
"Every function, class or module should have one and only one reason to change" - SRP
  Always identify the reasons to change that your components have and reduce them to a single one.
  
Why use SRP?
 - Testing – A class with one responsibility will have far fewer test cases and hence easy to test
 - Lower coupling – Less functionality in a single class will have fewer dependencies
 - Organization – Smaller, well-organized classes are easier to search than monolithic ones

**What do you mean by one responsibility? and what is 1 reason to change?**  

Identify multiple reasons to change:  
1. if statements -> 
2. Switch statments 
3. Monster methods
4. God classes (Utils classes having different logics) -> solution is to create specific classes for dat, logging, DB, etc

## OCP: Open/Closed Principle

## LSP: Liskov Substitution principle

What is LSP?
1. If S is a Subtype of T, then objects of type T in a program may be replaced with Object of type S without modifying the functionality of the program
2. Any Object of type must be substitutable by objects of a derived type without altering the correcteness of that program.

Relationships

IS-A 
SQUARE is a kind of Rectangle
Ostrich is a bird

Is Substitutable by:
is class rectangle fully substitutable by class square?

**LSP Summary**  
Empty methods, type checking and hardened preconditions are signs that you are violating the LSP
LSP also applies for interfaces, not just for class inheritence.
most times you can vreak incorrect type hierarchy by breaing it.

Real life categories do not always map to OOP relationships

## ISP: Interface saggregation Principle

What is LSP?

Where it can be used?

** 1. Modularizing abstractions with the ISP**  
Clients should not be forced to depend on methods that they do not use.
The "Interface" word in the principle name does not strictly mean a java interface


## Other Principles
DRY: Dont repeat yourself  
It is an Integral part of Clean Code  

What it is?  
It states "Don't Write the code that does the same thing twice. i.e you should not write code doing the same thing at multiple places"  

Why should I follow?
Because if you repeate your logic at multiple places, In case any change is required you have to go to all the places and update. And as humans are supposed to do error you can miss at 1 of the place and introduce a bug ultimately.  

KISS: Keep it simple stupid  

Tell, Dont Ask  

YAGNI  (basis of LEAN)  

Association, Aggregation and Composition
UML: http://aviadezra.blogspot.com/2009/05/uml-association-aggregation-composition.html



# References: 
**SOLID:**  
 
 - https://blog.cleancoder.com/uncle-bob/2014/05/08/SingleReponsibilityPrinciple.html
 - https://blog.cleancoder.com/uncle-bob/2014/05/12/TheOpenClosedPrinciple.html
 - https://martinfowler.com/bliki/TellDontAsk.html
 - https://groups.google.com/g/comp.object/c/WICPDcXAMG8?pli=1
 - https://stackabuse.com/object-oriented-design-principles-in-java/
 - Anti-Solid: https://speakerdeck.com/tastapod/why-every-element-of-solid-is-wrong
 - Anti-Solid Response: https://blog.cleancoder.com/uncle-bob/2020/10/18/Solid-Relevance.html
 - https://www.edureka.co/blog/solid-principles-in-java/
 - https://www.baeldung.com/solid-principles
 
Books:
 - Clean Code: A Handbook of Agile Software Craftsmanship by Robert C. Martin 
 - Top 9 qualities of Clean Code by Pawel Bejger
 - 97 things every programmer must know - Gerard meszaras
 