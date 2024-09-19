public class Student {
    private String registrationNumber;
    private String name;
    private int age;

    // Constructor
    public Student(String registrationNumber, String name, int age) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for registration number
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class UGStudent extends Student {
    private int semester;
    private double fees;
    private static int ugCount = 0; // Static counter for UG admissions

    // Constructor
    public UGStudent(String registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
        ugCount++; // Increment UG admissions count
    }

    // Getter and Setter for semester
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Getter and Setter for fees
    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    // Override method to display UG student details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: $" + fees);
    }

    // Static method to get UG admissions count
    public static int getUGCount() {
        return ugCount;
    }
}
public class PGStudent extends Student {
    private int semester;
    private double fees;
    private static int pgCount = 0; // Static counter for PG admissions

    // Constructor
    public PGStudent(String registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
        pgCount++; // Increment PG admissions count
    }

    // Getter and Setter for semester
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Getter and Setter for fees
    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    // Override method to display PG student details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: $" + fees);
    }

    // Static method to get PG admissions count
    public static int getPGCount() {
        return pgCount;
    }
}
public class StudentApp {
    public static void main(String[] args) {
        // Create UG students
        UGStudent ug1 = new UGStudent("UG1001", "Alice", 19, 2, 15000);
        UGStudent ug2 = new UGStudent("UG1002", "Bob", 20, 3, 16000);

        // Create PG students
        PGStudent pg1 = new PGStudent("PG2001", "Charlie", 23, 1, 20000);
        PGStudent pg2 = new PGStudent("PG2002", "Diana", 24, 2, 21000);

        // Display UG students' details
        System.out.println("UG Students:");
        ug1.displayDetails();
        System.out.println();
        ug2.displayDetails();
        System.out.println();

        // Display PG students' details
        System.out.println("PG Students:");
        pg1.displayDetails();
        System.out.println();
        pg2.displayDetails();
        System.out.println();

        // Display total number of UG and PG admissions
        System.out.println("Total number of UG admissions: " + UGStudent.getUGCount());
        System.out.println("Total number of PG admissions: " + PGStudent.getPGCount());
    }
}