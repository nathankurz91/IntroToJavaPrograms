import java.util.Scanner;

/**
 * Dev: Nathan Kurz
 * Date: 04/22/2018
 * File: TestLoan.java
 */

 public class TestLoan {
     public static void main(String[] args) {
         
        // Create a scanner
        Scanner scan = new Scanner(System.in);

        // Create Loan object
        Loan newLoan = new Loan();

        // Enter annual interest rate
        System.out.println("Enter annual interest rate: ");
        newLoan.setAnnualInterestRate(scan.nextDouble());

        // Enter number of years
        System.out.println("Enter number of years: ");
        newLoan.setNumberOfYears(scan.nextInt());

        // Enter loan amount
        System.out.println("Enter loan amount: ");
        newLoan.setLoanAmount(scan.nextDouble());

        // Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\n" + 
            "The total payment is %.2f\n", newLoan.getLoanDate(), newLoan.getMonthlyPayment(), 
            newLoan.getTotalPayment());
        
     }
 }