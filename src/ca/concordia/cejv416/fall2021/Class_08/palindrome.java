package ca.concordia.cejv416.fall2021.Class_08;

import java.lang.reflect.Array;

public class palindrome {

    public static void main(String[] args) {




        String myString = "XBCDEFGHGFEDCBA";
        int stringLength = myString.length();
        boolean isPalendrome = true;

        for(int x = 0; x < stringLength / 2; x++)
        {
            char left = myString.charAt(x);
            char right = myString.charAt(stringLength - x - 1);

            if (left != right)
            {
                isPalendrome = false;
                break;
            }
        }

        if (isPalendrome)
        {
            System.out.println("IS A PALINDROME.");
        }
        else
        {
            System.out.println("IS NOT A PALINDROME.");
        }

    }


}
