package ca.concordia.cejv416.fall2021.Class_05;

import java.util.Scanner;

public class OddorFive {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int answer = s.nextInt();

        // Determine if divisible by 5, if so, print "Hifive".
        // Determine if even, then if so, print "HiEven".

        boolean wasFound = false;

        if (answer % 5 == 0)
        {
            System.out.println("HiFive");
            wasFound = true;
        }
        if (answer % 2 == 0)
        {
            System.out.println("HiEven");
            wasFound = true;
        }


        int y;

        if (!wasFound)
        {
           y = 0;
            System.out.println("This is not divisible by 5 nor is it even.");
        }

        //int a = y + 5;


    }

}
