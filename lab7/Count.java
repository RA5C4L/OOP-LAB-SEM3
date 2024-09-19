import java.util.Scanner;

// Define the Counter class
class Counter {
    // Static variable to keep track of the number of objects created
    private static int count = 0;

    // Constructor that increments the counter every time an object is created
    public Counter() {
        count++;
    }

    // Static method to get the current count of objects
    public static int getCount() {
        return count;
    }
}

// Main class to run the program
public class Count {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of Counter objects to create
        System.out.print("Enter the number of Counter objects to create: ");
        int numberOfObjects = scanner.nextInt();

        // Create the specified number of Counter objects
        for (int i = 0; i < numberOfObjects; i++) {
            new Counter(); // Create a new Counter object
        }

        // Close the Scanner object
        scanner.close();

        // Display the number of Counter objects created
        System.out.println("Number of Counter objects created: " + Counter.getCount());
    }
}
