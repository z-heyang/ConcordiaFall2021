package ca.concordia.cejv416.fall2021.Class_04;

public class RandomPractice {

    public static void main(String[] args) {

        // Obtain a random number between 1 and 10
        int randomValue1;

        // 0.0123 0.1233 0.2

        //0.0123  -> (int) -> 0  + 1
        // 0.1233 -> (int) -> 1  + 1

        for (int x = 0; x < 20; x++)
        {
            randomValue1 = (int)(Math.random() * 10) + 1;
            System.out.println(randomValue1);
        }


//        // Between 1 and 100
//
//        double randomValue2 = Math.random() * 100;
//        System.out.println(randomValue2);
//
//        // Bewtween 50 and 100
//
//        double randomValue3 = 100 - (Math.random() * 50);
//        System.out.println((int)randomValue3);


    }

}
