package TaxCalculator;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        double price = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a price: ");
        price = input.nextDouble();

        double taxRate = (price>=1000) ? .08 : .18;
        double tax = price * taxRate;

        double totalPrice = price + tax;

        System.out.println(String.format("Price : %.2f", price));
        System.out.println(String.format("Tax Rate : %.2f", taxRate));
        System.out.println(String.format("Tax Value : %.2f", tax));
        System.out.println(String.format("Total Price : %.2f", totalPrice));







    }
}
