/**
 * Developer: Nathan Kurz
 * 
 * Program generates two random numbers, sorts them to ensure the first integer is greater, 
 * and asks the user to provide an answer for the integer subtraction.
 */

 import java.util.Scanner;

 public class SubtractionQuiz {
     public static void main(String[] args) {
         // Randomly generate two integers between 0 and 99
         int rand1 = (int)(Math.random() * 100); //
         int rand2 = (int)(Math.random() * 100);

         // swap values if rand1 is less than rand2
         if (rand1 < rand2) {
             int temp = rand2;
             rand2 = rand1;
             rand1 = temp;
         }

         // Prompt student to answer subtraction
         System.out.println("What is " + rand1 + " - " + rand2 + "?");

         // Read input
         Scanner scan = new Scanner(System.in);
         int answer = scan.nextInt();

         
         if (answer == (rand1 - rand2)) {
             System.out.println("That is correct! Great work :)");
         } else { 
             System.out.println("Sorry... You are a dum dum");
             System.out.println("The correct answer should be: " + (rand1 - rand2));
         }
     }
 }