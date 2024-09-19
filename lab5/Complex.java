import java.util.Scanner;
public class Complex {
    // Data members for the real and imaginary parts
    private double real;
    private double imaginary;

    // Constructor to initialize a complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to display a complex number in the format: a + bi
    public void display() {
        if (imaginary >= 0) {
            System.out.printf("%.2f + %.2fi\n", real, imaginary);
        } else {
            System.out.printf("%.2f - %.2fi\n", real, -imaginary);
        }
    }

    // Method to add an integer to a complex number
    public Complex add(int value) {
        return new Complex(this.real + value, this.imaginary);
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Main method to test the Complex class with user inputs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.print("ENTER REAL PART OF Z1: ");
        double real1 = scanner.nextDouble();
        System.out.print("ENTER IMAGINARY PART OF Z1: ");
        double imaginary1 = scanner.nextDouble();
        Complex c1 = new Complex(real1, imaginary1);

        // Input for the second complex number
        System.out.print("ENTER REAL PART OF Z2: ");
        double real2 = scanner.nextDouble();
        System.out.print("ENTER IMAGINARY PART OF Z2: ");
        double imaginary2 = scanner.nextDouble();
        Complex c2 = new Complex(real2, imaginary2);

        // Input for the integer
        System.out.print("ENTER INTEGER TO ADD TO Z1: ");
        int integerValue = scanner.nextInt();

        // Performing the additions and displaying results
        Complex result1 = c1.add(integerValue);
        System.out.print("Z1+ " + integerValue + " = ");
        result1.display();

        Complex result2 = c1.add(c2);
        System.out.print("Z1 + Z2 = ");
        result2.display();

        // Close the scanner
        scanner.close();
    }
}