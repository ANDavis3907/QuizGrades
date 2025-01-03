import java.util.Scanner;

public class QuizGradesProgram {

    public static void printSpecifications() {
        System.out.println("Project Name: Quiz Grades");
        System.out.println("Calculate and display the average quiz grade and corresponding letter grade.");
        System.out.println("Directions: Enter 10 quiz grades. Enter 999 to quit.");
        System.out.println("Grading Scale: 90-100 = A, 80-89 = B, 70-79 = C, 60-69 = D, 0-59 = F");
    }

    public static void main(String[] args) {
        printSpecifications();

        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[10];
        int grade, count = 0, total = 0;

        while (count < 10 && grade != 999) {
            System.out.print("Enter quiz grade (" + (count + 1) + "): ");
            grade = scanner.nextInt();
            if (grade != 999) {
                grades[count] = grade;
                total += grade;
                count++;
            }
        }
        System.out.println("Entered Grades: ");
        for (int i = 0; i < count; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }

        double average = (double) total / count;
        String letterGrade;

        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("Average Quiz Grade: " + average);
        System.out.println("Letter Grade: " + LetterGrade);

        scanner.close();
    }
}