package ca.concordia.cejv416.fall2021.Class_08;

public class for_loop_1 {

    public static void main(String[] args) {

        for(int x = 5; x <= 15; x++)
        {
            System.out.println(x);
        }

        // (1) 1-20 Only odd numbers.
        // (2) 5, 10, 15, 20 ----> 50
        // (3) 20 to 10 (eleven total numbers, backwards).

        for (int x = 1; x <= 20; x += 2)
        {
            System.out.println(x);
        }

        System.out.println("#####################");

        for (int x = 5; x <= 50; x += 5)
        {
            System.out.println(x);
        }

        System.out.println("#####################");

        for (int x = 20; x >= 10; x--)
        {
            System.out.println(x);
        }
    }
}
