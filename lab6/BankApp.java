import java.util.Scanner;

// Base class for Account
abstract class Account {
    protected String customerName;
    protected String accNo;
    protected double balance;
    
    public Account(String customerName, String accNo, double initialBalance) {
        this.customerName = customerName;
        this.accNo = accNo;
        this.balance = initialBalance;
    }
    
    public abstract void deposit(double amount);
    
    public abstract void withdraw(double amount);
    
    public abstract void displayBalance();
    
    public abstract void computeInterest();

    public abstract void checkMinimumBalance();
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String getAccNo() {
        return accNo;
    }
    
    public double getBalance() {
        return balance;
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    private static final double MIN_BALANCE = 1000.0;
    private static final double SERVICE_CHARGE = 150.0;
    
    public CurrentAccount(String customerName, String accNo, double initialBalance) {
        super(customerName, accNo, initialBalance);
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    
    @Override
    public void displayBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
    
    @Override
    public void computeInterest() {
        // No interest for current account
    }
    
    public void checkMinimumBalance() {
        if (balance < 1000) {
            balance -= 150;
            System.out.println("Service charge imposed. New balance: " + balance);
        }
    }
}

// SavingsAccount class
class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04; // 4% interest rate
    
    public SavingsAccount(String customerName, String accNo, double initialBalance) {
        super(customerName, accNo, initialBalance);
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
        if(balance<1000){
            checkMinimumBalance();
        }
    }
    
    @Override
    public void displayBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
    
    @Override
    public void computeInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + balance);
    }
    public void checkMinimumBalance() {
        if (balance < 1000) {
            balance -= 150;
            System.out.println("Below Minimum Balance,Service charge imposed.New balance: " + balance);
        }
    }
}

// Main class to handle user interaction
public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter account type (current/savings): ");
        String accountType = scanner.nextLine().toLowerCase();
        
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();
        
        System.out.println("Enter account number: ");
        String accNo = scanner.nextLine();
        
        System.out.println("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        Account account;
        if (accountType.equalsIgnoreCase("current")) {
            account = new CurrentAccount(customerName, accNo, initialBalance);
        } else if (accountType.equalsIgnoreCase("savings")) {
            account = new SavingsAccount(customerName, accNo, initialBalance);
        } else {
            System.out.println("Invalid account type.");
            return;
        }
        
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an action: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Compute Interest");
            System.out.println("5. Check Minimum Balance");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    account.computeInterest();
                    break;
                case 5:
                    account.checkMinimumBalance();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        
        scanner.close();
    }
}