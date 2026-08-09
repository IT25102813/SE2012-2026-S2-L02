package services;

import models.Student;

/**
 * Manages student records, offering operations for adding, searching and sorting enrolled Students.
 */

 public class EnrollmentManager {
     private Student[] students;
     private int stdCount;

     /**
      * Creates Enrollment Manager with capacity of 100 students
      */
      public EnrollmentManager() {
          this.students = new Student[100];
          this.stdCount = 0;
      }

      /**
       * Adds a student to the array
       */
       public boolean addStudent(Student student) {
           if (stdCount < students.length) {
               students[stdCount] = student;
               stdCount++;
               return true;
           }
           return false;
       }

       /**
        * Retrieves an array containing all the students.
        */
        public Student[] getStudents(){

        }
 }
