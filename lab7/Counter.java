public class Counter {
    // Static variable to keep track of the number of objects created
    private static int objectCount = 0;

    // Static block to initialize the static variable (optional)
    static {
        System.out.println("Static block initialized. Initial objectCount = " + objectCount);
    }

    // Constructor increments the static counter every time a new object is created
    public Counter() {
        objectCount++;
    }

    // Static method to get the number of objects created
    public static int getObjectCount() {
        return objectCount;
    }

    // Main method to test the Counter class
    public static void main(String[] args) {
        // Create multiple Counter objects
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        // Display the number of objects created
        System.out.println("Number of Counter objects created: " + Counter.getObjectCount());
    }
}