package ca.concordia.cejv416.fall2021.Class_06;

import java.util.Scanner;

public class ex12_provinces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a province code: ");

        String provinceName;

        String provinceCode = sc.nextLine(); // Get the province code from the user.

        // "bc" -> "BC"

        switch(provinceCode.toUpperCase().trim()) {
            case "BC":
                provinceName = "British Columbia";
                break;
            case "ON":
                provinceName = "Ontario";
                break;
            case "QC":
            case "PQ":
                provinceName = "Québec";
                break;
            default:
                provinceName = "Not Found / Invalid";
        }

        System.out.println("The province name for province code " + provinceCode + " is " + provinceName);
    }
}
