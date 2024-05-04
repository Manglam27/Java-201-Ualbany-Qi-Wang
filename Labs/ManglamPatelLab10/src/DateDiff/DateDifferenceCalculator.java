package DateDiff;

import java.util.Scanner;

/**
 * Calculating the difference between two dates in terms of years and months.
 * 
 * @author Manglam Patel
 * @version 1.0
 */
public class DateDifferenceCalculator {

    /**
     * Converts the name or abbreviation of a month to its corresponding month number.
     * 
     * @param monthName The name or abbreviation of the month.
     * @return The month number (1 for January, 2 for February, etc.), or -1 if the input is invalid.
     */
    public static int getMonthNumber(String monthName) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        String input = monthName.trim().toLowerCase();
        for (int i = 0; i < months.length; i++) {
            String fullMonth = months[i].toLowerCase();
            String monthAbbreviation = fullMonth.substring(0, 3);
            if (input.equals(fullMonth) || input.equals(monthAbbreviation)) {
                return i + 1;
            }
        }
        return -1; // Invalid month name or abbreviation
    }

    /**
     * Validates and reads the user input for month, allowing both full names and abbreviations.
     * 
     * @param scanner The Scanner object for input.
     * @return The valid month number.
     */
    public static int readValidMonth(Scanner scanner) {
        int monthNumber = -1;
        while (monthNumber == -1) {
            System.out.print("Enter month (full name or abbreviation): ");
            String monthName = scanner.next();
            monthNumber = getMonthNumber(monthName);
            if (monthNumber == -1) {
                System.out.println("Invalid month. Please try again.");
            }
        }
        return monthNumber;
    }

    /**
     * Validates and reads the user input for year, ensuring it's a positive integer.
     * 
     * @param scanner The Scanner object for input.
     * @return The valid year.
     */
    public static int readValidYear(Scanner scanner) {
        int year = 0;
        while (year <= 0) {
            System.out.print("Enter year: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid year. Please enter a positive integer.");
                scanner.next(); // Consume the invalid input
                System.out.print("Enter year: ");
            }
            year = scanner.nextInt();
            if (year <= 0) {
                System.out.println("Invalid year. Please enter a positive integer.");
            }
        }
        return year;
    }

    /**
     * Calculates the difference between two dates in terms of years and months.
     * 
     * @param firstMonth The month of the first date.
     * @param firstYear The year of the first date.
     * @param secondMonth The month of the second date.
     * @param secondYear The year of the second date.
     * @return An array containing the difference in years and months, respectively.
     */
    public static int[] calculateDateDifference(int firstMonth, int firstYear, int secondMonth, int secondYear) {
        int yearDifference = Math.abs(firstYear - secondYear);
        int monthDifference = firstMonth - secondMonth;

        if (monthDifference < 0) {
            monthDifference += 12;
            yearDifference -= 1;
        }

        return new int[]{yearDifference, monthDifference};
    }

    /**
     * The main method prompts the user for Two Dates and provides Difference between them. .
     * @param args A reference to a string array containing command-line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the first date with validation
        System.out.println("For the first date,");
        int firstMonth = readValidMonth(scanner);
        int firstYear = readValidYear(scanner);

        // Prompt for the second date with validation
        System.out.println("For the second date,");
        int secondMonth = readValidMonth(scanner);
        int secondYear = readValidYear(scanner);

        // Calculate and display the difference
        int[] difference;
        if (firstYear > secondYear || (firstYear == secondYear && firstMonth >= secondMonth)) {
            difference = calculateDateDifference(firstMonth, firstYear, secondMonth, secondYear);
        } else {
            difference = calculateDateDifference(secondMonth, secondYear, firstMonth, firstYear);
        }

        System.out.printf("These dates are %d years and %d months apart.%n", difference[0], difference[1]);

        scanner.close();
    }
}

    