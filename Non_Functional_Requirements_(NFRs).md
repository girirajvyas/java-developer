# Non Functional Requirements

[Wiki](https://en.wikipedia.org/wiki/Non-functional_requirement): In systems engineering and requirements engineering, a non-functional requirement (NFR) also known as a cross-functional requirement is a requirement that specifies criteria that can be used to judge the operation of a system, rather than specific behaviors.  
They are contrasted with functional requirements that define specific behavior or functions. The plan for implementing functional requirements is detailed in the system design. The plan for implementing non-functional requirements is detailed in the system architecture, because they are usually architecturally significant requirements.


 - http://highscalability.com/all-time-favorites/
    - http://highscalability.com/blog/2017/12/11/netflix-what-happens-when-you-press-play.html
 - Tech conferences - infocon (youtube)
 - Interview preparation sites: InterviewBit, Hackerrank, Codechef, Codingpane
    - leetcode
 - http://www.ardendertat.com/2012/01/09/programming-interview-questions/
 - https://www.algoexpert.io/product
 
## Functional vs Non-Functional Requirements


## Different types


## 

a. Reliability
  - Product will operate with failure for specific number of users (transaction) or for a specific time period,
  - .performance requirements of a system by identifying the workloads, scenarios and resources related to system events. A

b. Performance: we can improve performance at system design level and code level
  - https://www.cubrid.org/blog/the-principles-of-java-application-performance-tuning
  - **At JVM level**
    - increase help memory
    - use appropriate GC mechanism
  - **System Design level**
    - Add CDN (content delivery network)
    - Have multiple instance of application server/DB if load is high
    - Use load balancer
    - Cache data
      - Static Data
      - most used data
      - DB Data
    - Compress data (image/audio/video etc)
  - **Codewise**
    - Proper use of threads
    - Reduce DB/HTTP calls
    - Compress data
    - Use DB sharding technique
    - Use stringbuffer than string
    - avoid using recursion
    - use primitive where possible
    - If required cache DB
  - **Concepts**
    - Don’t optimize before you know it’s necessary
    - Use a profiler to find the real bottleneck
    - Create a performance test suite for the whole application
    - Work on the biggest bottleneck first
    - Use StringBuilder to concatenate Strings programmatically
    - Use + to concatenate Strings in in one statement
    - Use primitives where possible
    - Try to avoid BigInteger and BigDecimal

c. Availability : System should be alive and serve the purpose. Availability is the ratio of time a system or component is functional to the total time it is required or expected to function. This can be expressed in percentage like 90% or in ratio 9/10.
  - Use multiple instance
  - Use load balancer
  - use kubernetes to monitor multiple instance

d. Usability : Usability ensures that a product , service,process or environment is easy to use. It focuses on Customer, business unit and subject matter experts.

e. Security: We follow OWASP (https://blog.sucuri.net/2019/01/owasp-top-10-security-risks-part-v.html)

 - https://www.edureka.co/blog/microservices-security
 - https://developer.okta.com/blog/2020/03/23/microservice-security-patterns
 - https://dzone.com/articles/11-patterns-to-secure-microservice-architectures?edition=613291&utm_source=Weekly%20Digest&utm_medium=email&utm_campaign=Weekly%20Digest%202020-06-24
 - 

f. Flexibility: The degree to which the developer may introduce extensions or modifications to the information system without changing the software itself.
The key to building highly flexible systems is the loose coupling of its components.

g.	Scalability
h.	Maintainability
i.	Connectivity
j.	Reusability
k.	Accessibility
l.	Reporting
m.	Documentation
n.	Installability
o.	Auditability



https://adevait.com/software/kpis-software-engineering-teams
https://dev.to/javinpaul/top-10-object-oriented-design-principles-for-writing-clean-code-4pe1
TOGAF: https://github.com/pankajchopra

