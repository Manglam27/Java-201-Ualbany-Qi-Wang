
# MoneyConverter Project

This Java project, "MoneyConverter", is designed to convert large amounts of money into smaller denominations like $10, $5, $1 bills and coins (quarters, dimes, nickels, and pennies). It provides a useful breakdown of any given amount into these denominations for easy understanding.

## Project Overview

- **Package**: `MyPackage`
- **Main Class**: `MoneyCalculator`
- **Helper Class**: `MoneyBreakdown`

### Features

- **Input Validation**: Prompts for a monetary amount and ensures valid input.
- **Denomination Breakdown**: Converts the input amount to different denominations and displays the count of each.

## How It Works

1. The user is prompted to enter a non-negative monetary amount (in dollars).
2. The `MoneyCalculator` class validates this input.
3. The `MoneyBreakdown` class processes the monetary amount to determine the equivalent count of various denominations.
4. The results are displayed, listing the number of $10 bills, $5 bills, $1 bills, and various coins.

### Denominations Included

- **Bills**: $10 bills, $5 bills, $1 bills
- **Coins**: Quarters (25¢), Dimes (10¢), Nickels (5¢), Pennies (1¢)

## Usage Instructions

1. **Clone or Download** this repository.
2. **Compile** the Java files:
   ```bash
   javac MyPackage/MoneyCalculator.java
   ```
3. **Run** the compiled Java program:
   ```bash
   java MyPackage.MoneyCalculator
   ```
4. **Enter** a monetary amount when prompted.

### Example Output

```
Enter monetary amount: 
Enter monetary amount (non-negative value): 37.41
That's equivalent to:
3 ten dollar bills
1 five dollar bill
2 one dollar bills
1 quarter
1 dime
1 nickel
1 penny
```

## Author & Version

- **Author**: Manglam Mukeshkumar Patel
- **Version**: 1.2

## License

This project is open-source and available under the MIT License. You can freely modify and distribute the code.

