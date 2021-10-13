package ca.concordia.cejv416.fall2021.Class_09;

public class non_static {

    public static void main(String[] args) {

        //Math.PI // Static

        Calculator c = new Calculator();

        Calculator c2 = new Calculator();

        c.x = 2;
        c.y = 3.0;
        c2.x = 7;
        c2.y = c.x;


        System.out.println(c.addNums());
        System.out.println(c2.addNums());
    }


}
