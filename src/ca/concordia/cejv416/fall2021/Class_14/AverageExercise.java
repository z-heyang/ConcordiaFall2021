package ca.concordia.cejv416.fall2021.Class_14;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AverageExercise {

    public static void main(String[] args) {

//        BigDecimal a = new BigDecimal("5.20");
//        BigDecimal b = new BigDecimal("10.40");
//        BigDecimal c = new BigDecimal("10.40");
//        BigDecimal d = a.add(b).add(c);
//        System.out.println(d);

        BigDecimal[] prices = new BigDecimal[4];
        prices[0] = new BigDecimal("5.99");
        prices[1] = new BigDecimal("11.99");
        prices[2] = new BigDecimal("25.97");
        prices[3] = new BigDecimal("25.00");

        BigDecimal total = new BigDecimal("0.00");

        // Get the sum of all

        for (BigDecimal p : prices)
        {
            total = total.add(p);
        }

        // Divide by the number of elements.

        BigDecimal avg = total.divide(new BigDecimal(prices.length), RoundingMode.HALF_UP);

        System.out.println(avg);
    }


}
