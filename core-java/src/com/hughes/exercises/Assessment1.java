package com.hughes.exercises;

/**
 * @author Ashish
 *
 */

class Account {   // Define the Account class
 // Attributes
 String accountId;
 String accountName;
 String address;
 double depositAmount;

 // Constructor to initialize Account object
 public Account(String accountId, String accountName, String address, double depositAmount) {
     this.accountId = accountId;
     this.accountName = accountName;
     this.address = address;
     this.depositAmount = depositAmount;
 }

 // Method to set account details
 public void getDetails(String accountId, String accountName, String address, double depositAmount) {
     this.accountId = accountId;
     this.accountName = accountName;
     this.address = address;
     this.depositAmount = depositAmount;
 }

 // Method to display account details
 public void showDetails() {
     System.out.println("Account ID: " + accountId);
     System.out.println("Account Name: " + accountName);
     System.out.println("Address: " + address);
     System.out.println("Amount: " + depositAmount);
 }
}


class Loan extends Account {  //Define the Loan class, extending Account
 String loanId;
 String loanType;
 double loanAmount;

 // Constructor to initialize Loan object
 public Loan(String accountId, String accountName, String address, double depositAmount, String loanId, String loanType) {
     super(accountId, accountName, address, depositAmount);
     this.loanId = loanId;
     this.loanType = loanType;
 }

 // Method to display loan details
 public void showLoanDetails() {
     System.out.println("Loan ID: " + loanId);
     System.out.println("Loan Type: " + loanType);
     System.out.println("Loan Amount: " + loanAmount);
 }
}

class Transaction extends Loan { //Define the Transaction class, extending Loan
 double amount;

 // Constructor to initialize Transaction object
 public Transaction(String accountId, String accountName, String address, double depositAmount, String loanId, String loanType) {
     super(accountId, accountName, address, depositAmount, loanId, loanType);
 }

 // Method to deposit amount
 public void depositAmount(double deposit) {
     depositAmount += deposit;
 }

 // Method to withdraw amount
 public void withdrawAmount(double withdraw) {
     if (withdraw <= depositAmount) {
         depositAmount -= withdraw;
     } else {
         System.out.println("Insufficient funds!");
     }
 }

 // Method to pay loan
 public void payLoan(double payment) {
     if (payment <= loanAmount) {
         loanAmount -= payment;
     } else {
         System.out.println("Invalid payment amount!");
     }
 }

 // Method to display account details
 public void showAccountDetails() {
     showDetails();
 }
}

//Main class
/**
 * @author singh
 *
 */
/**
 * @author singh
 *
 */
public class Assessment1 {
 public static void main(String[] args) {
     // Create an array of Account to store account details
     Account[] accounts = new Account[10];

     // Manually insert values into the array
     accounts[0] = new Account("1234567-ASDF", "Aman", "Address 1", 1000.00);
     accounts[1] = new Account("2345678-QWER", "Ankit", "Address 2", 2000.00);
     accounts[2] = new Account("2345679-QWER", "Suresh", "Address 3", 3000.00);
     accounts[3] = new Account("2345680-QWER", "Mahesh", "Address 4", 4000.00);
     accounts[4] = new Account("2345681-QWER", "Nikhil", "Address 5", 5000.00);
     accounts[5] = new Account("2345682-QWER", "Sahil", "Address 6", 6000.00);
     accounts[6] = new Account("2345683-QWER", "Manoj", "Address 7", 7000.00);
     accounts[7] = new Account("2345684-QWER", "Aryan", "Address 8", 8000.00);
     accounts[8] = new Account("2345685-QWER", "Ronit", "Address 9", 9000.00);
     accounts[9] = new Account("2345687-QWER", "Amit", "Address 10", 8500.00);

     // Perform transactions on a sample account
     Transaction t1 = new Transaction(accounts[5].accountId, accounts[5].accountName,
             accounts[5].address, accounts[5].depositAmount, "98765", "home");
     t1.depositAmount(1000);
     t1.withdrawAmount(200);
     t1.showAccountDetails();
 }
}
