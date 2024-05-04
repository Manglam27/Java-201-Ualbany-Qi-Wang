package pro5;

/**
 * Represents a rectangle shape.
 * 
 * @author Manglam Patel
 * @version 1.0
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * Default constructor that creates a Rectangle with default values.
     */
    public Rectangle() {
        super("Rectangle");
        this.length = 1.0;
        this.width = 1.0;
    }

    /**
     * Constructs a rectangle with specific values.
     * @param name the name of the rectangle
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the length of the rectangle.
     * @return the length of the rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the rectangle.
     * @param length the new length of the rectangle
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Returns the width of the rectangle.
     * @return the width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle.
     * @param width the new width of the rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle.
     * @return the area of the rectangle
     */
    @Override
    public double area() {
        return length * width;
    }
    
    /**
     * Compares this rectangle to the specified object.
     * The result is true if and only if the argument is not null, is a Rectangle object,
     * and has the same length and width as this rectangle.
     * 
     * @param obj the object to compare this Rectangle against.
     * @return true if the given object represents a Rectangle equivalent to this rectangle, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        return Double.compare(this.length, other.length) == 0 && Double.compare(this.width, other.width) == 0;
    }


    /**
     * Returns a string representation of the rectangle.
     * @return a string representation of the rectangle
     */
    @Override
    public String toString() {
        return "Rectangle[ name=" + name + ", length=" + length + ", width=" + width + "]";
    }
}
