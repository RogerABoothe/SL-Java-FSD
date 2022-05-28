package course2;

import java.util.Scanner;
// 1.6 Creating an Arithmetic Calculator

public class Calculator {
	
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		int userChoice1; 
		int userChoice2;
		int userChoice3;
		
		System.out.println("Welcome to the SL-JavaFSD Calculator!");
		System.out.println("This is a text based calculator");
		
		// set input parameters
		do {
			System.out.println("Select the type for the First number you want to enter");
			System.out.println("1 - Integer/Whole number");
			System.out.println("2 - Double/Decimal number");
			userChoice1 = scr.nextInt();
		} while ( userChoice1 != 1 && userChoice1 != 2 );
		
		if (userChoice1 == 1) {
			System.out.println("You selected Integer. Input your First Number:");
			int userNum1 = scr.nextInt();
		}
		if (userChoice1 == 2) {
			System.out.println("You selected Double. Input your First Number:");
			double userNum1 = scr.nextDouble();
		}
		
		do {
			System.out.println("Select the type for the Second number you want to enter");
			System.out.println("1 - Integer/Whole number");
			System.out.println("2 - Double/Decimal number");
			userChoice2 = scr.nextInt();
		} while ( userChoice1 != 1 && userChoice1 != 2 );
		
		if (userChoice2 == 1) {
			System.out.println("You selected Integer. Input your Second Number:");
			int userNum2 = scr.nextInt();
		}
		if (userChoice2 == 2) {
			System.out.println("You selected Double. Input your Second Number:");
			double userNum2 = scr.nextDouble();
		}
		
		// determine operation
		do {
			System.out.println("What do you want to do with the numbers?");
			System.out.println("1 - Add the numbers");
			System.out.println("2 - Subtract the numbers");
			System.out.println("3 - Multiple the numbers");
			System.out.println("4 - Divide the numbers");
			userChoice3 = scr.nextInt();
		} while ( userChoice3 != 1 && userChoice3 != 2 && userChoice3 != 3 && userChoice3 != 4 );
	
	}	
}
