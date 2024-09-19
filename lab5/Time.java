import java.util.Scanner;
public class Time {
    // Data members for hours, minutes, and seconds
    private int hours;
    private int minutes;
    private int seconds;

    // Default constructor initializing time to zero
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Parameterized constructor initializing time to fixed values
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize(); // Normalize time to handle cases where seconds or minutes are > 60
    }

    // Method to normalize time (i.e., handle overflow)
    private void normalize() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
        // Optionally, handle overflow of hours if needed
    }

    // Method to display time in hh:mm:ss format
    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Method to add two Time objects
    public static Time add(Time t1, Time t2) {
        int totalSeconds = t1.seconds + t2.seconds;
        int totalMinutes = t1.minutes + t2.minutes + totalSeconds / 60;
        int totalHours = t1.hours + t2.hours + totalMinutes / 60;

        totalSeconds = totalSeconds % 60;
        totalMinutes = totalMinutes % 60;

        Time tt=new Time(totalHours, totalMinutes, totalSeconds);
        tt.normalize();
        return tt;
    }

    // Main method to test the Time class
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER HOURS MINUTES AND SECONDS FOR T1:");
        Time time1 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()); 
        System.out.println("ENTER HOURS MINUTES AND SECONDS FOR T2:");
        Time time2 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.print("Time 1: ");
        time1.display();

        System.out.print("Time 2: ");
        time2.display();

        Time result = Time.add(time1, time2);

        System.out.print("Sum of Time 1 and Time 2: ");
        result.display();
    }
}