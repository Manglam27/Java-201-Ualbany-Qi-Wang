# Date Difference Calculator Project

This Java project, "DateDifferenceCalculator," calculates the difference between two given dates in terms of years and months. It allows users to input the dates in month names (or abbreviations) and years, providing a detailed calculation of the difference.

## Project Overview

- **Package**: `DateDiff`
- **Main Class**: `DateDifferenceCalculator`

### Features

- **Input Validation**:
  - Accepts both full names and abbreviations for months.
  - Ensures years are positive integers.
- **Date Difference Calculation**:
  - Calculates the difference between two dates, regardless of input order, and returns the difference in years and months.

## How It Works

1. **Prompts for Input**:
   - First Date (month name/abbreviation and year)
   - Second Date (month name/abbreviation and year)
2. **Calculates Differences**:
   - Computes the difference between the two dates in terms of years and months.

### Usage Instructions

1. **Clone or Download** this repository.
2. **Compile** the Java files:
   ```bash
   javac DateDiff/DateDifferenceCalculator.java
   ```
3. **Run** the compiled Java program:
   ```bash
   java DateDiff.DateDifferenceCalculator
   ```
4. **Provide Input** when prompted:
   - Month (full name or abbreviation)
   - Year (positive integer)

### Example Output

```
For the first date,
Enter month (full name or abbreviation): March
Enter year: 2010
For the second date,
Enter month (full name or abbreviation): October
Enter year: 2020
These dates are 10 years and 7 months apart.
```

## Author & Version

- **Author**: Manglam Patel
- **Version**: 1.0
