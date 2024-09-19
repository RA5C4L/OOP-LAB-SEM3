import java.util.Scanner;

public class Number {
    private double value;

    // Constructor to initialize the value
    public Number(double value) {
        this.value = value;
    }

    // Method to check if the number is zero
    public boolean isZero() {
        return value == 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return value > 0;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return value < 0;
    }

    // Method to check if the number is odd (only valid for integers)
    public boolean isOdd() {
        if (isInteger()) {
            return ((int) value % 2 != 0);
        }
        return false;
    }

    // Method to check if the number is even (only valid for integers)
    public boolean isEven() {
        if (isInteger()) {
            return ((int) value % 2 == 0);
        }
        return false;
    }

    // Method to check if the number is prime (only valid for positive integers greater than 1)
    public boolean isPrime() {
        if (isInteger() && isPositive() && value > 1) {
            int intValue = (int) value;
            for (int i = 2; i <= Math.sqrt(intValue); i++) {
                if (intValue % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // Method to check if the number is an Armstrong number (only valid for integers)
    public boolean isArmstrong() {
        if (isInteger() && value >= 0) {
            int intValue = (int) value;
            int sum = 0, temp = intValue, digits = 0;

            // Calculate the number of digits
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            temp = intValue;
            // Calculate the sum of the power of digits
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            return sum == intValue;
        }
        return false;
    }

    // Helper method to check if the value is an integer
    private boolean isInteger() {
        return value == (int) value;
    }

    // Getter for the value (if needed)
    public double getValue() {
        return value;
    }

    // Setter for the value (if needed)
    public void setValue(double value) {
        this.value = value;
    }

    // Main method for user input and testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        double inputValue = scanner.nextDouble();

        Number num = new Number(inputValue);

        System.out.println("Value: " + num.getValue());
        System.out.println("isZero: " + num.isZero());
        System.out.println("isPositive: " + num.isPositive());
        System.out.println("isNegative: " + num.isNegative());
        System.out.println("isOdd: " + num.isOdd());
        System.out.println("isEven: " + num.isEven());
        System.out.println("isPrime: " + num.isPrime());
        System.out.println("isArmstrong: " + num.isArmstrong());
        
        scanner.close();
    }
}