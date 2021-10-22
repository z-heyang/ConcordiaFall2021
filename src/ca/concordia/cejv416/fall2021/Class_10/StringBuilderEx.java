package ca.concordia.cejv416.fall2021.Class_10;

public class StringBuilderEx {

    public static void main(String[] args) {

        //String str1 = "Hello";
        //str1 = str1 + " World";

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");

        System.out.println(sb);


        System.out.println(sb.reverse());

        System.out.println(sb);

    }



}
