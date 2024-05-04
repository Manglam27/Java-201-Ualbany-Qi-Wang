package shapes;

/**
 * Abstract class representing a generic shape.
 * This class provides a template for shape objects with common properties
 * and functionalities, including name management and area calculation.
 * As an abstract class, it cannot be instantiated directly.
 *
 * @author Manglam Patel
 * @version 1.0
 */
public abstract class Shape {
    private String name;

    /**
     * Default constructor that creates a Shape instance with a default name "Shape".
     */
    public Shape() {
        this.name = "Shape";
    }

    /**
     * Constructs a Shape instance with the given name.
     * @param name The name of the shape.
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of this shape.
     * @return The name of the shape.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of this shape to the specified name.
     * @param name The new name of the shape.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Abstract method to calculate the area of this shape. Implementation must be provided in subclasses.
     * @return The area of the shape.
     */
    public abstract double area();

    /**
     * Compares this shape with the specified object for equality.
     * @param obj The object to compare this shape with.
     * @return true if the specified object is also a shape and has the same name; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Shape) {
            Shape other = (Shape) obj;
            return this.name.equals(other.name);
        }
        return false;
    }

    /**
     * Returns a string representation of this shape.
     * @return A string representation of the shape.
     */
    @Override
    public String toString() {
        return "Shape[name=" + name + "]";
    }
}
