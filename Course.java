package CP;

import java.util.Scanner;

public class Course {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int javaCounter = 1;
        int pythonCounter = 1;
        int phpCounter = 1;

        while (true) {
            System.out.print("Enter your name (or type 'exit' to quit): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            System.out.println("Available courses: 1. Java, 2. Python, 3. PHP");
            System.out.print("Enter the number corresponding to your desired course: ");
            int courseChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            String courseId;
            switch (courseChoice) {
                case 1:
                    courseId = "java" + javaCounter++;
                    break;
                case 2:
                    courseId = "python" + pythonCounter++;
                    break;
                case 3:
                    courseId = "php" + phpCounter++;
                    break;
                default:
                    System.out.println("Invalid course choice. Please choose a valid course.");
                    continue;
            }

            System.out.println("Hello, " + name + "! Your course ID is: " + courseId);
            System.out.println(); // Add a newline for better readability
        }

        scanner.close();
    }
}