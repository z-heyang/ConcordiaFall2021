package ca.concordia.cejv416.fall2021.Class_08;

public class convert_to_method {

    public static void main(String[] args) {

        int sumFromFunction = getSum(1, 10);
        System.out.println(sumFromFunction);
    }

    // What values are needed to send to this function?
    public static int getSum(int start, int end)
    {
        int sum = 0;

        for (int x = start; x <= end; x++)
        {
            sum += x;
        }

        return sum;
    }



}
