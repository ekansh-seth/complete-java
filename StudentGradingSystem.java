
Here’s a comprehensive example of using a switch statement in Java to build a menu-driven student grading system. This code demonstrates multiple cases, nested logic, and default handling—all wrapped in a clean structure.


import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== Student Grading Menu =====");
            System.out.println("1. Enter Student Marks");
            System.out.println("2. Calculate Grade");
            System.out.println("3. Display Grade Description");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            int marks = 0;
            char grade = 'F';

            switch (choice) {
                case 1:
                    System.out.print("Enter student marks (0100): ");
                    marks = scanner.nextInt();
                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid marks. Please enter between 0 and 100.");
                    } else {
                        System.out.println("Marks recorded: " + marks);
                    }
                    break;

                case 2:
                    System.out.print("Enter marks to calculate grade: ");
                    marks = scanner.nextInt();
                    switch (marks / 10) {
                        case 10:
                        case 9:
                            grade = 'A';
                            break;
                        case 8:
                            grade = 'B';
                            break;
                        case 7:
                            grade = 'C';
                            break;
                        case 6:
                            grade = 'D';
                            break;
                        default:
                            grade = 'F';
                    }
                    System.out.println("Calculated Grade: " + grade);
                    break;

                case 3:
                    System.out.print("Enter grade (A-F): ");
                    grade = scanner.next().toUpperCase().charAt(0);
                    switch (grade) {
                        case 'A':
                            System.out.println("Excellent performance!");
                            break;
                        case 'B':
                            System.out.println("Very good. Keep it up!");
                            break;
                        case 'C':
                            System.out.println("Good. You can do better.");
                            break;
                        case 'D':
                            System.out.println("Fair. Needs improvement.");
                            break;
                        case 'F':
                            System.out.println("Failed. Work harder next time.");
                            break;
                        default:
                            System.out.println("Invalid grade entered.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }

        scanner.close();
    }
}




- Uses nested switch for grade calculation and description.
- Handles invalid inputs gracefully.
- Demonstrates real-world use of switch in a looped menu system.
Would you like a version using enum or switch with Java 14+ enhancements like switch expressions?
