package pro5;

/**
 * Represents a circle shape.
 *
 *
 * @author Manglam Patel
 * @version 1.0
 */ 
public class Circle extends Shape {
    private double radius;

    /**
     * Default constructor that creates a Circle with default values.
     */
    public Circle() {
        super("Circle");
        this.radius = 1.0;
    }

    /**
     * Constructs a circle with a specific name and radius.
     * @param name the name of the circle
     * @param radius the radius of the circle
     */
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    /**
     * Returns the radius of the circle.
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     * @param radius the new radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return the area of the circle
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Compares this circle to the specified object.
     * The result is true if and only if the argument is not null, is a Circle object, and has
     * the same name and radius as this object.
     * 
     * @param obj the object to compare this Circle against.
     * @return true if the given object represents a Circle equivalent to this circle, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle other = (Circle) obj;
        return Double.compare(this.radius, other.radius) == 0;
    }

    /**
     * Returns a string representation of the circle.
     * @return a string representation of the circle
     */
    @Override
    public String toString() {
        return "Circle[ name=" + name + ", radius=" + radius + "]";
    }
}
