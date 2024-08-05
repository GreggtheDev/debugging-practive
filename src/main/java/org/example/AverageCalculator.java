package org.example.

public class AverageCalculator {

    /**
     * This method calculates the average of an array of integers.
     * If the input array is null, it throws an IllegalArgumentException.
     *
     * @param numbers the array of integers to calculate the average of
     * @return the average of the array as a double
     */
    public static double calculateAverage(int[] numbers) {
        // Check if the input array is null and throw an exception if it is
        if (numbers == null) {
            throw new IllegalArgumentException("The array cannot be null");
        }

        int sum = 0;
        // Loop through the array and calculate the sum of its elements
        for (int number : numbers) {
            sum += number;
        }
        // Calculate the average by dividing the sum by the number of elements
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        // Test array with valid integers
        int[] testArray = {1, 2, 3, 4, 5};
        // Print the average of the test array
        System.out.println("The average is: " + calculateAverage(testArray));

        // Array set to null to test the exception handling
        int[] nullArray = null;
        // Use a try-catch block to handle the IllegalArgumentException
        try {
            // This line will throw an IllegalArgumentException because nullArray is null
            System.out.println("The average is: " + calculateAverage(nullArray));
        } catch (IllegalArgumentException e) {
            // Catch the exception and print a message indicating the error
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }
}
