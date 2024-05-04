package FileIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class is designed to capture scores and write them to a file..
 * @author Manglam Patel
 * @version 1.0
 */
public class FileIOHandeling {

    /**
     * The main method prompts the user for scores and writes them to a specified file.
     * @param args A reference to a string array containing command-line arguments
     */
    public static void main(String[] args) {
        // Variable declarations
        int[] scores = new int[5]; // Array to store scores
        Scanner input = new Scanner(System.in); // Scanner for user input
        String fileName; // Variable to store the file name

        // Input module: prompt for scores
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = input.nextInt(); // Store each score in the array
        }

        // Prompt for file name
        System.out.print("Enter the new file name (For example, MyReport.txt.): ");
        fileName = input.next(); // Read the file name
        input.close(); // Close the scanner
        
        //adds .txt at the end if user is not specifying at the end.
        if (!fileName.endsWith(".txt")) {
        	fileName+= ".txt";
        }

        // Output module: write scores to the file
        try {
        	// *Note : this will create a file in my package. 
            File file = new File("./src/FileIO/" + fileName); // Create a File object 
            PrintWriter writer = new PrintWriter(file); // Create a PrintWriter

            // Write scores to the file
            for (int i = 0; i < scores.length; i++) {
                writer.println("Score " + (i + 1) + ": " + scores[i]);
            }

            writer.close(); // Close the writer
            System.out.println("Report written into a file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

