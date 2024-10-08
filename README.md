
Two-Sum Problem Solution: 
-------------------------------------------------------------------
Project Overview: 
This project provides a solution to the Two-Sum Problem. Given an array of integers and a target integer, the solution finds two indices of the numbers such that they add up to the target. It is implemented in Java and demonstrates key concepts such as using a hash map for efficient lookups, error handling using custom exceptions, and unit testing with JUnit.
-------------------------------------------------------------------
Key Features
-------------------------------------------------------------------
Solves the Two-Sum problem using HashMap to ensure O(n) time complexity.
Uses custom exception handling to deal with cases where no valid pair is found.
Includes JUnit test cases for unit testing with edge cases.
Demonstrates best practices in Java development, including JavaDoc comments, code readability, and exception handling.
-------------------------------------------------------------------
Project Structure
-------------------------------------------------------------------
src/main/java/com/example/twoSum/Solution.java: Contains the logic for solving the Two-Sum problem.
src/main/java/com/example/twoSum/NoValidPairFoundException.java: Custom exception for scenarios where no valid sum pair is found.
src/test/java/com/example/twoSum/SolutionTest.java: JUnit test cases that verify the functionality of the solution.
pom.xml: Maven build file with dependencies for JUnit 5.
-------------------------------------------------------------------
Requirements
-------------------------------------------------------------------
To build and run the project, you'll need the following installed:
Java JDK 11+ (or compatible version)
Maven 3.x
JUnit 5.x (included as a Maven dependency)
-------------------------------------------------------------------
Installation and Setup
-------------------------------------------------------------------
Clone the Repository 

	git clone <your-repository-url>
    cd two-sum-project

Build the Project

	mvn clean install

Run the Application
 
 	mvn test

Run with Java (Optional)
	
	mvn compile
	java -cp target/classes com.example.twoSum.Solution

-------------------------------------------------------------------
How it Works
-------------------------------------------------------------------
- Algorithm Explanation:
	- The twoSum method iterates through the array nums and for each element, calculates its complement by subtracting the element from the target.
	- It checks if the complement exists in a HashMap that stores previously encountered elements and their indices.
	- If a complement is found, it returns the indices of the two elements that add up to the target.
	- If no valid pair is found after checking all elements, a custom exception NoValidPairFoundException is thrown.
- Time Complexity:
	- The solution runs in O(n) time complexity, where n is the length of the input array. The use of a HashMap allows for efficient lookups in constant time.
- Custom Exception:
	- NoValidPairFoundException: This exception is thrown if no valid pair exists in the array that sums up to the target value.
- Test Cases:
	- Basic Test: Tests a simple case where a valid pair exists.
	- Negative Numbers: Tests a case where the input array contains negative numbers.
	- Duplicate Values: Tests a case with duplicate numbers.
	- Edge Cases: Tests cases where no solution exists and cases with an empty array.
-------------------------------------------------------------------
Example
-------------------------------------------------------------------
Given the array:

	int[] nums = {2, 7, 11, 15};
	int target = 9;
	The expected output would be:

	[0, 1]
-------------------------------------------------------------------
Running Tests
-------------------------------------------------------------------
To ensure the application works as expected, you can run the JUnit tests:

	mvn test
This will validate the core functionality, including edge cases such as no valid pair or invalid inputs.

Contributing
Feel free to fork the project and make improvements or add new features. If you find a bug or have an idea for a new feature, please open an issue or submit a pull request. All contributions are welcome!

License
This project is licensed under the **MY General Public License v3.0 (GPL-3.0)** - see the [LICENSE](LICENSE) file for details.

-------------------------------------------------------------------
How to Run the Program
-------------------------------------------------------------------
- Run the program from your IDE or from the command line.
- Enter the integers and the target sum when prompted.

The program will return the indices and the sum or print an error if no valid pair exists.

    Welcome to the Two Sum Solution Program!
    Enter the numbers (comma-separated):
    2, 7, 11, 15
    Enter the target sum:
    9
    The indices of the numbers that sum to 9 are: [0, 1]
    The numbers are: 2 + 7 = 9


    Enter the numbers (comma-separated):
    1, 2, 3, 4
    Enter the target sum:
    8
    No two sum solution found for the given target.



-------------------------------------------------------------------
Project structure
-------------------------------------------------------------------
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── twoSum/
│                       ├── Main.java
│                       ├── NoValidPairFoundException.java
│                       ├── Solution.java
│                       └── SolutionTest.java
├── pom.xml
├── LICENSE
├── README.md
