# Project 5: Shape Management System

This Java project provides a system for managing geometric shapes. It defines various shape classes, calculates their properties, handles exceptions for invalid shapes, and offers a testing suite.

## Project Structure

The `pro5` directory contains the following files:

1. `Circle.java`
2. `InvalidTriangleException.java`
3. `MyAlgorithm`
4. `Rectangle.java`
5. `Shape.java`
6. `shapes.txt`
7. `Test.java`
8. `Triangle.java`
9. `uml_file.class.violet.html`

#

The project files are organized in the `pro5` package within the `src` directory. Here’s an overview of the key files:

- **`Circle.java`**: Defines the `Circle` class, which implements the `Shape` interface. This class calculates the area and perimeter of a circle based on its radius.
  
- **`Rectangle.java`**: Implements the `Shape` interface for rectangular shapes. This class includes methods to calculate the area and perimeter of a rectangle given its width and height.

- **`Triangle.java`**: Implements the `Shape` interface for triangles. It calculates the area and perimeter of a triangle based on the side lengths. This class raises an `InvalidTriangleException` if the side lengths don't satisfy the triangle inequality.

- **`Shape.java`**: An interface that defines methods for calculating the area and perimeter of any shape.

- **`InvalidTriangleException.java`**: A custom exception that is thrown when a triangle is invalid due to improper side lengths.

- **`MyAlgorithm`**: Contains a set of algorithms (sorting and searching) that can be applied to the collection of shapes.

- **`Test.java`**: A test suite that exercises the various classes and functionalities. It reads data from `shapes.txt`, applies the algorithms, and displays the results.

- **`shapes.txt`**: A text file containing input data for the test suite, representing various shapes and their attributes.

- **`uml_file.class.violet.html`**: An HTML file providing a UML diagram to visually understand the relationships between the classes.

## How It Works

1. **Shapes**: The project defines three shape types: Circle, Rectangle, and Triangle. All classes implement the `Shape` interface.
2. **Exception Handling**: The `Triangle` class ensures the validity of a triangle using the `InvalidTriangleException` class.
3. **Algorithms**: The `MyAlgorithm` class implements sorting and searching on the shapes collection.
4. **Testing**: The `Test.java` class reads data from `shapes.txt`, creates shape instances, applies the algorithms, and prints results.

### Usage Instructions

1. **Clone or Download** this repository.
2. **Compile** the Java files:
   ```bash
   javac src/pro5/*.java
   ```
3. **Run** the compiled Java program:
   ```bash
   java -cp src pro5.Test
   ```
4. **Review Results**:
   - The program reads data from `shapes.txt`.
   - It processes each shape based on the data provided.
   - The results are displayed through the console.

## Author & Version

- **Author**: Manglam Patel
- **Version**: 1.3
