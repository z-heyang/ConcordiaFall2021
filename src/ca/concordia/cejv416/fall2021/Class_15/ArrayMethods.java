package ca.concordia.cejv416.fall2021.Class_15;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] sample1 = new int[10];
        int[] sample2 = new int[] { 6, 6, 6, 6, 8, 8, 8, 6, 6, 6};

        Arrays.fill(sample1, 6);
        Arrays.fill(sample1, 4, 7, 8);

        System.out.println(Arrays.toString(sample1));
        System.out.println(Arrays.toString(sample2));

        System.out.println(Arrays.equals(sample1, sample2));
        System.out.println(sample1 == sample2);

        String a = "Hi";
        String b = "HEllo";

        System.out.println(a.equals(b)); // This is ok, string compare.

        // Don't do this.
        //System.out.println(sample1.equals(sample2));

        Arrays.sort(sample2);
        System.out.println(Arrays.toString(sample2));



    }

}
