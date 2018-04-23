/**
 * Dev: Nathan Kurz
 * Date: 04/22/2018
 * File: Course.java
 */

 public class Course {

     private String courseName;
     private String[] students = new String[100];
     private int numberOfStudents;

     public Course(String courseName) {
        this.courseName = courseName;
        System.out.println("\n" + courseName + " has been created.");
     }

     public void addStudent(String student) {
         students[numberOfStudents] = student;
         numberOfStudents++;
         System.out.println(student + " has been added to " + courseName + ".");
         System.out.println("The total number of students in the course is now: " + numberOfStudents);
     }

     public String[] getStudents() {
         return students;
     }

     public int getNumberOfStudents() {
         return numberOfStudents;
     }

     public String getCourseName() {
         return courseName;
     }

     public void dropStudent(String student) {
         for (int i = 0; i < numberOfStudents; i++) {
             if (student.equals(students[i])) {
                 for (int j = i; j < numberOfStudents; j++) {
                     students[j] = students[j++];
                 }
                 numberOfStudents--;
             }
         }
         System.out.println(student + " has been dropped from " + courseName + ".");
         System.out.println("The total number of students is now " + numberOfStudents);
     }
 }