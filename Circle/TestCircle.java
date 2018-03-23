/**
 * Developer: Nathan Kurz
 * Date: 03/22/2018
 * 
 * FILE: TestCircle.java
 * This class tests the Circle class (see Circle.java for documentation)
 */

 public class TestCircle {
     public static void main(String[] args) {
        // Create a circle with radius 1
        Circle c1 = new Circle(1);
        System.out.println("The radius of circle 1 is: " + c1.getRadius());
        System.out.println("The area of circle 1 is: " + c1.getArea());

        // Create a circle with radius 25
        Circle c2 = new Circle(25);
        System.out.println("The radius of circle 2 is: " + c2.getRadius());
        System.out.println("The area of circle 2 is: " + c2.getArea());
        
        // Create a circle with radius 125
        Circle c3 = new Circle(125);
        System.out.println("The radius of circle 3 is: " + c3.getRadius());
        System.out.println("The area of circle 3 is: " + c3.getArea());

        // Modify circle radius
        c3.setRadius(100);
        System.out.println("Circle 3 now has a radius  of " + c3.getRadius() + " and an area of " + 
        c3.getArea());

        // Print the perimeter of circle 3
        System.out.println("The perimeter of circle 3 is: " + c3.getPerimeter());

     }
 }