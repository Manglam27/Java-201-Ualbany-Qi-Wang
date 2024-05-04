# Month Converter Java Program

This Java program, `MonthConverter`, converts a user-inputted month to title case with ordinal number.

## Lab Information
- **Lab Name:** Lab 05 - Converts user input month to title case with ordinal number
- **Version:** 1.1
- **Author:** Manglam Mukeshkumar Patel

## Class
### MonthConverter
- **Description:** Main Java class responsible for converting user-inputted month to title case with ordinal number.
- **Main Method:**
  - `main(String[] args)`: Entry point of the application. Prompts the user for a month in a year, converts it to title case with ordinal number, and displays the result.
- **Helper Methods:**
  - `convertToTitleCase(String month)`: Converts the input month string to title case.
  - `getMonthNumber(String month)`: Determines the month number based on the month name.
  - `generateOutput(String month, int monthNumber)`: Generates the output string that combines the month, its ordinal number, and a message indicating its position in the year.
  - `getOrdinal(int number)`: Determines the ordinal suffix for the month number.

## Usage
1. Compile the `MonthConverter.java` file.
2. Run the compiled `.class` file (or run the Java class directly).
3. Follow the prompts to enter a month in a year.
4. The program will convert the input month to title case with ordinal number and display the result.

