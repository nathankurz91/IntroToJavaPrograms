/**
 * Developer: Nathan Kurz
 * 
 * Program converts Fahrenheit to Celcius
 * celcius = (5/9)(fahrenheit - 32)
 */

 import java.util.*;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a degree in Fahreheit: ");
        double fDegree = in.nextDouble();

        // convert to celcius
        double cDegree = (5.0 / 9.0) * (fDegree - 32.0);

        System.out.println(fDegree + " degrees fahrenheit is " + cDegree + " degrees Celcius.");
    }
}