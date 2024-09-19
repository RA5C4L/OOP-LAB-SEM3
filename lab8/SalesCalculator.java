import java.util.Scanner;

// Define the interface
interface Item {
    double calculateSales();
}

// Implement the Hardware class
class Hardware implements Item {
    private String category;
    private String manufacturer;
    private double salesLast3Months;

    public Hardware(String category, String manufacturer, double salesLast3Months) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.salesLast3Months = salesLast3Months;
    }

    @Override
    public double calculateSales() {
        return salesLast3Months;
    }
}

// Implement the Software class
class Software implements Item {
    private String type;
    private String operatingSystem;
    private double salesLast3Months;

    public Software(String type, String operatingSystem, double salesLast3Months) {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.salesLast3Months = salesLast3Months;
    }

    @Override
    public double calculateSales() {
        return salesLast3Months;
    }
}

// Main class to calculate total sales
public class SalesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Hardware
        System.out.print("Enter category of Hardware: ");
        String hardwareCategory = scanner.nextLine();
        System.out.print("Enter manufacturer of Hardware: ");
        String hardwareManufacturer = scanner.nextLine();
        System.out.print("Enter sales for the last 3 months for Hardware: ");
        double hardwareSales = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline

        Hardware hardware1 = new Hardware(hardwareCategory, hardwareManufacturer, hardwareSales);

        // Input for another Hardware (for demonstration)
        System.out.print("Enter category of another Hardware: ");
        String hardwareCategory2 = scanner.nextLine();
        System.out.print("Enter manufacturer of another Hardware: ");
        String hardwareManufacturer2 = scanner.nextLine();
        System.out.print("Enter sales for the last 3 months for another Hardware: ");
        double hardwareSales2 = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline

        Hardware hardware2 = new Hardware(hardwareCategory2, hardwareManufacturer2, hardwareSales2);

        // Input for Software
        System.out.print("Enter type of Software: ");
        String softwareType = scanner.nextLine();
        System.out.print("Enter operating system of Software: ");
        String softwareOperatingSystem = scanner.nextLine();
        System.out.print("Enter sales for the last 3 months for Software: ");
        double softwareSales = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline

        Software software1 = new Software(softwareType, softwareOperatingSystem, softwareSales);

        // Input for another Software (for demonstration)
        System.out.print("Enter type of another Software: ");
        String softwareType2 = scanner.nextLine();
        System.out.print("Enter operating system of another Software: ");
        String softwareOperatingSystem2 = scanner.nextLine();
        System.out.print("Enter sales for the last 3 months for another Software: ");
        double softwareSales2 = scanner.nextDouble();

        Software software2 = new Software(softwareType2, softwareOperatingSystem2, softwareSales2);

        // Calculate total sales
        double totalHardwareSales = hardware1.calculateSales() + hardware2.calculateSales();
        double totalSoftwareSales = software1.calculateSales() + software2.calculateSales();

        // Print results
        System.out.println("Total Hardware Sales: $" + totalHardwareSales);
        System.out.println("Total Software Sales: $" + totalSoftwareSales);
    }
}