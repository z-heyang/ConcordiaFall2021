package ca.concordia.cejv416.fall2021.Class_07;

public class dowhile {

    public static void main(String[] args) {

        // Print all even numbers between one and ten.  Use a while loop and also a do-while loop.

        // #1 - Using a normal incremental counter and the modulus function.

        int counter1 = 0;

        while (counter1 < 10)
        {
            counter1 ++;

            if (counter1 % 2 == 0) { // Is counter1 even?
                System.out.println("Number: " + counter1);
            }
        }

        // #2 - Using a counter and skipping 2.

        // WHILE

        int counter = 0;

        while (counter < 10)
        {
            counter += 2; // counter = counter + 2;
            System.out.println("Number: " + counter);
        }

        // DO-WHILE

        int counter3 = 0;



    }
}
