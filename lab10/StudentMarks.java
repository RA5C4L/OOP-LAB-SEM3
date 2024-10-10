import java.util.Scanner;

// Custom Exception Class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message); // Call the parent constructor with the message
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        // Input marks for three subjects
        double[] marks = new double[3];
        for (int i = 0; i < marks.length; i++) {
            while (true) {
                try {
                    System.out.print("Enter marks for subject " + (i + 1) + ": ");
                    marks[i] = Double.parseDouble(scanner.nextLine());
                    
                    // Validate marks
                    if (marks[i] < 0 || marks[i] > 100) {
                        throw new InvalidMarksException("Marks should be between 0 and 100. Please try again.");
                    }
                    break; // Exit the loop if input is valid
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number for marks.");
                } catch (InvalidMarksException e) {
                    System.out.println(e.getMessage()); // Display the custom error message
                }
            }
        }

        // Calculate total and percentage
        double totalMarks = marks[0] + marks[1] + marks[2];
        double percentage = (totalMarks / 300) * 100;

        // Display results
        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Close the scanner
        scanner.close();
    }
}