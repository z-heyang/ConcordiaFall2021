package ca.concordia.cejv416.fall2021.Class_09;

public class methods_chain_example {

    public static void main(String[] args) {

        System.out.println(A("Hello"));
    }


    public static String A(String val1)
    {
        return B(val1) + "A";
      //      "HelloB" + "A"
    }

    public static String B(String val1)
    {
        return val1 + "B";
    }

}
