package ca.concordia.cejv416.fall2021.Class_04;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        // 2
        // some text
        // 1.

        //String inp = "2\nSome text\n1.";

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(n);
        System.out.println(s1);
        System.out.println(s2);

        sc.close();


    }

}
