import java.util.ArrayList;
import java.util.Scanner;

/**
 * Dev: Nathan Kurz
 * Date: 04/22/2018
 * File: TestCourse.java
 */

 public class TestCourse {
     public static void main(String[] args) {

        ArrayList<Course> courses = new ArrayList<Course>();

         // Create a scanner object
         Scanner scan = new Scanner(System.in);

         char check;

         // Create space for terminal clarity
         System.out.println("\n\n\n\n\n");

         do {
            
            System.out.println("Create a Course.");
            System.out.println("Enter the name of the class: ");
            Course course = new Course(scan.nextLine());
            
            System.out.println("\nAdd student names to course.");

            char add = 'y';
            while (add == 'y') {
                System.out.println("Student name: ");
                String studentName = scan.nextLine();
                course.addStudent(studentName);
                System.out.println("Would you like to remove the student? ('y' or n'): ");
                char rm = scan.next().charAt(0);
                if (rm == 'y') {
                    course.dropStudent(studentName);
                }
                System.out.println("\nWould you like to add another student? ('y' or 'n'): ");
                add = scan.next().charAt(0);
                scan.nextLine();
                System.out.println();
            }

            courses.add(course);
            
            System.out.println("\nWould you like to create another course? ('y' or 'n'): ");
            check = scan.next().charAt(0);
            scan.nextLine();
         } while (check == 'y');

         System.out.println("List of courses created during session: ");
         int courseCounter = 1;
         for (Course c: courses) {
             System.out.println("Course " + courseCounter + ": " + c.getCourseName());
             courseCounter++;
         }

         

     }
 }