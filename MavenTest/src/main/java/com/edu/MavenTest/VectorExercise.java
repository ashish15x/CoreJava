package com.edu.MavenTest;


import java.util.Scanner;
import java.util.Vector;

public class VectorExercise {
    private static Vector<String> dataList = new Vector<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your input (1 to insert, 2 to delete, 3 to display, 4 to display duplicates, 5 to exit):");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter data to insert:");
                    String dataToInsert = sc.next();
                    insertData(dataToInsert);
                    break;
                case 2:
                    System.out.println("Enter data to delete:");
                    String dataToDelete = sc.next();
                    deleteData(dataToDelete);
                    break;
                case 3:
                    displayData();
                    break;
                case 4:
                    displayDuplicates();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid input! Please enter a valid option.");
                    break;
            }
        }
    }

    private static void insertData(String data) {
        dataList.add(data);
        System.out.println("Data inserted successfully.");
    }

    private static void deleteData(String data) {
        if (dataList.remove(data)) {
            System.out.println("Data deleted successfully.");
        } else {
            System.out.println("Data not found!");
        }
    }

    private static void displayData() {
        if (dataList.isEmpty()) {
            System.out.println("No data available.");
        } else {
            System.out.println("Data:");
            for (String data : dataList) {
                System.out.println(data);
            }
        }
    }

    private static void displayDuplicates() {
        Vector<String> duplicates = new Vector<>();
        for (String data : dataList) {
            if (dataList.indexOf(data) != dataList.lastIndexOf(data) && !duplicates.contains(data)) {
                duplicates.add(data);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate values:");
            for (String duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }
    }
}

