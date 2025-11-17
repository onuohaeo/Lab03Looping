
import java.util.Scanner;

public class GradeCollector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grade;
        int count = 0;
        int total = 0;

        System.out.println("Enter grade [0-100] or -1 to quit:");

        while (true) {
            System.out.print("Grade: ");
            grade = input.nextInt();

            // sentinel value → stop the loop
            if (grade == -1) {
                break;
            }

            // validate input range 0 - 100
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter between 0–100 or -1 to quit.");
                continue;
            }

            total += grade;
            count++;
        }

        if (count > 0) {
            double average = (double) total / count;
            System.out.println("\nNumber of grades entered: " + count);
            System.out.println("Average grade: " + average);
        } else {
            System.out.println("No grades entered.");
        }

        input.close();
    }
}
