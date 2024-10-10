import java.util.Scanner;
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
public class NegativeRootChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input a number
            System.out.print("Enter a number to find its square root: ");
            String input = scanner.nextLine();

            // Parse the input to a double
            double number = Double.parseDouble(input);

            // Check if the number is negative
            if (number < 0) {
                throw new NegativeNumberException("Cannot calculate the square root of a negative number.");
            }

            // Calculate the real square root
            double realRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is: " + realRoot);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage()); // Display custom error message
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}