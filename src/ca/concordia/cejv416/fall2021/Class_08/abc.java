package ca.concordia.cejv416.fall2021.Class_08;

public class abc {

    public static void main(String[] args) {
        System.out.println(largestOfThree(10,30,20));
        System.out.println(largestOfThree(10,10,20));
        System.out.println(largestOfThree(-10,10,-5));

    }

    public static int largestOfThree(int a, int b, int c)
    {
        if (a > b && a > c)
            return a;

        if (b > c)

        {
            return b;
        }
        return c;
    }
}
