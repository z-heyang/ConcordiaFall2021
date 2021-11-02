package ca.concordia.cejv416.fall2021.Class_11.ShapeEntities;

import java.util.Objects;

public abstract class Shape {

    private String colour;
    private String name;

    @Override
    public boolean equals(Object o) {
        System.out.println("Doing a manual compare...");
        if (this == o) return true; // <=
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(colour, shape.colour) && Objects.equals(name, shape.name);
    }

    @Override
    public String toString()
    {
        return "I am a shape and my colour is " + this.colour + " and my name is " + this.name;
    }

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
