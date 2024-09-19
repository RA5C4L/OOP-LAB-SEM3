import java.util.Scanner;
public class Book {
    // Data members
    private String title;
    private String author;
    private String edition;

    // Constructor to initialize all fields
    public Book(String title, String author, String edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Edition: " + edition);
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Method to sort an array of Book objects by title in ascending order
    public static void sortBooksByTitle(Book[] books) {
        int n = books.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (books[i].getTitle().compareTo(books[j].getTitle()) > 0) {
                    // Swap books[i] and books[j]
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an array of Book objects
        Book[] books = new Book[6];
        books[0] = new Book("Java Programming", "John Doe", "1st");
        books[1] = new Book("Data Structures", "Alice Smith", "3rd");
        books[2] = new Book("Effective Java", "Joshua Bloch", "2nd");
        books[3] = new Book("Design Patterns", "Erich Gamma", "1st");
        books[4] = new Book("Algorithms", "Robert Sedgewick", "4th");
        books[5] = new Book("Introduction to Algorithms", "Thomas H. Cormen", "3rd");

        // Sort the array of books by title
        sortBooksByTitle(books);

        // Get the author name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author name to search for: ");
        String authorName = scanner.nextLine();

        // Display books written by the specified author
        System.out.println("\nBooks by " + authorName + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                book.display();
            }
        }

        // Close the scanner
        scanner.close();
    }
}