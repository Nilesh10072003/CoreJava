package assingment;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
           
            System.out.println("Choose an option to calculate the perimeter:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    System.out.println("Perimeter of the square: " + calculateSquarePerimeter(side));
                    break;

                case 2:
                    
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.println("Perimeter of the rectangle: " + calculateRectanglePerimeter(length, width));
                    break;

                case 3:
                    
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Perimeter (circumference) of the circle: " + calculateCirclePerimeter(radius));
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

            System.out.println(); 
        } while (choice != 4);

        scanner.close();
    }

    
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    
    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    
    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
