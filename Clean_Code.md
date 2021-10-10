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
 
 
 ##Overview
Pyramid of clean code
1. Continous refactoring
2. TDD
3. Design Patterns
4. SOLID