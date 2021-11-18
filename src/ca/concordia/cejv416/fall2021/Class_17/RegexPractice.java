package ca.concordia.cejv416.fall2021.Class_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegexPractice {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Password Rules:");
        System.out.println("1 between 3 and 10 characters");
        System.out.println("2 Must contain a capital letter");
        System.out.println("3 Must contain a number");
        System.out.println("4 Must contain a symbol");
        System.out.print("Enter a new password >");

        String newPass = s.nextLine();

        boolean securePassword = true;

        List<String> verifications = new ArrayList<>();
        verifications.add(".*[A-Z].*"); // Must contain a capital letter.
        verifications.add(".*\\d.*"); // Must contain a number.
        verifications.add(".*[\\*!\\^\\$@].*"); // Must contain a special character.
        verifications.add("^.{3,11}$");

        for (String x : verifications)
        {
            if (!newPass.matches(x)) {
                securePassword = false;
                break;
            }
        }

//
//        // Validate if numbers, letters, or symbols are present in the password.
//        if (!newPass.matches(".*[A-Z].*") || !newPass.matches(".*\\d.*")
//                || !newPass.matches(".*[\\*!\\^\\$@].*") || !newPass.matches("^.{3,11}"))
//        {
//            securePassword = false;
//        }


        System.out.print("Your password is ");
        System.out.println(securePassword ? "SECURE" : "INSECURE");
    }
}
