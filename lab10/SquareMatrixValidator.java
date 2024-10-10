import java.util.Scanner;

public class SquareMatrixValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of rows and columns
        System.out.print("Enter the number of rows (and columns) for the matrix: ");
        int size = scanner.nextInt();

        // Ensure the size is positive
        if (size <= 0) {
            System.out.println("Size must be a positive integer.");
            scanner.close();
            return;
        }

        // Create a square matrix
        int[][] matrix = new int[size][size];

        // Input elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                try {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Clear invalid input
                    j--; // Allow re-entry for the current element
                }
            }
        }

        // Validate if the matrix is square
        if (isSquareMatrix(matrix)) {
            System.out.println("The matrix is a square matrix.");
        } else {
            System.out.println("The matrix is not a square matrix.");
        }

        // Display the matrix
        System.out.println("Matrix:");
        displayMatrix(matrix);

        // Close the scanner
        scanner.close();
    }

    // Method to check if the matrix is square
    public static boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;
        return rows == matrix[0].length; // Since it's a square matrix, rows should equal columns
    }

    // Method to display the matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}