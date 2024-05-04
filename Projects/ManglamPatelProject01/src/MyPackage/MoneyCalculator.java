package MyPackage;
import java.util.Scanner;

/**
* Project 01, MoneyConveter- Convert large amount of money in to smaller Denomination like, $10, $5, $1, quarters, dimes, nickels, pennies.
* @auther Manglam Mukeshkumar Patel
* @version 1.2
*/

/**
 * Represents a monetary amount breakdown into bills and coins.
 * The breakdown is calculated currency denominations.
 */
class MoneyBreakdown {
    private int originalAmountInPennies;
    private int remainingBalance;
    private int[] denominations = {1000, 500, 100, 25, 10, 5, 1}; // Denominations in pennies
    private String[] denominationNames = {"ten dollar bills", "five dollar bills", "one dollar bills", "quarters", "dimes", "nickels", "pennies"};
    private int[] counts; // Stores counts of each denomination

    /**
     * Constructs a MoneyBreakdown object and calculates the breakdown of the given monetary amount into bills and coins.
     * 
     * @param originalAmount The original amount in dollars to be broken down.
     */
    public MoneyBreakdown(double originalAmount) {
        this.originalAmountInPennies = (int)(originalAmount * 100);
        this.remainingBalance = originalAmountInPennies;
        this.counts = new int[denominations.length];
        calculateBreakdown();
    }

    /**
     * Calculates the breakdown of the monetary amount into various denominations of bills and coins.
     */
    private void calculateBreakdown() {
        for (int i = 0; i < denominations.length; i++) {
            counts[i] = remainingBalance / denominations[i];
            remainingBalance %= denominations[i];
        }
    }

    /**
     * Displays the breakdown of the monetary amount into bills and coins.
     * The output lists the quantity of each denomination.
     */
    public void displayBreakdown() {
        System.out.println("That's equivalent to:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i] + " " + denominationNames[i]);
        }
    }
    
}

public class MoneyCalculator {	
	/**
     * Main entry point of the application.
     * Prompts the user for a monetary amount, validates it, and displays its breakdown into bills and coins.
     * 
     * @param args Command line arguments. Not used in this application.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter monetary amount: ");
        double amount;   
        
        // Validate and take input from the user
        do {
            System.out.print("Enter monetary amount (non-negative value): ");
            while (!input.hasNextDouble()) {
                System.out.print("Invalid input. Please enter a numerical value :");
                input.next(); // takes the invalid input.
            }
            amount = input.nextDouble();
        } while (amount < 0);
       
        // Creating and object of the MoneyBreakdown class. 
        MoneyBreakdown breakdown = new MoneyBreakdown(amount);
        breakdown.displayBreakdown();
    }
}


