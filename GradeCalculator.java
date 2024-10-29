package assingment;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 4: ");
        int subject4 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 5: ");
        int subject5 = scanner.nextInt();

        // Calculate total and average marks
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5 ;
        double averageMarks = totalMarks / 5.0;

        // Determine grade based on average
        String grade;
        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 80) {
            grade = "B";
        } else if (averageMarks >= 70) {
            grade = "C";
        } else if (averageMarks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\nName: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}