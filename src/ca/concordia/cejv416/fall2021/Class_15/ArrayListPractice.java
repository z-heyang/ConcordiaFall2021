package ca.concordia.cejv416.fall2021.Class_15;

import ca.concordia.cejv416.fall2021.Class_13.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {


        Student s = new Student("A", "b", "12312321");

        System.out.println(s);

        List<String> mylist = new ArrayList<>();
        mylist.add("ONE");
        mylist.add("a");
        mylist.add("b");

        mylist.add(1, "X");



//        String myval = mylist.get(1);
//        System.out.println(myval);
//
//        System.out.println(mylist.indexOf("b"));

        System.out.println(mylist);

        mylist.set(3, "BBB");

        System.out.println(mylist);

    }


}
