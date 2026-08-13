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
    * @param student The student object to add
    * @return if added successfully, false if storage is full
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
    * Retrieves an array containing all the students
    * @return an array of active student records
    */
    public Student[] getStudents(){
        Student[] activeStudents = new Student[stdCount];
        System.arraycopy(students, 0, activeStudents, 0, stdCount);
        return activeStudents;
    }

    /**
     * Gets the number of currently enrolled students
     * @return Number of enrolled students.
     */
     public int getStudentCount() {
         return stdCount;
    }

    /**
    * Performs a Linear Search to find a student by ID.
    * @param studentId The student ID to search for.
    * @return The Student object if found, or null if not found.
    */
    public Student searchStudentById(String studentId) {
        for (int i = 0; i < stdCount; i++) {
            if (students[i].getStdId().equalsIgnoreCase(studentId)) {
                return students[i]; // Return matched student object
            }
        }
        return null; // Not found
    }

    /**
    * Sorts the student list alphabetically by name using the Bubble Sort algorithm.
    */
    public void sortStudentsByName() {
        for (int i = 0; i < stdCount - 1; i++) {
            for (int j = 0; j < stdCount - i - 1; j++) {
                // Compare adjacent student names ignoring case
                if (students[j].getStdName().compareToIgnoreCase(students[j + 1].getStdName()) > 0) {
                    // Swap adjacent array elements
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
 }
