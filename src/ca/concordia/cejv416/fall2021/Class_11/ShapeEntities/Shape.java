package ca.concordia.cejv416.fall2021.Class_11.ShapeEntities;

public abstract class Shape {

    private String colour;
    private String name;

    public Shape(String colour, String name) {
        this.colour = colour;
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract double getArea();
}
