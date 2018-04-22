/**
 * Developer: Nathan Kurz
 * Date: 04/22/2018
 * File: SimpleCircle.java
 */

 public class SimpleCircle {
     
    // Radius of this circle
    double radius = 1;

    // Constructor
    SimpleCircle() {

    }

    // Constructor
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    // Return area of this circle
    double getArea() {
        return radius * radius * Math.PI;
    }

    // Return the perimeter of the circle
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Setter for radius
    void setRadius(double newRadius) {
        radius = newRadius;
    }
 }