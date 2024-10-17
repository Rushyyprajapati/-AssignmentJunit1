# -AssignmentJunit1

# Longest Substring Without Repeating Characters

This project solves the **Longest Substring Without Repeating Characters** problem using Java. The solution leverages the **sliding window algorithm** to find the longest substring without any repeating characters. Additionally, the project includes comprehensive **JUnit 5 tests** to ensure the code handles various edge cases and scenarios correctly.

## Problem Statement

Given a string `s`, the task is to find the length of the **longest substring** without repeating characters.

### Example Input and Output

- **Input**: `"abcabcbb"`
- **Output**: `3`  
  (Explanation: The longest substring without repeating characters is `"abc"`.)

---

## **Project Structure**


- **`LongestSubstringWithoutRepeating.java`**: Contains the logic to find the longest substring without repeating characters.
- **`LongestSubstringWithoutRepeatingTest.java`**: JUnit 5 test cases to validate the solution.
- **`Main.java`**: Entry point to run the program from the command line (optional).
- **`pom.xml`**: Maven configuration for dependencies.

---

## **How to Run the Project**

### **Prerequisites**
- **Java JDK 8 or higher** installed
- **Maven** installed
- **Git** installed (optional, for cloning the repository)

---

### **Step 1: Clone the Repository**

If you haven't cloned the repository yet, run the following command:

```bash
git clone https://github.com/Rushyyprajapati/-AssignmentJunit1.git
cd -AssignmentJunit1

### **Step 2: Compile the code**

mvn clean compile
java -cp target/classes org.example.Main

### **Step 3: Run the Program**
java -cp target/classes org.example.Main

### **Running Test: Run the Tests with Maven**
mvn test
