//Lab 2 pt 4; converts miles to km

import java.util.Scanner;

public class four{
	public static void main(String[] args){
	System.out.println("This program asks for a number of miles then converts it to kilometers");
	
	//new input
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Miles:");	
	 double miles = input.nextDouble();
	 
	 System.out.println("Kilometer=" +(miles * 1.609344));
	
	
	}
}