import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student name and roll number
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();

        // Input marks for three subjects
        double[] marks = new double[3];
        for (int i = 0; i < marks.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter marks for subject " + (i + 1) + ": ");
                    marks[i] = Double.parseDouble(scanner.nextLine());
                    if (marks[i] < 0 || marks[i] > 100) {
                        System.out.println("Marks should be between 0 and 100. Please try again.");
                    } else {
                        break; // Exit the loop if input is valid
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number for marks.");
                }
            }
        }

        // Calculate percentage
        double totalMarks = marks[0] + marks[1] + marks[2];
        double percentage = (totalMarks / 300) * 100;

        // Determine grade
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // Display results
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}