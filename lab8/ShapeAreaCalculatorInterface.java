import java.util.Scanner;

// Define the interface
interface Shape {
    double calculateArea();
}

// Implement the Rectangle class
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Implement the Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to calculate areas
public class ShapeAreaCalculatorInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Rectangle
        System.out.print("Enter width of the Rectangle: ");
        double rectWidth = scanner.nextDouble();
        System.out.print("Enter height of the Rectangle: ");
        double rectHeight = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline

        Rectangle rectangle = new Rectangle(rectWidth, rectHeight);

        // Input for Circle
        System.out.print("Enter radius of the Circle: ");
        double circleRadius = scanner.nextDouble();

        Circle circle = new Circle(circleRadius);

        // Calculate and print areas
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}