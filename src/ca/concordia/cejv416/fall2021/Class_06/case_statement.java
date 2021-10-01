package ca.concordia.cejv416.fall2021.Class_06;

import java.text.NumberFormat;

public class case_statement {

    public static void main(String[] args) {

        NumberFormat f = NumberFormat.getCurrencyInstance();
        //f.setMinimumFractionDigits(2);

        double salary = 60000.00;
        char employeeType = 'R'; // M = Management, R = Regular, T = Temp
        double bonus = 0.0;

        switch (employeeType) {
            case 'M':
            case 'R':
                bonus = .05;
                break;
            default:
                bonus = .01;
        }

        double finalBonus = bonus * salary;

        System.out.println("Bonus will be " + f.format(finalBonus));
    }
}
