package ca.concordia.cejv416.fall2021.Class_06;

public class string_examples {

    public static void main(String[] args) {

        String s1 = "ABC";

        String s2 = new String("ABC");

        boolean isEqual = s1.equals(s2);

        if (isEqual) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
