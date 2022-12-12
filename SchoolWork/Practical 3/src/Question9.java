import java.util.Arrays;

public class Question9 {
    public static void main(String[] args) {
        // Create a two-dimensional array of 100 integer elements
        int[][] numbers = new int[10][10];

        // Initialize the array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random() * 100);
            }
        }

        // Perform summation of all elements
        int sum = 0;
        for (int[] row : numbers) {
            for (int number : row) {
                sum += number;
            }
        }
        System.out.println("The sum of the numbers is: " + sum);

        // Calculate the average
        double average = (double) sum / (numbers.length * numbers[0].length);
        System.out.println("The average of the numbers is: " + average);

        // Flatten the array to a single dimension
        int[] flatArray = Arrays.stream(numbers)
                .flatMapToInt(Arrays::stream)
                .toArray();

        // Sort the array in ascending order
        Arrays.sort(flatArray);
        System.out.println("The numbers in ascending order are: " + Arrays.toString(flatArray));

        // Sort the array in descending order
        for (int i = 0; i < flatArray.length / 2; i++) {
            int temp = flatArray[i];
            flatArray[i] = flatArray[flatArray.length - 1 - i];
            flatArray[flatArray.length - 1 - i] = temp;
        }
        System.out.println("The numbers in descending order are: " + Arrays.toString(flatArray));
    }
}