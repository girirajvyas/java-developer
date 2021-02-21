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