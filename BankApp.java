import java.util.Scanner;

class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private int pin;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = balance;
    }

    boolean login(int enteredPin) {
        if (enteredPin == pin) {
            return true;
        } else {
            return false;
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited Successfully");
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully");
            System.out.println("Updated Balance: " + balance);
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
    }
}

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1001, "Rahul", 1234, 5000.0);

        System.out.println("Welcome to Bank Application");

        System.out.println("Enter PIN:");
        int enteredPin = sc.nextInt();

        if (account.login(enteredPin)) {

            System.out.println("Login Successful");

            int choice;

            do {
                System.out.println();
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Amount");
                System.out.println("3. Withdraw Amount");
                System.out.println("4. Display Account Details");
                System.out.println("5. Exit");

                System.out.println("Enter your choice:");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        account.checkBalance();
                        break;

                    case 2:
                        System.out.println("Enter deposit amount:");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 3:
                        System.out.println("Enter withdrawal amount:");
                        double withdrawalAmount = sc.nextDouble();
                        account.withdraw(withdrawalAmount);
                        break;

                    case 4:
                        account.displayAccountDetails();
                        break;

                    case 5:
                        System.out.println("Thank you for using the Bank Application");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } while (choice != 5);

        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}
