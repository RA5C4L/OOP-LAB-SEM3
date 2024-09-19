import java.util.Scanner;
public class Employee {
    // Data members
    private String name;
    private String city;
    private double basicSalary;
    private double daPercentage; // Dearness Allowance percentage
    private double hraPercentage; // House Rent Allowance percentage

    // Method to get data from user
    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER EMPLOYEE NAME: ");
        name = sc.nextLine();

        System.out.print("ENTER CITY: ");
        city = sc.nextLine();

        System.out.print("ENTER MONTHLY BASIC SALARY: ");
        basicSalary = sc.nextDouble();

        System.out.print("ENTER DA PERCENTAGE: ");
        daPercentage = sc.nextDouble();

        System.out.print("ENTER HRA PERCENTAGE: ");
        hraPercentage = sc.nextDouble();
    }

    // Method to calculate total salary
    public double calculate() {
        double daAmount = basicSalary * daPercentage / 100;
        double hraAmount = basicSalary * hraPercentage / 100;
        return basicSalary + daAmount + hraAmount;
    }

    // Method to display employee details and total salary
    public void display() {
        double totalSalary = calculate();
        System.out.println("\nEMPLOYEE DETAILS:");
        System.out.println("NAME: " + name);
        System.out.println("CITY: " + city);
        System.out.println("BASIC SALARY: " + basicSalary);
        System.out.println("DEARNESS ALLOWANCE (DA%): " + daPercentage);
        System.out.println("HOUSE RENT ALOWANCE (HRA%): " + hraPercentage);
        System.out.println("TOTAL MONTHLY SALARY: " + totalSalary);
    }

    // Main method
    public static void main(String[] args) {
        Employee employee = new Employee();
        
        // Get employee data from user
        employee.getData();
        
        // Display employee details and total salary
        employee.display();
    }
}