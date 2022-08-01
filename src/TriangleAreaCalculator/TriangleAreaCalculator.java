package TriangleAreaCalculator;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        double u = 0.0;
        double area = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side: ");
        a = input.nextDouble();

        System.out.print("Enter second side: ");
        b = input.nextDouble();

        System.out.print("Enter third side: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;

        area = Math.sqrt(u * (u - a) * (u  - b) * (u - c));
        System.out.print(String.format("Area of triangle is: %.2f m^2.", area));

    }
}
