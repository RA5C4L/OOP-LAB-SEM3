public class Student_Detail {
    // Member variables
    private String name;
    private int id;
    private String college_name;

    // Constructor to initialize the member variables
    public Student_Detail(String name, int id, String college_name) {
        this.name = name;
        this.id = id;
        this.college_name = college_name;
    }

    // Method to display the student details
    public void display_details() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College: " + college_name);
    }

    // Main method to test the Student_Detail class
    public static void main(String[] args) {
        // Create a Student_Detail object for a student
        Student_Detail student1 = new Student_Detail("Hari", 12345, "MIT");
        Student_Detail student2= new Student_Detail("Dev", 12346, "MIT");
        Student_Detail student3 = new Student_Detail("Jose", 12347, "MIT");

        // Display the details of the student
        student1.display_details();
        student2.display_details();
        student3.display_details();
    }
}