public class Bank {
    // Method to get the rate of interest
    public double getRateOfInterest() {
        return 0; // Default implementation
    }

    // Method to calculate interest based on a principal amount and time
    public double calculateInterest(double principal, int time) {
        double rate = getRateOfInterest();
        return (principal * rate * time) / 100;
    }
}
public class SBI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 8; // SBI provides an 8% rate of interest
    }
}

public class ICICI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 7; // ICICI provides a 7% rate of interest
    }
}

public class AXIS extends Bank {
    @Override
    public double getRateOfInterest() {
        return 9; // AXIS provides a 9% rate of interest
    }
}
public class SBSBSBS {
    public static void main(String[] args) {
        // Create instances of each bank
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        // Principal amount and time period
        double principal = 10000;
        int time = 2; // in years

        // Calculate and display interest for each bank
        System.out.println("Interest for SBI: $" + sbi.calculateInterest(principal, time));
        System.out.println("Interest for ICICI: $" + icici.calculateInterest(principal, time));
        System.out.println("Interest for AXIS: $" + axis.calculateInterest(principal, time));
    }
}