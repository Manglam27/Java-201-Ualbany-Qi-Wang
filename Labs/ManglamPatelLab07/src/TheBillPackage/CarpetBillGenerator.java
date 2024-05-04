package TheBillPackage;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/** 
 * A program to generate a carpet bill given the room dimensions and carpet cost per square foot.
 * Output is formatted to match the provided example image using DecimalFormat.
 * 
 * @author Manglam Mukeshkumar Patel
 * @version 1.1
 */

public class CarpetBillGenerator {

    private static final DecimalFormat moneyFormat = new DecimalFormat("$0000.00");
    private static final DecimalFormat areaFormat = new DecimalFormat("0000.00");
    private static final DecimalFormat priceFormat = new DecimalFormat("00.00");
    private static final DecimalFormat taxFormat = new DecimalFormat("0.00%");
    
    private static final double TAX_RATE = 0.085; // 8.5% tax rate

    /**
     * The main method to run the carpet bill generator program.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt for user input
        System.out.print("Enter your first name: ");
        String firstName = capitalize(scanner.nextLine());
        System.out.print("Enter your last name: ");
        String lastName = capitalize(scanner.nextLine());
        System.out.print("Enter length of room (feet): ");
        int length = scanner.nextInt();
        System.out.print("Enter width of room (feet): ");
        int width = scanner.nextInt();
        System.out.print("Enter cost per square foot: ");
        double costPerSquareFoot = scanner.nextDouble();

        // Process input
        int area = length * width;
        double cost = costPerSquareFoot * area;
        double tax = cost * TAX_RATE;
        double totalCost = cost + tax;

        // Generate customer ID
        String customerID = generateCustomerID(firstName, lastName, random);

        // Output
        printBill(lastName, firstName, customerID, length, width, area, costPerSquareFoot, cost, tax, totalCost);

        scanner.close();
    }

    /**
     * Capitalizes the first letter of a string and makes the rest lowercase.
     * @param input The string to capitalize.
     * @return The capitalized string.
     */
    private static String capitalize(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    /**
     * Generates a unique customer ID using the first letter of the first name, up to five letters of the last name, and a random number.
     * @param firstName The customer's first name.
     * @param lastName The customer's last name.
     * @param random An instance of Random for generating numbers.
     * @return A unique customer ID.
     */
    private static String generateCustomerID(String firstName, String lastName, Random random) {
        return firstName.substring(0, 1).toUpperCase() +lastName.substring(0, Math.min(5, lastName.length()))+ (random.nextInt(90) + 10); 
    }

    /**
     * Prints the detailed bill including customer information, room measurements, and the cost breakdown.
     * @param lastName Customer's last name.
     * @param firstName Customer's first name.
     * @param customerID Unique customer ID.
     * @param length Room length.
     * @param width Room width.
     * @param area Room area.
     * @param costPerSquareFoot Cost per square foot of carpet.
     * @param cost Total cost before tax.
     * @param tax Calculated tax on the total cost.
     * @param totalCost Total cost after tax.
     */
    private static void printBill(String lastName, String firstName, String customerID, int length, int width, int area, double costPerSquareFoot, double cost, double tax, double totalCost)
    {
    	// Using strings formats method, formating the bill and printing it on the screen. 
    	String customerSection = String.format( 
    	    "CUSTOMER%n" +
    	    "Last Name             %-10s%n" +
    	    "First Name            %-10s%n" +
    	    "ID                        %-10s%n",
    	    lastName, firstName, customerID);

    	String measurementSection = String.format(
    	    "MEASUREMENT%n" +
    	    "Length                    %03d feet%n" +
    	    "Width                    %03d feet%n" +
    	    "Area                      %03d square feet%n",
    	    length, width, area);

    	String chargesSection = String.format(
    	    "CHARGES%n" +
    	    "Description            Cost/Sq.Ft.            Charges%n" +
    	    "-------------          -------------           ---------\n" +
    	    "Carpet                   %5s %26s %n" +
    	    "Tax                       %7s %24s %n" +
    	    "                                                         ----------\n" +
    	    "Total                      %15s %19s %n",
    	    String.format("%s", priceFormat.format(costPerSquareFoot)), 
    	    String.format("%s", moneyFormat.format(cost)),
    	    String.format("%s", taxFormat.format(TAX_RATE)),
    	    String.format("%s", areaFormat.format(tax)),
    	    "", // For aligning Total label
    	    String.format("%s", moneyFormat.format(totalCost)));

    	// Print the bill
    	System.out.println("\n");
    	System.out.println(customerSection);
    	System.out.println(measurementSection);
    	System.out.println(chargesSection);

    }
}
