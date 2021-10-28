package ca.concordia.cejv416.fall2021.Class_13;

public class StudentManagerApp {

    public static void main(String[] args) {

        Student.SetLastID(10);

        Student st1 = new Student("Brendan", "Wood", "WOOB123456");
        Student st2 = new Student("Douglas", "Chananda", "DOUG12345");

        System.out.println(st1.getId());
        System.out.println(st2.getId());

        //System.out.println(st1.whatIsTheNextId());
    }
}
