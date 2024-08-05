# AverageCalculator

## Project Description

`AverageCalculator` is a simple Java program that calculates the average of an array of integers. It includes exception handling to manage scenarios where the input array is `null` and handles other potential runtime exceptions. The project also demonstrates the use of a debugger to find and fix issues in the code.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or later
- IntelliJ IDEA or another Java IDE

### Project Structure

The project consists of a single Java class:

```
src/main/java/org/example/
│
└───AverageCalculator.java
```

### AverageCalculator.java

This class contains two main methods:
1. `calculateAverage`: A method that calculates and returns the average of an array of integers.
2. `main`: The entry point of the program, which tests the `calculateAverage` method with both valid and invalid input.

## Usage

### Running the Program

1. Open the project in IntelliJ IDEA or your preferred Java IDE.
2. Ensure that the `src/main/java` directory is marked as the Sources Root.
3. Navigate to `AverageCalculator.java`.
4. Run the `main` method.

The expected output should be:
```
The average is: 3.0
Caught an IllegalArgumentException: The array cannot be null
```

### Debugging Instructions

1. Set a breakpoint at the line where the `calculateAverage` method is called with a `null` array:
   ```java
   System.out.println("The average is: " + calculateAverage(nullArray));
   ```
2. Start the debugger by selecting `Run > Debug 'AverageCalculator'`.
3. When execution pauses at the breakpoint, inspect the `nullArray` variable in the Debug tool window to verify it is `null`.
4. Step through the code using the debugger to observe the flow and exception handling.

## Exception Handling

### Null Pointer Exception
The program checks for a `null` array and throws an `IllegalArgumentException` with a descriptive message:
```java
if (numbers == null) {
    throw new IllegalArgumentException("The array cannot be null");
}
```

### Array Index Out of Bounds Exception
The code ensures that array indexing is performed safely within bounds:
```java
for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}
```

### Logic Error Handling
Proper calculations ensure correct results:
```java
return (double) sum / numbers.length;
```

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request with your changes. Ensure that your code follows the project's coding standards and includes appropriate tests.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contact

For questions or suggestions, feel free to open an issue or contact the project maintainer.

---

Happy coding!
```

### Additional Notes:

- Replace any placeholder information with actual details relevant to your project.
- You might want to include instructions on how to clone the repository if this is part of a larger project or is hosted on a version control platform like GitHub.

Feel free to customize this README to better fit your project's specific details and requirements.
