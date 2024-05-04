package Lab05Package; 
import java.util.Scanner;

/**
 * Lab 05: Converts user input month to title case with ordinal number.
 * 
 * @author Manglam Mukeshkumar Patel
 * @version 1.1
 */

public class MonthConverter {
	
	/**
     * The main method that initiates the conversion process.
     * 
     * @param args Command line arguments (not used).
     */
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user.
        System.out.print("Enter a month in a year: ");
        String month = scanner.next();
        
        // Convert input to title case
        month = convertToTitleCase(month);
        // Get month number
        int monthNumber = getMonthNumber(month);
        
        // Generate and display output
        String output = generateOutput(month, monthNumber);
        System.out.println(output);
    }
    
    /**
     * Converts the input string to title case.
     * 
     * @param month The month input by the user.
     * @return The month string converted to title case.
     */
    private static String convertToTitleCase(String month) {
        return month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
    }
    
    /**
     * Determines the month number based on the month name.
     * 
     * @param month The month input by the user, in title case.
     * @return The numerical month number, or -1 if the input is invalid.
     */
    private static int getMonthNumber(String month) {
        switch(month) {
            case "January": return 1;
            case "February": return 2;
            case "March": return 3;
            case "April": return 4;
            case "May": return 5;
            case "June": return 6;
            case "July": return 7;
            case "August": return 8;
            case "September": return 9;
            case "October": return 10;
            case "November": return 11;
            case "December": return 12;
            default: return -1; // Invalid month
        }
    }
    
    /**
     * Generates the output string that combines the month, its ordinal number,
     * and a message indicating its position in the year.
     * 
     * @param month The month name in title case.
     * @param monthNumber The numerical position of the month in the year.
     * @return The formatted output string.
     */
    private static String generateOutput(String month, int monthNumber) {
        if(monthNumber == -1) {
            return "You have entered the invalid month of the year: invalid.";
        } else {
            String ordinal = getOrdinal(monthNumber);
            return "You have entered the " + monthNumber + ordinal + " month of the year: " + month + ".";
        }
    }
    
    /**
     * Determines the ordinal suffix for the month number.
     * 
     * @param number The month number.
     * @return The appropriate ordinal suffix for the month number.
     */
    private static String getOrdinal(int number) {
        switch(number) {
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }
}
