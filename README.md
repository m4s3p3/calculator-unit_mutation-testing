# Calculator Project — Unit Testing with JUnit 5

This project contains a simple Java class `Calculator` with basic arithmetic operations 
(addition, subtraction, multiplication, division, max, square root, positive check, and power).

The main objective is to **practice unit testing with JUnit 5**. Students are expected to 
write test cases for all methods in `Calculator`, covering normal cases, boundary values, 
and error cases (exceptions).

## Pre-conditions to Compile and Run

Before compiling and executing tests, make sure you have the following installed:

- **Java JDK 17** or higher (`java -version` should display 17 or above)
- **Maven 3.9+** *or* **Gradle 8+** (choose one build tool)
- An IDE such as **IntelliJ IDEA**, **VS Code (with Java extensions)**, or **Eclipse**

## Project Structure

```
project-root/
 ├─ src/
 │   ├─ main/java/com/seidoropentrends/classes/Calculator.java
 │   └─ test/java/com/seidoropentrends/classes/CalculatorTest.java
 ├─ pom.xml  
```

## How to Compile and Run Tests

### Using Maven
```bash
mvn test
```

The build tool will automatically download JUnit 5 and run all unit tests in the `src/test/java` folder.
------------------------------------------------------------------------------------------------
Mutation Testing with PIT (Java)

Mutation testing checks the real quality of your tests by modifying (mutating) the production code and verifying if the tests detect these changes.

If a test fails when a mutation is applied ⇒ mutant “killed”

If tests still pass ⇒ mutant “survived”  (indicates weak tests or missing cases).

1) Prerequisites

Java JDK 17 or higher installed and configured in your PATH

Maven 3.9+ or Gradle 8+

A project with JUnit tests that already pass successfully

2) Configuration
Maven (pom.xml)

Add the PIT plugin:

<build>
  <plugins>
    <plugin>
      <groupId>org.pitest</groupId>
      <artifactId>pitest-maven</artifactId>
      <version>1.15.0</version>
      <configuration>
        <targetClasses>
          <param>com.seidoropentrends.classes.*</param>
        </targetClasses>
        <targetTests>
          <param>com.seidoropentrends.classes.*Test</param>
        </targetTests>
      </configuration>
    </plugin>
  </plugins>
</build>


pitest {
  pitestVersion = '1.15.0'
  targetClasses = ['com.seidoropentrends.classes.*']
  targetTests = ['com.seidoropentrends.classes.*Test']
}

3) Execution
Maven
mvn org.pitest:pitest-maven:mutationCoverage


4) Report Interpretation

After running PIT, an HTML report is generated:

Maven → target/pit-reports/YYYYMMDDHHMM/index.html

The report includes:

Killed: mutants eliminated by tests (good ✅).

Survived: mutants that survived (tests need improvement ❌).

No coverage: lines not covered by tests.

Timed out: mutants that exceeded the maximum execution time.

5) Best Practices

Don’t aim blindly for 100% killed mutants (some are equivalent mutants that can’t be detected).

Use PIT to reveal weak spots in your test suite.

Add tests for boundary values and error cases that were previously missing.

Run mutation testing periodically (e.g., in major pull requests or CI pipelines).

