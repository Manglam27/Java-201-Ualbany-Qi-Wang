package pro5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Test class to demonstrate the creation and display of various shape objects.
 * 
 * @author Manglam Patel
 * @version 1.2
 */
public class Test {

    /**
     * Starts the process of creating and displaying shape objects.
     */
    public static void start() {
        List<Shape> shapeList = new ArrayList<>();
        create(shapeList);
        display(shapeList);
    }

    /**
     * Reads shape data from a file and creates shape objects.
     * 
     * @param shapeList A list to which created shape objects will be added.
     */
    public static void create(List<Shape> shapeList) {
        try {
            File file = new File("src/pro5/shapes.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String shapeType = scanner.nextLine().trim();
                String name = scanner.nextLine().trim();
                double val1 = scanner.hasNextDouble() ? scanner.nextDouble() : 0;
                if (scanner.hasNextLine()) scanner.nextLine(); // Finish the current line after reading a number

                switch (shapeType) {
                    case "Rectangle":
                        double width = scanner.hasNextDouble() ? scanner.nextDouble() : 0;
                        if (scanner.hasNextLine()) scanner.nextLine(); // Finish the current line after reading a number
                        shapeList.add(new Rectangle(name, val1, width));
                        break;
                    case "Triangle":
                        double sideTwo = scanner.hasNextDouble() ? scanner.nextDouble() : 0;
                        double sideThree = scanner.hasNextDouble() ? scanner.nextDouble() : 0;
                        if (scanner.hasNextLine()) scanner.nextLine(); // Finish the current line after reading a number
                        try {
                            shapeList.add(new Triangle(name, val1, sideTwo, sideThree));
                        } catch (InvalidTriangleException e) {
                            System.out.println("Invalid triangle for " + name + " With sides: " + val1 + ", " + sideTwo + ", " + sideThree + ": " + e.getMessage());
                        }
                        break;
                    case "Circle":
                        shapeList.add(new Circle(name, val1));
                        if (scanner.hasNextLine()) scanner.nextLine(); // Finish the current line after reading a number
                        break;
                    default:
                        System.out.println("Unknown shape type: " + shapeType);
                        break;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            if (e.getMessage() != "No line found") {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        }
    }

    /**
     * Displays the information and area of each shape in the list.
     * 
     * @param shapeList A list of shapes to be displayed.
     */
    public static void display(List<Shape> shapeList) {
        for (Shape shape : shapeList) {
            System.out.println();
            System.out.println(shape);
            System.out.printf("Area: %.2f\n", shape.area());
            System.out.println();
        }
    }

    /**
     * Main method to run the test.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        start();
    }
}
