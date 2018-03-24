/**
 * Developer: Nathan Kurz
 * Date: 03/22/2018
 * 
 * FILE: Loan.java
 */

import java.util.Date;

public class Loan {
    // PRIVATE MEMBERS
     private double annualInterestRate;
     private int numberOfYears;
     private double loanAmount;
     private Date loanDate;

     // CONSTRUCTORS
     public Loan() {
         this(2.5, 1, 1000);
     }

     public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
         this.annualInterestRate = annualInterestRate;
         this.numberOfYears = numberOfYears;
         this. loanAmount = loanAmount;
         loanDate = new Date();
     }

     // Getters and Setters
     public double getAnnualInterestRate() {
         return annualInterestRate;
     }

     public void setAnnualInterestRate(double annualInterestRate) {
         this.annualInterestRate = annualInterestRate;
     }

     public int getNumberOfYears() {
         return numberOfYears;
     }

     public void setNumberOfYears(int numberOfYears) {
         this.numberOfYears = numberOfYears;
     }

     public double getLoanAmount() {
         return loanAmount;
     }

     public void setLoanAmount(double loanAmount) {
         this.loanAmount = loanAmount;
     }

     // Find monthly payment
     public double getMonthlyPayment() {
         double monthlyInterestRate = annualInterestRate / 1200;
         double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
         return monthlyPayment;
     }

     // Find total payment
     public double getTotalPayment() {
         double totalPayment = getMonthlyPayment() * numberOfYears * 12;
         return totalPayment;
     }

     // Return loan date
     public Date getLoanDate() {
         return loanDate;
     }


 }