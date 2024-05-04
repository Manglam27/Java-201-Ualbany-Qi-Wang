# GradeReport Project

This Java project, "GradeReport," calculates student grades based on scores from two tests. It allows users to generate and display a grade report, save the report to a file, or exit the application.

## Project Overview

- **Package**: `pro04`
- **Main Class**: `GradeReport`

### Features

- **Menu Options**:
  - Generate and display a grade report.
  - Generate a report and save it to a file.
  - Exit the application.
- **Input Validation**:
  - Scores must be integers between 0 and 100.
- **Grade Calculation**:
  - Computes averages and assigns letter grades based on the scores.
  - Letter grades are assigned as follows:
    - A: 90 and above
    - B: 80 to 89
    - C: 70 to 79
    - F: below 70

## How It Works

1. **Menu Options**:
   - Option 1: Generate and display a grade report.
   - Option 2: Generate a grade report and save it to a file.
   - Option 3: Exit the application.
2. **Grade Calculation**:
   - Calculates averages and assigns letter grades.
3. **Input Validation**:
   - Prompts for valid scores (0-100) for two tests.

### Usage Instructions

1. **Clone or Download** this repository.
2. **Compile** the Java files:
   ```bash
   javac pro04/GradeReport.java
   ```
3. **Run** the compiled Java program:
   ```bash
   java pro04.GradeReport
   ```
4. **Provide Input** when prompted:
   - Test scores for two tests per student.
   - Choose to display the report or save it to a file.

### Example Output

```
Welcome to Grade Center!
Enter 1 to generate and display a grade report.
Enter 2 to generate a grade report and save it into a file.
Enter 3 to quit.
Enter a choice: 1

Enter grades for test1
Enter score 1: 85
Enter score 2: 78
Enter score 3: 92
Enter score 4: 67

Enter grades for test2
Enter score 1: 88
Enter score 2: 81
Enter score 3: 95
Enter score 4: 70

Test 1      Test 2      Average      Grade
-------      ------      ---------      ------
  085          088          86.5           B
  078          081          79.5           C
  092          095          93.5           A
  067          070          68.5           F
```

## Author & Version

- **Author**: Manglam Patel
- **Version**: 1.3
