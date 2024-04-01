package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        // Iterate from 1 to 10 and print the multiplication table
        for (int i = 0; i <= 10; i++) {
            if (i != 0) {
                System.out.println(i + " x " + numberTableToPrint + " = " + (i * numberTableToPrint));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MultiplicationTable tablePrinter = new MultiplicationTable();

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the entered number is positive
        if (number > 0) {
            // Print the multiplication table
            tablePrinter.printTable(number);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the scanner
        scanner.close();
    }
}
