package ca.concordia.cejv416.fall2021.Class_06;

public class ternery_if {

    public static void main(String[] args) {

        double testGrade = 89.5;

//        if (testGrade >= 60.00)
//        {
//            System.out.println("Student passed.");
//        }
//        else
//        {
//            System.out.println("Student did not pass.");
//        }

        String message = testGrade >= 60 ?
                "Student passed" :
                "Student Did not Pass";

        System.out.println(message);

        char employeeType = 'P';

        // Bonus is 3000 for part time, and 6000 anyone else.

        double bonus = employeeType == 'P' ? 3000 : 6000;



    }


}
