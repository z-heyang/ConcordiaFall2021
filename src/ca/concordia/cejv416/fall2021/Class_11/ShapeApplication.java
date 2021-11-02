package ca.concordia.cejv416.fall2021.Class_11;

import ca.concordia.cejv416.fall2021.Class_11.ShapeEntities.Circle;
import ca.concordia.cejv416.fall2021.Class_11.ShapeEntities.Shape;

public class ShapeApplication {

    public static void main(String[] args) {

        Circle c = new Circle("Red", "Bob", 10);
        Circle d = new Circle("Red", "Bob", 10);

        boolean isSame = c.equals(c);
        System.out.println(isSame);

        //System.out.println(c);


        //Shape s = new Shape("Red", "JAck");

    }


}
