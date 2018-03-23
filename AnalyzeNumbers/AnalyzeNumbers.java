/**
 * Developer: Nathan Kurz
 * Date: 03/22/2018
 * 
 * FILE: Analyze Numbers
 * Program reads n numbers, finds the average, and finds the number of items greater than the average.
 */

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = scan.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i =0; i < n; i++) {
            numbers[i] = scan.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        int count = 0; // The number of elements above the average
        for (int i = 0; i < n; i++) {
            if(numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Average is: " + average);
        System.out.println("Number of elements above the average: " + count);
    }
}