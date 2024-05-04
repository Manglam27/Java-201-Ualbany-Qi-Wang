# Date Difference Calculator Java Program

This Java program, `DateDifferenceCalculator`, calculates the difference between two dates in terms of years and months.

## Class
### DateDifferenceCalculator
- **Description:** Main Java class responsible for calculating the difference between two dates.
- **Main Method:**
  - `main(String[] args)`: Entry point of the application. Prompts the user for two dates, calculates the difference, and displays the result.
- **Helper Methods:**
  - `getMonthNumber(String monthName)`: Converts the name or abbreviation of a month to its corresponding month number.
  - `readValidMonth(Scanner scanner)`: Validates and reads the user input for month, allowing both full names and abbreviations.
  - `readValidYear(Scanner scanner)`: Validates and reads the user input for year, ensuring it's a positive integer.
  - `calculateDateDifference(int firstMonth, int firstYear, int secondMonth, int secondYear)`: Calculates the difference between two dates in terms of years and months.

## Usage
1. Compile the `DateDifferenceCalculator.java` file.
2. Run the compiled `.class` file (or run the Java class directly).
3. Follow the prompts to enter the first date (month and year) and then the second date (month and year).
4. The program will calculate the difference between the two dates in terms of years and months and display the result.

