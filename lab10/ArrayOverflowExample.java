import java.util.Scanner;

public class ArrayOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Ensure the size is positive
        if (size <= 0) {
            System.out.println("Array size must be a positive integer.");
            return;
        }

        int[] array = new int[size];

        // Input elements into the array
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                    break; // Exit loop if input is valid
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        // Prompt user for an index to search
        System.out.print("Enter an index to search in the array (0 to " + (size - 1) + "): ");
        int indexToSearch = scanner.nextInt();
        
        // Try to access the element at the specified index
        try {
            System.out.println("Element at index " + indexToSearch + ": " + array[indexToSearch]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + indexToSearch + " is out of bounds.");
        }

        // Close the scanner
        scanner.close();
    }
}