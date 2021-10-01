package ca.concordia.cejv416.fall2021.Class_06;

import java.util.Scanner;

public class province_debug {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String province = "";

        System.out.println("Please enter code of province ");
        // province = myScanner.nextLine();

        String codeProvince = myScanner.nextLine();

        switch (codeProvince) {
            case "QC":
                province = "Quebec";
                break;
            case "AB":
                province = "Alberta";
                break;
            case "NS":
                province = "Nova Scotia";
                break;
            default:
                province = "Not found";

        }
        System.out.println("The province name for province code " + codeProvince + " is " + province);





    }


}
