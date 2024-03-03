package com.edu.MavenTest;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; // Import Statement for closing resources
import java.util.Scanner;


/*Problem Statement: 
App Name: Abcd Bank

if a person wants to open a new bank account,
he need to provide some details.Assume all details are there.
 
Design a program like menu app,
which shld allow to 
1)open new account
2)Modify the Personal details.
3)if balance <100,it shld throw "Less balance Message"
4)if he tries to close the account within 60 days of opening the acoount,it shld throw a exeception msg "You are not allowed to close account ".
5)display acount info,based on accountno.
jan30 2024  */

/**
 * @author Ashish
 *
 */

public class JdbcAssignment1 {

    static Scanner sc = new Scanner(System.in);
    static Connection con = null;
    static PreparedStatement stmt = null;

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC driver and establish connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "ashish26");

            // Create accounts table if it doesn't exist
            createTable();

            // Main menu loop
            while (true) {
                // Display menu options
                System.out.println("\n1. Open new account");
                System.out.println("2. Modify personal details");
                System.out.println("3. Check balance");
                System.out.println("4. Close account");
                System.out.println("5. Display account info");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                // Perform actions based on user choice
                switch (choice) {
                    case 1:
                        openAccount();
                        break;
                    case 2:
                        modifyDetails();
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        closeAccount();
                        break;
                    case 5:
                        displayInfo();
                        break;
                    case 6:
                        System.out.println("Exiting program.");
                        closeResources(); // Close resources before exiting
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources(); // Ensure resources are closed even with exceptions
        }
    }

    // Method to create the accounts table if it doesn't exist
    static void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS accounts " +
                     "(account_number INT NOT NULL AUTO_INCREMENT, " +
                     " name VARCHAR(255), " +
                     " balance INT, " +
                     " opening_date DATE, " +
                     " PRIMARY KEY ( account_number ))";

        if (con != null) { // Check connection before initializing stmt
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate(sql);
        } else {
            System.out.println("Connection failed.");
        }
    }
    
    // Method to open a new account
    static void openAccount() throws SQLException {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter opening date (YYYY-MM-DD): ");
        String openingDate = sc.nextLine();

        String sql = "INSERT INTO accounts (name, balance, opening_date) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, 0);
        preparedStatement.setString(3, openingDate);
        preparedStatement.executeUpdate();
        System.out.println("Account opened successfully.");
    }
     
    // Method to modify personal details
    static void modifyDetails() throws SQLException {
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine(); // Consume newline character

        System.out.print("Enter new name: ");
        String newName = sc.nextLine();

        String sql = "UPDATE accounts SET name = ? WHERE account_number = ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, newName);
        preparedStatement.setInt(2, accountNumber);
        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Personal details modified successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to check balance
    static void checkBalance() throws SQLException {
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine(); // Consume newline character

        String sql = "SELECT balance FROM accounts WHERE account_number = ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1, accountNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int balance = resultSet.getInt("balance");
            if (balance < 100) {
                System.out.println("Warning: Low balance!");
            }
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to close an account
    static void closeAccount() throws SQLException {
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine(); // Consume newline character

        System.out.print("Enter closing date (YYYY-MM-DD): ");
        String closingDate = sc.nextLine();

        String openingDateQuery = "SELECT opening_date FROM accounts WHERE account_number = ?";
        PreparedStatement preparedStatement = con.prepareStatement(openingDateQuery);
        preparedStatement.setInt(1, accountNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Date openingDate = resultSet.getDate("opening_date");
            long differenceInDays = (Date.valueOf(closingDate).getTime() - openingDate.getTime()) / (1000 * 60 * 60 * 24);
            if (differenceInDays < 60) {
                throw new IllegalArgumentException("You are not allowed to close account within 60 days of opening.");
            } else {
                String sql = "DELETE FROM accounts WHERE account_number = ?";
                preparedStatement = con.prepareStatement(sql);
                preparedStatement.setInt(1, accountNumber);
                preparedStatement.executeUpdate();
                System.out.println("Account closed successfully.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to display account information
    static void displayInfo() throws SQLException {
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine(); // Consume newline character

        String sql = "SELECT * FROM accounts WHERE account_number = ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1, accountNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            System.out.println("Account Number: " + resultSet.getInt("account_number"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Balance: $" + resultSet.getInt("balance"));
            System.out.println("Opening Date: " + resultSet.getDate("opening_date"));
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to close resources (PreparedStatement, Connection, Scanner)
    private static void closeResources() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            sc.close(); // Close Scanner to avoid resource leaks
        }
    }
}
