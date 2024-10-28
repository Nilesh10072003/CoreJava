package assingment;

import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of a side of the square: ");
        double sideLength = scanner.nextDouble();

        double area = sideLength * sideLength;
        double perimeter = 4 * sideLength;

        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);

        scanner.close();
    }
}
