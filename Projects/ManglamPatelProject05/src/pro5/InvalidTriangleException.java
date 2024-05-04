package pro5;

/**
 * Exception class for invalid triangle configurations.
 * 
 * @author Manglam Patel
 * @version 1.0
 */
public class InvalidTriangleException extends Exception {
	
	/**
     * Constructs an InvalidTriangleException with the specified detail message.
     * @param message the detail message
     */
    public InvalidTriangleException(String message) {
        super(message);
    }
}
