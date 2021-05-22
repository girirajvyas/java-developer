# Quality

# A. Technical Debt

## 1. What
As per [Wiki](https://en.wikipedia.org/wiki/Technical_debt): Technical debt (also known as design debt or code debt, but can be also related to other technical endeavors) is a concept in software development that reflects the implied cost of additional rework caused by choosing an easy (limited) solution now instead of using a better approach that would take longer.  
As with monetary debt, if technical debt is not repaid, it can accumulate 'interest', making it harder to implement changes.  

The term debt is use so that it is easy for a non-technical business person to understand its impact and could relate to it.

## 2. Why / Cause:

 - Time constraints placed on development team via very short time to market
 - Existing Source code complexity that is very high i.e Overly complex existing technical design
 - Business decisions which lack technical knowledge and make communication difficult
 - Lack of documentation, where code is created without supporting documentation. The work to create documentation represents debt
 - Lack of coding standards and guidelines setup in project
 - Coders with little experience and not enough skills i.e Green Developers
 - Lack of Big/Complete picture of what is planned for future developments
 - Use of outdated tools or technology
 - No/Poor code reviews
 - No use of static code analysis tool like sonar 
 - Insufficient testing or poor test coverage
 - Delayed refactoring.
 - [Code Smell](https://en.wikipedia.org/wiki/Code_smell) can conribute to Technical debt

## 3. Types
`Martin Fowler` has nicely explained this in his [Technical Debt Quadrant](https://martinfowler.com/bliki/TechnicalDebtQuadrant.html)
 - Reckless (irresponsible)
 - Prudent (Well judged/known)
 - Inadvertent: (Unintentional/unknown)
 - Finaly knowing how it should have been done

Snapshot:
[Technical debt quadrant](https://github.com/girirajvyas/101-series/blob/master/resources/images/code_quality/technical_debt_quadrant_martin_fowler.PNG)

## 4. Tools to detect debt

### 4.1 Sonar(https://www.sonarqube.org/)
 - SonarLint is used as an IDE plugin in developers machine for immediate feedback
 - SonarQube is deployed on CI server and provides feedback before integration with detailed report
 - Read Flow at https://docs.sonarqube.org/latest/

**Quality Metrics:**  

**Issue Types**
  - `Reliability` 
    - **Bugs:** A coding error that will break your code and needs to be fixed immediately.
  - `Security`
    - **Vulnerabilities:** Code that can be exploited by hackers
    - **Security hotspots:** Security-sensitive code that requires manual review to assess whether or not a vulnerability exists. They arent necessarily issues, but they need to be reviewed to make sure they arent vulnerabilities
  - `Maintainability`
    - **Code smells:** A maintainability issue that makes your code confusing and difficult to maintain. OR it is a charcteristics of code which indicates deeper problem.
      - eg: Too many comments, Duplicate codes, Lazy classes etc.
    - **Debt:** Estimated time to fix all code smells
  - `Coverage`
    - Percentage of lines of code covered by tests
  - `Duplications`
    - **Duplications:** Identical lines of code
    - **Duplicated blocks:** Number of duplicated block of lines of code
  - `Size:`
    - Lines of code

**Issue Severity**
  - **Blocker:** Bug with high probablity to impact behaviour of applicaton in prod. The Code must fix immediately
  - **Critical:** Either Bug with low probablity to impact behaviour of applicaton in prod or issues which represents secutiry flaws. The code must of Reviewed immediately.
    - eg: empty catch block, SQL injection.
  - **Major:** Quality Flaw that highly impact  developer productivity.  
    - eg: uncovered piece of code, duplicate code, unused parameters etc.
  - **Minor:** Quality flaw that slightly impact developer productivity.  
    - eg: lines should not be too long, switch should have at least 3 cases etc
  - **Info:** Niether bug or quality flaq, Just a finding.

**Examples:**  
 - https://rules.sonarsource.com/java/type/Bug/RSPEC-2276
 - https://www.sonarsource.com/java/
 - https://docs.sonarqube.org/latest/user-guide/metric-definitions/

### 4.2 Jacoco

## 5. Code smells

**Definition:**  
A maintainability issue that makes your code confusing and difficult to maintain. OR it is a charcteristics of code which indicates deeper problem.

**Examples:**  
 - `Comments:` A method is filled with explanatory comments.
 - `Duplicate Code:` Two code fragments look almost identical.
 - `Lazy Class:` Understanding and maintaining classes always costs time and money. So if a class doesn’t do enough to earn your attention, it should be deleted.
 - `Data Class:` A data class refers to a class that contains only fields and crude methods for accessing them (getters and setters). These are simply containers for data used by other classes. These classes don’t contain any additional functionality and can’t independently operate on the data that they own.
 - `Dead Code:` A variable, parameter, field, method or class is no longer used (usually because it’s obsolete).
 - `Speculative Generality:` There’s an unused class, method, field or parameter. Sometimes code is created "just in case" to support anticipated future feature thats never gets implemented,as a result code becomes hard to understand and support.

## 6. Solution

### 6.1 Code Refactoring
The main idea of refactoring is to fight technical debt. it transforms a mess into a clean code.

### 6.2 SOLID

### 6.3 Clean Code

### 6.4 CI Pipeline

 - Includes SONAR in Build
 - Runs Unit Tests
 - All the points listed in SONAr are covered

# B. Type of Tests

### Test Pyramid

 - https://martinfowler.com/articles/practical-test-pyramid.html
 - https://martinfowler.com/bliki/TestPyramid.html
 - https://testing.googleblog.com/2015/04/just-say-no-to-more-end-to-end-tests.html
 - https://abstracta.us/blog/test-automation/best-testing-practices-agile-teams-automation-pyramid

### Unit Test

 - FIRST - https://medium.com/@tasdikrahman/f-i-r-s-t-principles-of-testing-1a497acda8d6
 - Improved code via Biconsumer(learned in a code review) can be explored
 - Given When Then (AAA)

## Code review
What it is?

**Why do we have to do Code review?**  
 - opportunity to learned
 - code walk through for every one
 - increase technical as well as product knowledge
 - improved communication and collaboration

**Consider:**  
 - Both are responsible for the code
 - Be empathetic
 - Reviewing the code not the developer and hence instead of 

**During code review:**  
 - Be kind and humble, both when reviewing and being reviewed.
 - Run complex reviews via live meetings: in person or audio/video calls.
 - Discuss the code constructively.
 - The author should have the final word.
 - Both sides should focus on learning.
 - Concentrate on facts, not on opinions or style.
 - Accept 'imperfect' solutions to preserve team spirit.
 - Submit reviewer-friendly pull requests with explanatory, fine-grained commits.

Good read: https://dzone.com/articles/the-best-code-review?fromrel=true

**Checklists?**
 - Unit Test coverage above 80 %
 - Code has been implemented as per the design
 - Design principles followed in Implementation
 - Logging is correctly done
 - Exception handling is correctly done
 - Previous review comments are incorporated correctly
 - Business wise it is working correctly
 - Formatting issues if Formatter not configured already
 - Clean code principles like: proper naming conventions, no TODOs, no unnecessary comments and Comments when their is complex logic. 

## Questions

 - coding standards as a set of guidelines, best practices, programming styles and conventions that all developers adhere to when writing source code
   - use static code analysis tools and code style checkers as one of the tool to enforce coding standards
   - knowledge base have an up-to-date dedicated section for coding standards, best practices, dos, don’t's, etc
   
## Text:  
Source Control  
Source Control is a security plan to secure your working code. Implement Source Control by keeping the code in a single location, with secure and logged access. This could be a physical location where files are stored and accessed in a single room in the building. It could also be a virtual space where users can log in with an encrypted connection to a cloud-based development environment.

Source Control applications include a change management system to track work done by individuals or teams. As with any storage, use a backup system to record development progress in case of a disaster.


Continuous Integration  
Continuous Integration evolved out of a case of what not to do. CI works to make sure each component is compatible through the whole development cycle. Before CI, different teams would build their own projects independently. This created significant challenges at the end when developers stitched the application together. Continuous Integration ensures all teams use similar programming languages and libraries, and helps prevent conflicts and duplicated work.
