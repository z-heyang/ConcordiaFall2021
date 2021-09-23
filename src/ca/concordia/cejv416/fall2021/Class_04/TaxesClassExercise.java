package ca.concordia.cejv416.fall2021.Class_04;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Date: 2021-09-23
 * Author:  Brendan Wood
 * The following program asks the user for an item price,
 * Then the quantity required.
 * Once obtained, it will add Canadian and Quebec
 * taxes (hopefully they are used well).  To the price
 * times the quantity.
 * The result is displayed.
 */
public class TaxesClassExercise {

    public static void main(String[] args) {

        final double GST = 0.05;
        final double QST = 0.09975;

        Scanner sc = new Scanner(System.in);
        double totalPrice;
        double subTotal;
        double itemPrice;
        int itemQuantity;
        String formattedPrice;

        System.out.println("What is the price of the item? (double)");
        itemPrice = sc.nextDouble();

        System.out.println("How many items were purchased? (int)");
        itemQuantity = sc.nextInt();

        subTotal = itemPrice * itemQuantity;

        totalPrice = subTotal + (subTotal * GST) + (subTotal * QST);

        formattedPrice = NumberFormat.getCurrencyInstance().format(totalPrice); // $99.99

        System.out.println("Thank you, the total price is " + formattedPrice);
    }

}
