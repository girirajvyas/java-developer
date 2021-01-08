# DataStructures and Algorithms using Java

## Introduction
It is always good to understand the datastructures that are available and then learning the different algorithms for Sorting and Searching.

**Topics Covered:**
 - What is Datastructures
 - What is an algorithm?
 - Big O Notation

**Data Structures / Abstract data types**  
 - Arrays
 - Lists
 - Stacks
 - Queues
 - HashTables
 - Trees
 - Heaps
 - Sets

**Algorithms**
 - Search Algorithms
 - Sort Algorithms
 - Recursion
 
Format
 - Theory
 - Code a simple implementation
 - Example from JDK

** Datastructures Introduction**
- Organizes and stores data
- Each has streangths and Weakness
- Their is no perfect DS and hence knowing them all is very important

> The fact is, there aren't just two sides to any issue, there's almost always a range of responses, and "it depends" is almost always the right answer in any big question. - Linus Torvalds (Linux inventor)

**Depends on:**
 - Data you want to stores
 - how you are going to access that data
 - operations application is going to perform

**Algorithms Introduction**

"Describes the steps you have to perform to accomplish a task"

`Important`:
 - Not an implementation it just provides the steps to perform
 - We can have multiple implementation for the same algorithm
    - There can be many algorithms that accomplish the same task
    - There can be many implementations of the same algorithms


## Big-O notations

**Wiki**

 - Big O notation is a mathematical notation that describes the limiting behavior of a function when the argument tends towards a particular value or infinity.
 - Big O is a member of a family of notations invented by `Paul Bachmann`, `Edmund Landau`, and others, collectively called `Bachmann–Landau notation` or `asymptotic notation`
 - Used to classify algorithms according to how their `run time or space requirements` grow as the input size grows
 - The letter O is used because the growth rate of a function is also referred to as the order of the function. 
 - A description of a function in terms of big O notation usually only provides an upper bound on the growth rate of the function.

**Pre-requisites:**

 - `Size of input:` we call it “n”. So we can say things like, we have a function which takes a parameter of an array of integers. Then the input here refers to the array.  
 - `The rules:` In big O analysis, it only cares about the code that grows the fastest as the input grows, because everything else eclipsed(big O analysis is also called asymptotic analysis).  

**How to compare performance:**

`In Layman way:`  
 - Run 1 implementation and record the start time and end time then find the execution time by taking the difference
 - Repeat the same for another algorith to find the time taken for execution
 - Now you can compare the results of the above two
Does they portray the correct picture of their performance? **Not exactly.**  
As it also depends on the hardware it is being run, it will have the different results on different machines, and hence we cannot consider this way to compare our algorithms.

`How it should be done then?`  
Next, We can check the number of steps it takes to run and we call this as time complexity or check the amount of memory it takes to run an algorithm and consider that. just to summarize:

**Two types of complexities:**
 - `Time Complexity:` Steps involved to run an algorithm
 - `Space/memory complexity:` Amount of memory it take to run an algorithm

Both these complexities can be represented in "Big O notation", Below are the few representations:  

  |  Big O       | Description                          |
  | -------      | -----------                          |
  | O(1)         | Constant                             |
  | O(Log n)     | Logarithmic (with Log to the base 2) |
  | O(n)         | Linear                               |
  | O(n x Log n) | Linear x Logarithmic (n log-star n)|
  | O(n^2)       | Quadratic                            |
  | O(n^c)       | Polynomial                           |
  | O(2^n)       | Exponential                          |
  | O(n!)        | Factorial                            |

Where,
**n** - increases without bound
**c** - a positive constant 

Note: These are sorted from best to worst. Hence Constant is the best case and factorial is the worse.
Pronounciation: `O of 1` or `O of Log n`

**Graph from Wiki**  
Graphs of functions commonly used in the analysis of algorithms, showing the number of operations N versus input size n for each function

**Tip for Logarithmic Complexities:**  
 Lets start with log value of different numbers:  
 Log 1 = 0,  
 Log 10 = 1,  
 Log 100 = 2,  
 Log 1000 = 3,  
 Log 10000 = 4,  
 Log 100000 = 5  
 As we can see value of log is the number of zeroes it has.  
 
 Hence, **Log of any value between Ten Thousand and 1 Lakh will lie between 4 and 5**   
 e.g.: Log(50,000) = 4.698970004  
 
 Above comparison will help you in deciding the correct value for algorithms having Logarithmic complexity  
 
