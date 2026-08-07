import java.util.Scanner;
/**
 * Entry point for the Student Management System application
 * Manages user interactions and add, list students
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[100];

        int stdCount = 0;

        boolean running = true;

        while(running) {
            System.out.println("\n Student Management System ");
            System.out.println("1. Add Student");
            System.out.println("2. List Student");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    students[stdCount] = new Student(id, name);
                    stdCount++;

                    System.out.println("Student Added");
                    break;

                case 2:
                    System.out.println("\n Enrolled Students ");

                    if (stdCount == 0) {
                        System.out.println("No student added");
                    }
                    else {
                        for (int i = 0; i < stdCount; i++) {
                            System.out.println("Student #"+ (i+1) +
                                "\nStudent ID: " + students[i].getStdId() +
                                "\nStudent Name: " + students[i].getStdName());
                        }
                    }
                    break;

                case 3:
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
