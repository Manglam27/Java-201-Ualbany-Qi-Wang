package pro04;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

/**
 * GradeReport is a program to calculate the grades of students based on test scores.
 * It allows generating and displaying a grade report, saving the report to a file, or quitting the application.
 * Users can input scores for two tests for each student, and the program calculates averages and assigns letter grades.
 * 
 * @author Manglam Patel
 * @version 1.3
 */
public class GradeReport {

    // Constants for menu options
    private static final int GRADE_REPORT = 1;
    private static final int GRADE_REPORT_IN_FILE = 2;
    private static final int EXIT = 3;

    /**
     * The main method to run the GradeReport program. It provides a menu to the user for different actions.
     * 
     * @param args Unused.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        // Arrays to store student data
        int[] testOneScores = new int[4];
        int[] testTwoScores = new int[4];
        double[] averages = new double[4];
        char[] grades = new char[4];

        do {
            System.out.println("");
            System.out.println("Welcome to Grade Center!");
            System.out.println("Enter 1 to generate and display a grade report.");
            System.out.println("Enter 2 to generate a grade report and save it into a file.");
            System.out.println("Enter 3 to quit.");
            System.out.print("Enter a choice: ");
            choice = input.nextInt();

            switch (choice) {
                case GRADE_REPORT:
                case GRADE_REPORT_IN_FILE:
                    readScores(input, testOneScores, testTwoScores);
                    calculateAveragesAndGrades(testOneScores, testTwoScores, averages, grades);
                    if (choice == GRADE_REPORT) {
                        displayReport(testOneScores, testTwoScores, averages, grades);
                    } else {
                        saveReportToFile(input, testOneScores, testTwoScores, averages, grades);
                    }
                    break;
                case EXIT:
                    System.out.println("Exiting Grade Center.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        } while (choice != EXIT);

        input.close();
    }

    /**
     * Reads scores from the user for two tests for each student.
     * 
     * @param input The scanner to read user input.
     * @param testOneScores An array to store scores for test one.
     * @param testTwoScores An array to store scores for test two.
     */
    private static void readScores(Scanner input, int[] testOneScores, int[] testTwoScores) {
        System.out.println("");
        System.out.println("Enter grades for test1");
        for (int i = 0; i < testOneScores.length; i++) {            
            testOneScores[i] = readValidScore(input, "Enter score " + (i + 1) + ": ");
        }
        System.out.println("");
        System.out.println("Enter grades for test2");
        for (int i = 0; i < testTwoScores.length; i++) {
            testTwoScores[i] = readValidScore(input, "Enter score " + (i + 1) + ": ");
        }
    }
    
    /**
     * Reads a valid score between 0 and 100 from the user, repeating the prompt until a valid score is entered.
     * 
     * @param input The scanner to read user input.
     * @param prompt The message to display to the user.
     * @return A valid score between 0 and 100.
     */
    private static int readValidScore(Scanner input, String prompt) {
        int score;
        while (true) {
            System.out.print(prompt);
            try {
                score = input.nextInt();
                if (score >= 0 && score <= 100) {
                    return score;
                } else {
                    System.out.println("Invalid score. Please enter a value between 0 and 100.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); // Clear the invalid input
            }
        }
    }
   
    /**
     * Calculates the averages and letter grades for each student based on their test scores.
     * 
     * @param testOneScores An array of scores for test one.
     * @param testTwoScores An array of scores for test two.
     * @param averages An array to store the calculated averages.
     * @param grades An array to store the assigned letter grades.
     */
    private static void calculateAveragesAndGrades(int[] testOneScores, int[] testTwoScores, double[] averages, char[] grades) {
        for (int i = 0; i < averages.length; i++) {
            averages[i] = calculateAverage(testOneScores[i], testTwoScores[i]);
            grades[i] = assignLetterGrade(averages[i]);
        }
    }

    /**
     * Calculates the average of two scores.
     * 
     * @param score1 The first score.
     * @param score2 The second score.
     * @return The average of the two scores.
     */
    private static double calculateAverage(int score1, int score2) {
        return (score1 + score2) / 2.0;
    }

    /**
     * Assigns a letter grade based on an average score.
     * 
     * @param average The average score.
     * @return The letter grade.
     */
    private static char assignLetterGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else return 'F';
    }

    /**
     * Displays the report of test scores, averages, and grades for each student.
     * 
     * @param testOneScores An array of scores for test one.
     * @param testTwoScores An array of scores for test two.
     * @param averages An array of averages for each student.
     * @param grades An array of letter grades for each student.
     */
    private static void displayReport(int[] testOneScores, int[] testTwoScores, double[] averages, char[] grades) {
        System.out.println("");
        System.out.println("Test 1      Test 2      Average      Grade");
        System.out.println("-------      ------      ---------      ------");
        for (int i = 0; i < testOneScores.length; i++) {
            System.out.printf("  %03d          %03d          %05.1f           %s \n", testOneScores[i], testTwoScores[i], averages[i], grades[i]);
        }
        System.out.println("");
    }
    
    /**
     * Saves the report of test scores, averages, and grades to a file.
     * 
     * @param input The scanner to read the file name from the user.
     * @param testOneScores An array of scores for test one.
     * @param testTwoScores An array of scores for test two.
     * @param averages An array of averages for each student.
     * @param grades An array of letter grades for each student.
     */
    private static void saveReportToFile(Scanner input, int[] testOneScores, int[] testTwoScores, double[] averages, char[] grades) {
        System.out.print("Enter the new file name (For example, MyReport.txt.): ");
        String fileName = input.next();
        if (!fileName.endsWith(".txt")) {
            fileName += ".txt";
        } 
        try (PrintWriter outFile = new PrintWriter("./src/pro04/" + fileName)) {
            outFile.println("Test 1      Test 2      Average      Grade");
            outFile.println("-------      ------      ---------      ------");
            for (int i = 0; i < testOneScores.length; i++) {
                outFile.printf("  %03d          %03d          %05.1f           %s  \n", testOneScores[i], testTwoScores[i], averages[i], grades[i]);
            }
            System.out.println("Report written into a file: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + fileName);
        }
    }
}
