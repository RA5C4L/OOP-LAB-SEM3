public class AutoboxingUnboxingDemo {

    public static void main(String[] args) {
        // Autoboxing: Converting primitive types to their wrapper classes
        // Integer is the wrapper class for int
        Integer intObj = 10; // Autoboxing
        // Double is the wrapper class for double
        Double doubleObj = 20.5; // Autoboxing
        // Character is the wrapper class for char
        Character charObj = 'A'; // Autoboxing
        // Boolean is the wrapper class for boolean
        Boolean booleanObj = true; // Autoboxing
        // Byte is the wrapper class for byte
        Byte byteObj = 100; // Autoboxing
        // Short is the wrapper class for short
        Short shortObj = 3000; // Autoboxing
        // Long is the wrapper class for long
        Long longObj = 100000L; // Autoboxing
        // Float is the wrapper class for float
        Float floatObj = 15.75f; // Autoboxing

        // Displaying the wrapper class objects
        System.out.println("Wrapper class objects:");
        System.out.println("Integer: " + intObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Character: " + charObj);
        System.out.println("Boolean: " + booleanObj);
        System.out.println("Byte: " + byteObj);
        System.out.println("Short: " + shortObj);
        System.out.println("Long: " + longObj);
        System.out.println("Float: " + floatObj);

        // Unboxing: Converting wrapper classes back to primitive types
        int intPrimitive = intObj; // Unboxing
        double doublePrimitive = doubleObj; // Unboxing
        char charPrimitive = charObj; // Unboxing
        boolean booleanPrimitive = booleanObj; // Unboxing
        byte bytePrimitive = byteObj; // Unboxing
        short shortPrimitive = shortObj; // Unboxing
        long longPrimitive = longObj; // Unboxing
        float floatPrimitive = floatObj; // Unboxing

        // Displaying the primitive type values
        System.out.println("\nPrimitive type values:");
        System.out.println("int: " + intPrimitive);
        System.out.println("double: " + doublePrimitive);
        System.out.println("char: " + charPrimitive);
        System.out.println("boolean: " + booleanPrimitive);
        System.out.println("byte: " + bytePrimitive);
        System.out.println("short: " + shortPrimitive);
        System.out.println("long: " + longPrimitive);
        System.out.println("float: " + floatPrimitive);
    }
}