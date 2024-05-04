package MyPackage;
import java.util.*;
import java.text.*;

/**
 * Lab 04: Enhanced Student Enrollment Analysis
 * This program calculates and displays the percentage of male and female students registered in a class,
 * taking additional inputs for year, semester, and course, and ensuring outputs are formatted as per new requirements.
 * 
 * @author Manglam Mukeshkumar Patel
 * @version 1.0
 */

public class lab04Class {
	    /**
	     * Main method to process student enrollment data.
	     * @param args A reference to a string array containing command-line arguments.
	     */
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DecimalFormat df = new DecimalFormat("0.00%");
	        
	        // Input
	        System.out.print("Enter a year: "); 
	        String year = scanner.next();  // get year as sting.
	        
	        System.out.print("Enter a semester: ");
	        String semester = scanner.next(); 
	        semester = Character.toUpperCase(semester.charAt(0)) + semester.substring(1).toLowerCase(); // Makes First character of sting to upper case.
	        
	        System.out.print("Enter a course: ");
	        String course = scanner.next().toUpperCase(); // converts user enter string to upper case.
	        
	        System.out.print("Enter the number of males: ");
	        int males = scanner.nextInt();  // Total number of male students.
	        
	        System.out.print("Enter the number of females: ");
	        int females = scanner.nextInt(); // Total number of female students.
	        
	        // Process
	        int totalStudents = males + females;   
	        double malePercentage = (double) males / totalStudents;  // getting percentage of male students.
	        double femalePercentage = (double) females / totalStudents; // getting percentage of female students.
	        
	        // Output
	        System.out.println("The percentage of the males in " + course + " " + semester + " " + year + " is " + df.format(malePercentage) + ".");
	        System.out.println("The percentage of the females in " + course + " " + semester + " " + year + " is " + df.format(femalePercentage) + ".");
	        
	        scanner.close();
	    }
	}
