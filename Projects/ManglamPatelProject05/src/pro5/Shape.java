package pro5;

/**
 * Abstract superclass for all shapes in the system.
 * 
 * @author Manglam Patel
 * @version 1.4
 * 
 */

public abstract class Shape {
    protected String name;

    /**
     * Constructs a Shape with a given name.
     * @param name the name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the shape.
     * @return the name of the shape
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the shape.
     * @param name the new name of the shape
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Calculates the area of the shape.
     * @return the area of the shape
     */
    public abstract double area();

    /**
     * Compares this shape with another object for equality.
     * @param obj the object to compare with
     * @return true if the specified object is equal to this shape
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Shape shape = (Shape) obj;
        return name.equals(shape.name);
    }

    /**
     * Returns a string representation of the shape.
     * @return a string representation of the shape
     */
    @Override
    public String toString() {
        return "Shape[ name=" + name + "]";
    }
}
