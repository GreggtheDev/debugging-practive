public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("The array cannot be null");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        System.out.println("The average is: " + calculateAverage(testArray));

        // Introduce a NullPointerException
        int[] nullArray = null;
        System.out.println("The average is: " + calculateAverage(nullArray));
    }
}
