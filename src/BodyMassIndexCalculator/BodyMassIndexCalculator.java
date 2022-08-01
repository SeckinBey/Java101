package BodyMassIndexCalculator;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        double height_meter = 0.0;
        double weight_kg = 0.0;
        double bodyMassIndex =0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height as meter: ");
        height_meter = input.nextDouble();

        System.out.print("Enter your weight as kg: ");
        weight_kg = input.nextDouble();

        bodyMassIndex = weight_kg / Math.pow(height_meter,2);

        System.out.print(String.format("Your body mass index is: %.2f", bodyMassIndex));


    }
}
