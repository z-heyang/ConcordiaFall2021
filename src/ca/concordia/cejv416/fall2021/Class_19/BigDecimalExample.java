package ca.concordia.cejv416.fall2021.Class_19;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class BigDecimalExample {

    public static void main(String[] args) {

        // value_one = BD:25.00
        // value_two = DB:
        // if 25 is less than the amount in the variable, do something.
        // if the variable is larger than 25.

        BigDecimal variableValue = new BigDecimal("10.00");

//        if (variableValue.compareTo(new BigDecimal("25.00")) == 0)  // if val1 is greater than variablevalue then
//        {
//            System.out.println("A");
//        }
//        else
//        {
//            System.out.println("B");
//        }

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println(nf.format(variableValue));



    }


}
