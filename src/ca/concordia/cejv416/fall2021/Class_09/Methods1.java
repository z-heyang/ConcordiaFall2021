package ca.concordia.cejv416.fall2021.Class_09;

public class Methods1 {

    public static int sign(int n)
    {
        if (n > 0)
            return 1;
        else if (n == 0)
            return 0;
        else if (n < 0)
            return -1;
        else
            return 0;
    }


    public static void main(String[] args) {
        sign(-1);
    }





}
