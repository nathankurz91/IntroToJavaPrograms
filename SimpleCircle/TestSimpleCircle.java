/**
 * Developer: Nathan Kurz
 * Date: 04/22/2018
 * File: TestSimpleCircle.java
 */

 public class TestSimpleCircle {
     public static void main(String[] args) {
         
        // Create a circle with a radius
        SimpleCircle testCircle = new SimpleCircle(1);

        // Display components
        System.out.println();
        System.out.println("The radius of this circle is: " + testCircle.radius);
        System.out.println("The area of this circle is: " + testCircle.getArea());
        System.out.println("The Perimeter of this circle is: " + testCircle.getPerimeter());
        System.out.println();

        // Change radius
        testCircle.setRadius(2);

        // Display components
        System.out.println();
        System.out.println("The radius of this circle is: " + testCircle.radius);
        System.out.println("The area of this circle is: " + testCircle.getArea());
        System.out.println("The Perimeter of this circle is: " + testCircle.getPerimeter());
        System.out.println();

        testCircle.setRadius(5);

        System.out.println();
        System.out.println("The radius of this circle is: " + testCircle.radius);
        System.out.println("The area of this circle is: " + testCircle.getArea());
        System.out.println("The Perimeter of this circle is: " + testCircle.getPerimeter());
        System.out.println();


     }
 }