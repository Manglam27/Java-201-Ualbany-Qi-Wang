package pro5;

/**
 * Represents a triangle shape.
 * 
 * @author Manglam Patel
 * @version 1.0
 */
public class Triangle extends Shape {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    /**
     * Default constructor that creates a Triangle with default values.
     */
    public Triangle() {
        super("Triangle");
        this.sideOne = 1.0;
        this.sideTwo = 1.0;
        this.sideThree = 1.0;
    }

    /**
     * Constructs a triangle with specific sides and name.
     * @param name the name of the triangle
     * @param sideOne the length of the first side
     * @param sideTwo the length of the second side
     * @param sideThree the length of the third side
     * @throws InvalidTriangleException if the given sides do not form a valid triangle
     */
    public Triangle(String name, double sideOne, double sideTwo, double sideThree) throws InvalidTriangleException {
        super(name);
        if (!isValidTriangle(sideOne, sideTwo, sideThree)) {
            throw new InvalidTriangleException("The given sides do not form a valid triangle.");
        }
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    
    
    /**
     * Gets the length of the first side of the triangle.
     * @return The length of side one.
     */
    public double getSideOne() {
        return sideOne;
    }

    /**
     * Sets the length of the first side of the triangle.
     * This method validates the triangle inequality before updating the value.
     * @param sideOne The new length for side one.
     * @throws InvalidTriangleException if the new sides do not form a valid triangle.
     */
    public void setSideOne(double sideOne) throws InvalidTriangleException {
        if (isValidTriangle(sideOne, sideTwo, sideThree)) {
            this.sideOne = sideOne;
        } else {
            throw new InvalidTriangleException("Invalid side lengths for a triangle.");
        }
    }

    /**
     * Gets the length of the second side of the triangle.
     * @return The length of side two.
     */
    public double getSideTwo() {
        return sideTwo;
    }

    /**
     * Sets the length of the second side of the triangle.
     * This method validates the triangle inequality before updating the value.
     * @param sideTwo The new length for side two.
     * @throws InvalidTriangleException if the new sides do not form a valid triangle.
     */
    public void setSideTwo(double sideTwo) throws InvalidTriangleException {
        if (isValidTriangle(sideOne, sideTwo, sideThree)) {
            this.sideTwo = sideTwo;
        } else {
            throw new InvalidTriangleException("Invalid side lengths for a triangle.");
        }
    }

    /**
     * Gets the length of the third side of the triangle.
     * @return The length of side three.
     */
    public double getSideThree() {
        return sideThree;
    }

    /**
     * Sets the length of the third side of the triangle.
     * This method validates the triangle inequality before updating the value.
     * @param sideThree The new length for side three.
     * @throws InvalidTriangleException if the new sides do not form a valid triangle.
     */
    public void setSideThree(double sideThree) throws InvalidTriangleException {
        if (isValidTriangle(sideOne, sideTwo, sideThree)) {
            this.sideThree = sideThree;
        } else {
            throw new InvalidTriangleException("Invalid side lengths for a triangle.");
        }
    }

    /**
     * Compares this triangle to the specified object.
     * The result is true if and only if the argument is not null and is a Triangle object that
     * has the same side lengths as this object.
     * @param obj the object to compare this Triangle against.
     * @return true if the given object represents a Triangle equivalent to this triangle, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triangle)) {
            return false;
        }
        Triangle other = (Triangle) obj;
        return this.sideOne == other.sideOne && this.sideTwo == other.sideTwo && this.sideThree == other.sideThree;
    }

    /**
     * Calculates the area of the triangle using Heron's formula.
     * @return the area of the triangle
     */
    @Override
    public double area() {
        double s = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
    }

    /**
     * Returns a string representation of the triangle.
     * @return a string representation of the triangle
     */
    @Override
    public String toString() {
        return "Triangle[ name=" + name + ", sides=" + sideOne + ", " + sideTwo + ", " + sideThree + "."+ "]";
    }
    
}

