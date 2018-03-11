/**
 * Developer: Nathan Kurz
 * 
 * Compute the area of a circle with console input
 */

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        
        // Request input from user
        System.out.println("\nEnter the radius:");

        // Create scanner to read input
        Scanner in = new Scanner(System.in);

        // Store input from user
        double radius = in.nextDouble();

        // Compute area
        double area = radius * radius * 3.14;

        System.out.println("The area of a circle with radius " + radius + " is: " + area + "\n");

        // Compute results
    }
}
