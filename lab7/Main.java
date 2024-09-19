import java.util.Scanner;

// Define the Student_Detail class
class Student_Detail {
    // Member variables to store student details
    private String name;
    private String id;
    private String college_name;

    // Constructor to initialize the Student_Detail object
    public Student_Detail(String name, String id) {
        this.name = name;
        this.id = id;
        this.college_name = "MIT"; // Setting the college name to "MIT"
    }

    // Method to display student details
    public void display_details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College Name: " + college_name);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        //scanner.nextLine(); // Consume newline left-over

        // Create an array to store Student_Detail objects
        Student_Detail[] students = new Student_Detail[numberOfStudents];

        // Loop to get input for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.println();
            System.out.print("Enter ID: ");
            String id = scanner.nextLine();

            // Create a Student_Detail object and store it in the array
            students[i] = new Student_Detail(name, id);
        }

        // Close the Scanner object
        scanner.close();

        // Display details of each student
        System.out.println("\nStudent Details:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + " Details:");
            students[i].display_details();
        }
    }
}
