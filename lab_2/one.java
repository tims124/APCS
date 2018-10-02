//Lab 2 part 1; user input+operations with those inputs

import java.util.Scanner;

public class one{
	public static void main(String[] args){
		System.out.println("this program asks for two integer");
		System.out.println("and performs arithmetic operations on them");
		
		//new input
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.print("Enter integer one:");
		int inputOne = input.nextInt();
		System.out.print("Enter integer two:");
		int inputTwo = input.nextInt();
		
		//input check
		//System.out.println("Number one:"+inputOne);
		//System.out.println("Number two:"+inputTwo);
		
		//basic operations
		System.out.println("Sum of integer one and integer two is "+(inputOne+inputTwo));
		System.out.println("Difference of integer one and integer two is "+(inputOne-inputTwo));	
		System.out.println("Product of integer one and integer two is "+(inputOne*inputTwo));	
		System.out.println("Distance between integer one and two is "+(Math.abs(inputOne-inputTwo)));
		System.out.println("Quotient of integer one and integer two "+(inputOne/inputTwo));	
		double Rem = (double)(inputOne%inputTwo); //remainder as a double
		System.out.println("Remainder of the quotient of integer one and integer two is "+Rem);	
		
		//avg
		double avg = (double)(inputOne+inputTwo)/2;
		System.out.println("Average of integer one and integer two is "+avg);
		
		//min max
		System.out.println("Maximum value of integer one and integer two is "+(Math.max(inputTwo, inputOne)));
		System.out.println("Minimum value of integer one and integer two is "+(Math.min(inputTwo, inputOne)));
	}
}