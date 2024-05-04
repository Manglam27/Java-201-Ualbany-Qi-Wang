# Carpet Bill Generator Project

This Java project, "CarpetBillGenerator," is designed to generate a carpet bill based on the room dimensions and the cost per square foot. The output bill is formatted using `DecimalFormat` to represent monetary values and measurements neatly.

## Project Overview

- **Package**: `TheBillPackage`
- **Main Class**: `CarpetBillGenerator`

### Features

- **Input Validation**: Prompts for the user's first and last name, room dimensions, and cost per square foot.
- **Random Customer ID Generation**: Generates a unique customer ID using the first initial, part of the last name, and a random number.
- **Bill Breakdown**: Calculates the carpet cost, tax, and total based on the input data and prints a neatly formatted bill.

## How It Works

1. **Prompts for Input**:
   - First name and last name (used for customer identification)
   - Room length and width (feet)
   - Carpet cost per square foot
2. **Calculates Costs**:
   - Determines the total cost before tax based on the area and cost per square foot.
   - Applies a tax rate of 8.5% to the cost.
3. **Generates Customer ID**:
   - Based on the first initial, up to five letters of the last name, and a random number.
4. **Prints a Detailed Bill**:
   - Displays customer information, room measurements, cost breakdown, and final total cost.

### Tax Rate

- **Current Rate**: 8.5% (constant `TAX_RATE`)

## Usage Instructions

1. **Clone or Download** this repository.
2. **Compile** the Java files:
   ```bash
   javac TheBillPackage/CarpetBillGenerator.java
   ```
3. **Run** the compiled Java program:
   ```bash
   java TheBillPackage.CarpetBillGenerator
   ```
4. **Provide Input** when prompted:
   - First Name
   - Last Name
   - Room length (feet)
   - Room width (feet)
   - Carpet cost per square foot

### Example Output

```
Enter your first name: Manglam
Enter your last name: Patel
Enter length of room (feet): 15
Enter width of room (feet): 20
Enter cost per square foot: 3.25

CUSTOMER
Last Name             Patel
First Name            Manglma
ID                    MPate56

MEASUREMENT
Length                015 feet
Width                 020 feet
Area                  300 square feet

CHARGES
Description            Cost/Sq.Ft.            Charges
-------------          -------------          ---------
Carpet                 03.25                  $0975.00
Tax                    8.5%                   82.8750
                                             ----------
Total                  1057.88
```

## Author & Version

- **Author**: Manglam Mukeshkumar Patel
- **Version**: 1.1

## License

This project is open-source and available under the MIT License. You can freely modify and distribute the code.
