package ca.concordia.cejv416.fall2021.Class_11;

public class UseCircle {

    public static void main(String[] args) throws Exception {

        // Instantiate and define the circle.
        Circle c = new Circle(3, "Red");

        // Ask user for radius
        // If radius is less than 5, ask again.
        // if ok, create the circle.



        System.out.println(c.getArea());

        c.setRadius(20);

        System.out.println(c.getArea());

        c = null;




    }


}
