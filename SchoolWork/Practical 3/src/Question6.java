import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        String name = "";
        int score = 0;
        int totalScore = 0;
        int numStudents = 0;
        double classAverage = 0.0;

        // Read and process records
        while (true) {
            // Read a record
            System.out.print("Enter student name: ");
            name = scanner.nextLine();
            System.out.print("Enter student score: ");
            score = scanner.nextInt();
            scanner.nextLine(); // consume the remaining newline character

            // Check if we've reached the end of the input
            if (name.equals("") && score == 999) {
                break;
            }

            // Add the score to the total
            totalScore += score;
            numStudents++;

            // Print the name and score
            System.out.println("Student: " + name + ", Score: " + score);
        }

        // Compute and print the class average
        classAverage = (double) totalScore / numStudents;
        System.out.println("Class average: " + classAverage);
    }
}
