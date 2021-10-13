package ca.concordia.cejv416.fall2021.Class_09;

public class Exercise162 {

    public static void main(String[] args) {

        int n1 = 32;
        int n2 = 8;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println("The GCD of both numbers above is :" + gcd2(n1, n2));

    }

    public static int gcd2(int n1, int n2)
    {
        int start = Math.min(n1, n2);
        int end = 1;

        while(start >= end)
        {
            if (n1 % start == 0 && n2 % start == 0)
            {
                return start;
            }

            start--;
        }

        return 0;
    }

    public static int gcd(int n1, int n2)
    {
        int start = Math.min(n1, n2);
        int end = 1;

        for (int x = start; x >= end; x--)
        {
            if (n1 % x == 0 && n2 % x == 0)
            {
                return x;
            }
        }

        return 0;
    }

}
