import java.util.Scanner;

// Base class BankAccount
class BankAccount {
    protected double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
        }
    }

    // Deposit method to add money to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method to take money out of the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Subclass SavingsAccount that overrides the withdraw method
class SavingsAccount extends BankAccount {

    // Constructor for SavingsAccount
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override withdraw method to prevent balance from going below 100
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if ((balance - amount) < 100) {
            System.out.println("Cannot withdraw: Insufficient funds to maintain a minimum balance of 100.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for initial balance
        System.out.print("Enter initial balance for the account: ");
        double initialBalance = scanner.nextDouble();

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(initialBalance);

        // Main loop for the user to interact with the account
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    break;
                case 2:
                    // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    savingsAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    // Check Balance
                    System.out.println("Current balance: " + savingsAccount.getBalance());
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Thank you for using the banking system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
