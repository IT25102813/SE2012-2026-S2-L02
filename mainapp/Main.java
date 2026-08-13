package mainapp;

import java.util.Scanner;
import models.Student;
import services.EnrollmentManager;

/**
 * Entry point for the Student Management System application
 * Manages user interactions and add, list students
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnrollmentManager manager = new EnrollmentManager();

        boolean running = true;

        while(running) {
            System.out.println("\n Student Management System ");
            System.out.println("1. Add Student");
            System.out.println("2. List Student");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Sort Students by Name");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    if (manager.addStudent(new Student(id, name))) {
                        System.out.println("Student added successfully");
                    } else {
                        System.out.println("Student list already fulled");
                    }

                    break;

                case 2:
                    System.out.println("\n Enrolled Students ");

                    if (manager.getStudentCount() == 0) {
                        System.out.println("No Student found");
                    } else {
                        Student[] list = manager.getStudents();
                        for (int i = 0; i < list.length; i++) {
                            System.out.printf("%d. %s%n", (i+1), list[i].toString());
                        }
                    }

                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    String searchId = scanner.nextLine();

                    Student found = manager.searchStudentById(searchId);

                    if (found != null) {
                        System.out.println("Student Found -> " + found);
                    } else {
                        System.out.println("No student found with ID: " + searchId);
                    }

                    break;

                case 4:
                    if (manager.getStudentCount() == 0) {
                        System.out.println("No students available to sort");
                    } else {
                        manager.sortStudentsByName();
                        System.out.println("Students successfully sorted alphabetically by name");
                    }

                    break;

                case 5:
                    System.out.println("Exiting Application");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option\nPlease try again");
            }
        }

        scanner.close();
    }
}
