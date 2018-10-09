/**
Enderton's class to test the Fraction class
Also, extend the test program to ask for user input for the numerator and denominator of
both the first and second fractions.
*/
import java.util.Scanner;
public class FractionTest{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in)
	System.out.println("Enter denominator of the first number: ");
	int d1 = input.nextInt();

	System.out.println("Enter numerator of the first number: ");
	int n1 = input.nextInt();

	System.out.println("Enter denominator of the second number: ");
	int d2 = input.nextInt();

	System.out.println("Enter numerator of the second number: ");
	int n2 = input.nextInt();

	Fraction f1 = new Fraction(n1,d1);
	Fraction f2 = new Fraction(n2,d2);
	Fraction r = new Fraction(1,1);
	r = f1.multiplyFraction(f2);
	r.dispFraction();
}
}
