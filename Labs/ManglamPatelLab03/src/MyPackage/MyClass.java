package MyPackage;
import java.util.Scanner;

/**
* Lab 03, Calculating Percentage of Male and Female student in the class, using OPPS concepts.
* @auther Manglam Mukeshkumar Patel
* @version 1.1
*/

public class MyClass {
	
//	Main method, also called entry point of the java program
	public static void main(String[] args){
		//creating the scanner class object to get user input.
		Scanner input = new Scanner(System.in);
	
		// variables declaration. 
		int noMale, noFemale,total;
		
		System.out.print("Enter number of Male students :");
		noMale = input.nextInt(); // fetching the user entered number. 
		
		System.out.print("Enter number of Female students :");
		noFemale = input.nextInt(); // fetching the user entered number.
		
		//adding the total number of students in total variable. 
		total = noMale+noFemale;
	
		// with custom method called cal_per which calculates percentage takes two int as input and returns float.
		System.out.println("Total percentage of Male student is : " + Cal_per(noMale, total) +"%");
		System.out.println("Total percentage of Female student is : " + Cal_per(noFemale, total)+"%");
		
		input.close(); // closing the scanner class object
		
	}
	
	// Custom method for converting percentage. 
	public static float Cal_per(int number, int total){
		float per; 
		
		per = (number*100)/total; 
		
		return per; //returns the value.
	}



}