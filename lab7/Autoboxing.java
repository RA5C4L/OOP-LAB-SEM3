import java.util.Scanner;

public class Autoboxing {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for different primitive types and perform autoboxing
        System.out.print("Enter an integer: ");
        int intPrimitive = scanner.nextInt();
        Integer intWrapper = intPrimitive; // Autoboxing
        System.out.println("Autoboxing int: " + intWrapper);

        System.out.print("Enter a double: ");
        double doublePrimitive = scanner.nextDouble();
        Double doubleWrapper = doublePrimitive; // Autoboxing
        System.out.println("Autoboxing double: " + doubleWrapper);

        System.out.print("Enter a float: ");
        float floatPrimitive = scanner.nextFloat();
        Float floatWrapper = floatPrimitive; // Autoboxing
        System.out.println("Autoboxing float: " + floatWrapper);

        System.out.print("Enter a long: ");
        long longPrimitive = scanner.nextLong();
        Long longWrapper = longPrimitive; // Autoboxing
        System.out.println("Autoboxing long: " + longWrapper);

        System.out.print("Enter a short: ");
        short shortPrimitive = scanner.nextShort();
        Short shortWrapper = shortPrimitive; // Autoboxing
        System.out.println("Autoboxing short: " + shortWrapper);

        System.out.print("Enter a byte: ");
        byte bytePrimitive = scanner.nextByte();
        Byte byteWrapper = bytePrimitive; // Autoboxing
        System.out.println("Autoboxing byte: " + byteWrapper);

        System.out.print("Enter a boolean (true/false): ");
        boolean booleanPrimitive = scanner.nextBoolean();
        Boolean booleanWrapper = booleanPrimitive; // Autoboxing
        System.out.println("Autoboxing boolean: " + booleanWrapper);

        // Unboxing: Convert wrapper classes back to primitives

        // Integer
        int unboxedInt = intWrapper; // Unboxing
        System.out.println("Unboxing Integer to int: " + unboxedInt);

        // Double
        double unboxedDouble = doubleWrapper; // Unboxing
        System.out.println("Unboxing Double to double: " + unboxedDouble);

        // Float
        float unboxedFloat = floatWrapper; // Unboxing
        System.out.println("Unboxing Float to float: " + unboxedFloat);

        // Long
        long unboxedLong = longWrapper; // Unboxing
        System.out.println("Unboxing Long to long: " + unboxedLong);

        // Short
        short unboxedShort = shortWrapper; // Unboxing
        System.out.println("Unboxing Short to short: " + unboxedShort);

        // Byte
        byte unboxedByte = byteWrapper; // Unboxing
        System.out.println("Unboxing Byte to byte: " + unboxedByte);

        // Boolean
        boolean unboxedBoolean = booleanWrapper; // Unboxing
        System.out.println("Unboxing Boolean to boolean: " + unboxedBoolean);

        // Close the Scanner object
        scanner.close();
    }
}
