/**
 * Developer: Nathan Kurz
 * Date: 03/22/2018
 * 
 * FILE: TestPoint2D.java
 * This program is to simply test the Point2D class in the javafx.geometry package
 */

 import java.util.Scanner;
 import javafx.geometry.Point2D;

 public class TestPoint2D {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         System.out.println("Enter first point's x and y coordinates: ");
         double x1 = scan.nextDouble();
         double y1 = scan.nextDouble();
         Point2D p1 = new Point2D(x1, y1);  // Create new Point2D object

         System.out.println("Enter second point's x and y coordinates: ");
         double x2 = scan.nextDouble();
         double y2 = scan.nextDouble();
         Point2D p2 = new Point2D(x2, y2);  // Create new Point2D object

         System.out.println("p1 is " + p1.toString());
         System.out.println("p2 is " + p2.toString());

         System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
     }
 }