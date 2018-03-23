/**
 * Developer: Nathan Kurz
 * Date: 03/22/2018
 * 
 * FILE: Circle.java
 * This class represents a simple circle object
 */

 public class Circle {
     // Radius of a circle
     private double radius;

     // Constructors
     Circle() {}
     Circle(double radius) {
         this.radius = radius;
     }

     public double getRadius() {
         return this.radius;
     }

     // Return area of the circle
     public double getArea() {
         return radius * radius * Math.PI;
     }

     // Return perimeter
     public double getPerimeter() {
         return 2 * radius * Math.PI;
     }

     // Set new radius
     public void setRadius(double radius) {
        this.radius = radius;
     }


 }