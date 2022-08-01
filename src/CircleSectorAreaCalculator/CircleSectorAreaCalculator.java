package CircleSectorAreaCalculator;

import java.util.Scanner;

public class CircleSectorAreaCalculator {

    public static double PI = 3.14;

    public static void main(String[] args) {
        double r = 0.0;
        double alpha = 0.0;
        double circleSectorArea = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a r value: ");
        r = input.nextDouble();

        System.out.print("Enter a alpha value: ");
        alpha = input.nextDouble();

        circleSectorArea = PI * r * r * alpha / 360;
        System.out.print(String.format("Area of circle sector is: %.2f", circleSectorArea));

    }
}
