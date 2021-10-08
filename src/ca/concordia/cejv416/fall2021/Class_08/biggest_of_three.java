package ca.concordia.cejv416.fall2021.Class_08;


public class biggest_of_three {

    public static void main(String[] args) {

        System.out.println(largestOfThree(10, 30, 20));  // 30
        System.out.println(largestOfThree(10, 10, 20));  // 20
        System.out.println(largestOfThree(-7, 17, 7)); // 17
    }

    // Design a method that returns the biggest number from 3 numbers supplied.
    public static int largestOfThree(int a, int b, int c)
    {
        if (a > b && a > c)
        {
            return a;
        }
        if (b > c)
        {
            return b;
        }
        return c;
    }

}
