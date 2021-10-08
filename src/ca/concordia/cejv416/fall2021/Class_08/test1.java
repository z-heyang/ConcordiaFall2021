package ca.concordia.cejv416.fall2021.Class_08;

import java.util.Scanner;

public class test1 {

    /*
      Input: Non-negative odd integer
      Output: An image using *
      Function(s):
            1. Main control menu and sub-menu
            2. User-defines parameter (odd number)
            3. User-controlled quit function           */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response, response1;

        int r = 0, r1 = 0;

        //Format menus
        String mainMenu = "Main Menu \n" +
                "1 - Draw a Triangle \n" +
                "2 - Draw a Rectangle \n" +
                "Q - Quit \n";
        String triangleMenu = "Main Menu / Triangle Menu \n" +
                "1 - Right Sided triangle \n" +
                "2 - Isosceles triangle \n" +
                "Q - Back to Main Menu \n";
        String prompt = "Selection > ";



//        System.out.print(prompt);
//        response = sc.nextLine();
//        if (!response.equalsIgnoreCase("q")) {
//            // if letter is not "q"
//            r = Integer.parseInt(response); //convert string to int
//        } else {
//            System.out.println("INDEX ERROR> Please try again and enter one of options in the menu.");
//
//        }

        // response to main menu selection
        while (true) {

            System.out.println(mainMenu);
            System.out.print(prompt);
            response = sc.nextLine();

            if (response.equalsIgnoreCase("q")) {
                System.out.println("Thank you for using SHAPES! ");
                System.out.println("**************************************");
                break;
            }

            if (response.equals("1")) {   // response to sub menu selection
                while (true) {
                    System.out.println(triangleMenu);
                    System.out.print(prompt);
                    response1 = sc.nextLine();
                    if (sc.hasNextInt()) {
                        r1 = Integer.parseInt(response1);
                    }


                    if (response1.equalsIgnoreCase("q")) {
                        System.out.println("Going back to the main menu ");
                        System.out.println("**************************************");
                        break;
                    } else {
                        System.out.println("???");
                    }
                }
            }

            if (response.equals("2")) {
                // rectangle
                System.out.println("test in 2");
                continue;
            }

            System.out.println("INDEX ERROR> Please try again and enter one of options in the menu.");
            System.out.println(mainMenu);
            System.out.print(prompt);
            response = sc.nextLine();

        }
    }


}
