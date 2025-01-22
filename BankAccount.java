package com.wiprotraining;

	import java.util.Scanner;

	public class BankAccount {

	    // Instance variables
	    String accountHolderName;
	    int balance;

	    // Constructor to initialize account holder name and balance
	    public BankAccount(String accountHolderName, int initialBalance) {
	        this.accountHolderName = accountHolderName;
	        this.balance = initialBalance;
	    }

	    // Method to deposit money into the account
	    public void deposit(int amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw money from the account
	    public void withdraw(int amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient funds for withdrawal.");
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	    // Method to check the balance of the account
	    public void checkBalance() {
	        System.out.println("Current Balance: " + balance);
	    }

	    // Main method to test the BankAccount class
	    public static void main(String[] args) {
	        // Create a new bank account
	        BankAccount account = new BankAccount("John Doe", 1000);

	        // Create a Scanner object for input
	        Scanner scanner = new Scanner(System.in);

	        // Show menu for account operations
	        while (true) {
	            System.out.println("\nBank Account Menu:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    // Deposit money
	                    System.out.print("Enter deposit amount: ");
	                    int depositAmount = scanner.nextInt();
	                    account.deposit(depositAmount);
	                    break;
	                case 2:
	                    // Withdraw money
	                    System.out.print("Enter withdrawal amount: ");
	                    int withdrawAmount = scanner.nextInt();
	                    account.withdraw(withdrawAmount);
	                    break;
	                case 3:
	                    // Check balance
	                    account.checkBalance();
	                    break;
	                case 4:
	                    // Exit the program
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option, please try again.");
	            }
	        }
	    }
	}

