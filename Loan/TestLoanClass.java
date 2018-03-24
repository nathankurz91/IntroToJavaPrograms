/**
 * Developer: Nathan Kurz
 * Date: 03/22/2018
 * 
 * FILE: TestLoanClass.java
 * Test file for Loan.java
 */
import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner scan = new Scanner(System.in);

        // Enter annual interest rate
        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = scan.nextDouble();

        // Enter number of years
        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = scan.nextInt();

        // Enter loan amount
        System.out.println("Enter loan amount, for example, 125000.00: ");
        double loanAmount = scan.nextDouble();

        // Create a loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        //Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total " +
        "payment is %.2f\n",loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}