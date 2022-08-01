package GroceryCart;

import java.util.Scanner;

public class GroceryCart {
    public static void main(String[] args) {
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = .95;
        double eggplantPrice = 5.0;

        int kilogram = 0;
        double totalPrice = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("How many kilos of Pear? : ");
        kilogram = input.nextInt();

        totalPrice += kilogram * pearPrice;

        System.out.print("How many kilos of Apple? : ");
        kilogram = input.nextInt();

        totalPrice += kilogram * applePrice;

        System.out.print("How many kilos of Tomato? : ");
        kilogram = input.nextInt();

        totalPrice += kilogram * tomatoPrice;

        System.out.print("How many kilos of Banana? : ");
        kilogram = input.nextInt();

        totalPrice += kilogram * bananaPrice;

        System.out.print("How many kilos of Eggplant? : ");
        kilogram = input.nextInt();

        totalPrice += kilogram * eggplantPrice;


        System.out.print(String.format("Total price is : %.2f", totalPrice));


    }
}