**Performance comparison (for very large values of n i.e n -> infinity ):  
 O(1) < O(Log n) < O(n) < O(n*Log n) < O(n^2) < O(2^n) < O(n!)**
 
 Ref: O(n) vs O(n*Log n)  
 https://stackoverflow.com/questions/21489701/on-log-n-vs-on-practical-differences-in-time-complexity

## Time vs Space Complexity
 
 Example 1:
 ```java
  for (int i=0; i < n; i++) {
    System.out.println("Giri");
  }
 ```
 Time Complexity: O(n)  
 Space Complexity: O(1)    
 
 Example 2:  
 ```java
 List<Integer> newList = new ArrayList<>();
 for (int i=0; i < n; i++) {
   newList.add(i);
 }
 ```
 Time Complexity: O(n)  
 Space Complexity: O(n)   
 
Ref: 
 - https://stackoverflow.com/questions/18686121/differences-between-time-complexity-and-space-complexity/18686162 

## Arrays

 - Arrays in Java

Arrays as a DataStructures

 - Stored as one Contiguous block in memory. 
 - By specifying the length at start we tell JVM to block that much continous memory/space for storing the same
 - Every element occupies the same amount of space in memory
 - Array of object contains the reference to those object and hence they will be of same size as well
 - If an array starts at memory address x, and the size of each element in the array is y, we can calculate the memory address of the ith element by using the following expression: `x + i*y`
 - If we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array.

> Arrays are good in case you know the index from where to retrieve the element


Big-O values for Array Operations

1. Retrieve the element from an array:

 - Multiply the size of the element by its index
 - Get the start address of the array
 - Add the start address to the result of the multiplication

Hence, total number of steps is 3. Lets have an example:

|Number of elements                                            |Steps to remove          |
|------------------------------                       |---------                |
| 1                                 | 3    |
| 1000                                 | 3    |
| 100000                                 | 3    |
| 10000000                                 | 3    |


2. Operations and its time complexity:

|Operation                                            |Time Complexity          |
|------------------------------                       |---------                |
| Retrieve with index                                 | O(1) - Constant time    |
| Retrieve without index                              | O(n) - Linear time      |
| Add an element to a full array                      | O(n)- via creating a new array larger than existing, copy existing elements, dn add new element                   |
| Add an element to a the end of an array (has space) | O(1)                    |
| Insert or update an elemet at a specific index      | O(1)                    |
| Delete an element by setting it to null             | O(1)                    |
| Delete an element by shifting elements              | O(n)                    |
2. Disadvantages

 - Good only if we know the index of value, if not then you have to iterate to find the element

Ref:
 - https://medium.com/@albertkoz/why-does-array-start-with-index-0-65ffc07cbce8
 - https://www.geeksforgeeks.org/why-array-index-starts-from-zero/

## Sort Algorithms

### Introduction

**Bubble Sort:**
 - Performance degrages quickly as the number of elements increases thare to be sorted
 - Commonly taught algorithm, but not a good option for large datasets
 - It is In-place algorithm (i.e constant memory and does not increase with number of elements)
 - O(n^2) time complexity (i.e quadratic)
 - In case we have to take example, it will take:
    - 100 steps to sort 10 items
    - 10,000 steps to sort 100 items
    - 10,00,000 steps to sort 1000 items

|0  |  1 |   2 | 3 |  4 | 5 |  6  | 
|20 | 35 | -15 | 7 | 55 | 1 | -22 |

Code Example: 





## Search Algorithms
  * Linear/Sequential Search
  * Binary Search
     * via divide and conquer
     * via recursion

**Performance Summary:**  

|  Algorithm       | Best Time Complexity | Worst Time Complexity | Space Complexity |
| ---------------- | -------------------- | --------------------- | ---------------- |
|  Linear Search   |                      |                       |                  |
|  Binary Search   |         O(1)         |       O(Log n)        |      O(1)        |


## Sorting Algorithms 
  * Quick Sort
  * Merge Sort
  * Bubble sort

**Performance Summary:**  

|  Algorithm       | Best Time Complexity | Worst Time Complexity | Space Complexity            |
| ---------------- | -------------------- | --------------------- | ----------------            |
|  Bubble Sort     |                      |          O(n^2)       |  O(1) - In-place algorithm  |
|  Quick Sort      |                      |                       |                             |
|  Merge Sort      |                      |                       |                             |
|  Selection Sort  |                      |                       |                             |
|  Insertion Sort  |                      |                       |                             |

# References:
Shift Operators
 - https://www.quora.com/Why-is-there-no-unsigned-left-shift-operator-in-Java

Big-O:
 - https://medium.com/@zoebai_70369/big-o-notation-time-and-space-complexity-305a1e301e35

