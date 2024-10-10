import java.util.Scanner;
public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Please enter a number (or type 'exit' to quit): ");
            String userInput = scanner.nextLine();

            // Check if the user wants to exit
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            try {
                // Attempt to convert the string input to an integer
                int number = Integer.parseInt(userInput);
                System.out.println("You entered the number: " + number);
            } catch (NumberFormatException e) {
                // Handle the exception for invalid input
                System.out.println("Error: Invalid input. Please enter a valid number.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}