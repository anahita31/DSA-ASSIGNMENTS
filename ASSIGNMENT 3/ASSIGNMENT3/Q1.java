package ASSIGNMENT3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
	try {
		System.out.println("Enter your lucky number:");
		String input = sc.nextLine();
		int luckyNumber = Integer.parseInt(input);
		if (luckyNumber < 0) {
            throw new NumberFormatException("Negative numbers are not allowed.");
        }
	System.out.println("Your lucky number is: " + luckyNumber);
	}catch (NumberFormatException e) {
        System.out.println("Invalid input! " + e.getMessage());
    } 
    finally {

    }
	}
}
