import java.util.Scanner;
public class Box {
    // Dimensions of the box
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor to initialize dimensions
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate the volume of the box
    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Create a Box object with specified dimensions
        System.out.println("ENTER WIDTH HEIGHT AND DEPTH:");
        Box myBox = new Box(sc.nextInt(),sc.nextInt(), sc.nextInt());

        // Calculate and print the volume of the box
        double volume = myBox.getVolume();
        System.out.println("VOLUME OF THE BOX IS: " + volume);
    }
}