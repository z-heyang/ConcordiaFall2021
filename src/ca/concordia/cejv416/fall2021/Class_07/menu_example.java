package ca.concordia.cejv416.fall2021.Class_07;

import java.util.Scanner;

public class menu_example {

    public static void main(String[] args) {

        /*
        Main Menu
        A) Square a number
        B) Math menu
        Q) Quit program

        Math Menu
        A) Negate a number
        B) Double a number
        Q) Return to Main Menu
         */

        Scanner s = new Scanner(System.in);

        String response;

        String MainMenuText = "Main Menu\n" +
                "A) Square a number\n" +
                "B) Math menu\n" +
                "Q) Quit program";

        String MathMenuText = "Math Menu\n" +
                "A) Negate a number\n" +
                "B) Double a number\n" +
                "Q) Return to Main Menu";

        String Prompt = "Selection >";

        // MAIN MENU LOGIC
        while(true)
        {
            System.out.println(MainMenuText);
            System.out.print(Prompt);
            response = s.nextLine();

            // Display Math Menu - Choice B
            if (response.equalsIgnoreCase("B"))
            {
                while(true) {
                    System.out.println(MathMenuText);
                    System.out.print(Prompt);
                    response = s.nextLine();


                    // User selection Q - Goes back to the previous menu.
                    if(response.equalsIgnoreCase("Q"))
                    {
                        break;
                    }

                }
            }

            // User selection A
            if(response.equalsIgnoreCase("A"))
            {
                System.out.println("OK, Square a number.");
                System.out.println("Enter a number to square >");
                response = s.nextLine();
                double num = Double.parseDouble(response);
                System.out.println("The number squared is : " + Math.pow(num, 2.0));
            }

            // User selection Q - Quits the program
            if(response.equalsIgnoreCase("Q"))
            {
                System.out.println("Thank you for using this program.");
                break;
            }
        }



    }
}
