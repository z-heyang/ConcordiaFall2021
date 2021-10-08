package ca.concordia.cejv416.fall2021.Class_08;

import java.util.Scanner;

public class validation1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter a number between 1 and 10: ");
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            number = -1;
        }
        sc.nextLine();

        while (number < 1 || number > 10)
        {
            System.out.println("Invalid number. Enter again: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
            } else {
                number = -1;
            }
            sc.nextLine();
        }
    }

}
