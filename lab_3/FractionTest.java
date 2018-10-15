/**
Enderton's class to test the Fraction class
Also, extend the test program to ask for user input for the numerator and denominator of
both the first and second fractions.
*/
import java.util.Scanner;
public class FractionTest{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter denominator of the first number: ");
	int d1 = input.nextInt();

	System.out.print("Enter numerator of the first number: ");
	int n1 = input.nextInt();

	System.out.print("Enter denominator of the second number: ");
	int d2 = input.nextInt();

	System.out.print("Enter numerator of the second number: ");
	int n2 = input.nextInt();

	System.out.println("");
	
	Fraction f1 = new Fraction(n1,d1);
	Fraction f2 = new Fraction(n2,d2);
	Fraction r = new Fraction(1,1);
	r = f1.multiplyFraction(f2);
	System.out.print("Multiplying the fractions: ");
	r.dispFraction();

	f1 = new Fraction(n1,d1);
	f2 = new Fraction(n2,d2);
	r = new Fraction(1,1);
	r = f1.divideFraction(f2);
	System.out.print("Dividing the fractions: ");
	r.dispFraction();

	f1 = new Fraction(n1,d1);
	f2 = new Fraction(n2,d2);
	r = new Fraction(1,1);
	r = f1.addFraction(f2);
	System.out.print("Adding the fractions: ");
	r.dispFraction();

	f1 = new Fraction(n1,d1);
	f2 = new Fraction(n2,d2);
	r = new Fraction(1,1);
	r = f1.subtractFraction(f2);
	System.out.print("Subtracting the fractions: ");
	r.dispFraction();
}
}
