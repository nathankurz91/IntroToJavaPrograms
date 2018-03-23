/**
 * Developer: Nathan Kurz
 * 
 * Program displays amount of time given in seconds in minutes and seconds
 */

 import java.util.*;

 public class DisplayTime {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         // Prompt user for input
         System.out.println("Enter the amount of time in seconds: ");

         int seconds = in.nextInt();
         int minutes = seconds / 60; // find minutes
         int remainingSeconds = seconds % 60; // find remaining seconds

         System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
         
     }
 }

