/**
Enderton's class to test the Fraction class
*/
public class FractionTest{
	public static void main(String[] args){
	
	Fraction f1 = new Fraction(2,5);
	Fraction f2 = new Fraction(3,4);
	Fraction r = new Fraction(1,1);
	r = f1.multiplyFraction(f2);
	r.dispFraction();
}
}