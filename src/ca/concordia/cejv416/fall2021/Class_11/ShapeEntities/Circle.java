package ca.concordia.cejv416.fall2021.Class_11.ShapeEntities;

public class Circle extends Shape
{
    private double radius;

    public Circle(String colour, String name, double radius) {
        super(colour, name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
