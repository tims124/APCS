/**
	A class to test the array class
*/

public class NumberPlayTest
{
	public static void main(String[] args)
	{
		NumberPlay a = new NumberPlay(15);
		a.fillArray(10);
		System.out.println("The array contains the following values:");
		a.displayArray();
		System.out.println("");
		System.out.println("The maximum value in the array is " + a.findMax());
		System.out.println("The sum of the odd values in the array is " + a.addOdds());
		a.sortArray();
		System.out.println("The sorted array contains the following values:");
		a.displayArray();
		
	}
}