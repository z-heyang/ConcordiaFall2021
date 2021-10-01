package ca.concordia.cejv416.fall2021.Class_06;

import java.util.Scanner;

public class province_debug2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a province code: ");
        String provinceName = ""; //or String provinceName = null;
        //String provinceCode = sc.nextLine(); // get the province code from the user

        String provinceCode = "BC";

        switch (provinceCode)
        {
            case "AB":
                provinceName = "Alberta";
                break;
            case "PQ":
            case "QC":
                provinceName = "Quebec";
                break;
            case "BC":
                provinceName = "British Columbia";
                break;
            default :
                provinceName = "Not found";

        }
        System.out.println(" The province name for " + provinceCode + " is " + provinceName);



    }


}
