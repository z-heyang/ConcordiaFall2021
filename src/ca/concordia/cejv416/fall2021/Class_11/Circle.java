package ca.concordia.cejv416.fall2021.Class_11;

public class Circle {

    private double radius;
    private String colour = null;
    private boolean isVisible;

    // Constructor Method
    public Circle(double radius, String colour) throws Exception {
        if (radius < 5)
        {
            throw new Exception("Any value of radius under 5 is not permitted.");
        }

        this.radius = radius;
        this.colour = colour;
        this.isVisible = true;
    }

    public Circle() {} // Empty constructor

    // Getter for radius

    public double getRadius()
    {
        // Validation : is the person allowed to get this value?
        return this.radius;
    }

    // Setter for radius
    public void setRadius(double radius)
    {
        // Is the value provided ok?  Should we validate?
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.pow(Math.PI * radius, 2);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        // Is the user allowed to set this value?
        this.colour = colour;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
