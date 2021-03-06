/**
	A class to test the Purse class
*/

public class PurseTest
{
	public static void main(String[] args)
	{
		Coin penny=new Coin(0.01,"Penny");
		Coin nickel=new Coin(0.05,"Nickel");
		Coin dime=new Coin(0.10,"Dime");
		Coin quarter=new Coin(0.25,"Quarter");
		Coin dollar=new Coin(1.00, "Dollar");
		Purse myPurse=new Purse();
		myPurse.add(dime);
		myPurse.add(dime);
		myPurse.add(penny);
		myPurse.add(quarter);
		myPurse.add(nickel);
		System.out.println();

		// Testing toString
		System.out.println("Testing toString");
		System.out.println("The purse");
		System.out.println(myPurse.toString());
		System.out.println();

		// Testing addAt
		System.out.println("Testing addAt");
		System.out.println("The purse");
		System.out.println(myPurse.toString());
		myPurse.addAt(1,quarter);
		System.out.println("The purse after adding a quarter at index 1");
		System.out.println(myPurse.toString());
		System.out.println();

		// Testing getTotal
		System.out.println("Testing getTotal");
		System.out.println("The purse");
		System.out.println(myPurse.toString());
		System.out.println("The coins in the purse are worth in total "+myPurse.getTotal());
		System.out.println();

		// Testing count
		System.out.println("Testing count and count(aCoin)");
		System.out.println("The purse");
		System.out.println(myPurse.toString());
		System.out.println("There are "+myPurse.count()+" coins in the purse.");
		System.out.println("The number of dimes in the purse is  "+myPurse.count(dime));
		System.out.println();

		// Testing find
		System.out.println("Testing find");
		System.out.println("The purse");
		System.out.println(myPurse.toString());
		System.out.println("There is a dime in the purse: "+myPurse.find(dime));
		System.out.println("There is a dollar in the purse: "+myPurse.find(dollar));
		System.out.println();

		// Testing getMaximum
		System.out.println("Testing getMaximum");
		System.out.println("The purse");
		System.out.println(myPurse.toString());
		System.out.println("The maximum value coin in the purse is: "+(myPurse.getMaximum()).getName());
		System.out.println();

		// Testing coinAt
		System.out.println("Testing coinAt");
		System.out.println("The purse");
		System.out.println(myPurse.toString());
		System.out.println("The coin at index 3 in the purse is: "+(myPurse.coinAt(3)).getName());
		System.out.println();

		// Testing reverse
		System.out.println("Testing reverse");
		myPurse.reverse();
		System.out.println("The purse reversed");
		System.out.println(myPurse.toString());
		System.out.println();

		// Testing transfer
		System.out.println("Testing transfer");
		Purse myPurse2=new Purse();
		myPurse2.add(quarter);
		myPurse2.add(dime);
		System.out.println("Purse to receive coins");
		System.out.println(myPurse2.toString());
		myPurse.transfer(myPurse2);
		System.out.println("Purse after receiving coins");
		System.out.println(myPurse2.toString());
		System.out.println();

		// Testing equalsExactly
		System.out.println("Testing equalsExactly");
		Purse myPurse3=new Purse();
		Purse myPurse4=new Purse();
		Purse myPurse5=new Purse();
		Purse myPurse6=new Purse();

		myPurse3.add(quarter);
		myPurse3.add(dime);
		myPurse3.add(penny);

		myPurse4.add(quarter);
		myPurse4.add(dime);
		myPurse4.add(penny);

		myPurse5.add(quarter);
		myPurse5.add(dime);
		myPurse5.add(nickel);

		myPurse6.add(quarter);
		myPurse6.add(dime);

		System.out.println("Purse 3");
		System.out.println(myPurse3.toString());
		System.out.println("Purse 4");
		System.out.println(myPurse4.toString());
		System.out.print("Purse 3 and Purse 4 are ");
		if(myPurse3.equalsExactly(myPurse4))
			System.out.println("equal.");
		else
			System.out.println("not equal.");
		System.out.println();

		System.out.println("Purse 3");
		System.out.println(myPurse3.toString());
		System.out.println("Purse 5");
		System.out.println(myPurse5.toString());
		System.out.print("Purse 3 and Purse 5 are ");
		if(myPurse3.equalsExactly(myPurse5))
			System.out.println("equal.");
		else
			System.out.println("not equal.");
		System.out.println();

		System.out.println("Purse 3");
		System.out.println(myPurse3.toString());
		System.out.println("Purse 6");
		System.out.println(myPurse6.toString());
		System.out.print("Purse 3 and Purse 6 are ");
		if(myPurse3.equalsExactly(myPurse6))
			System.out.println("equal.");
		else
			System.out.println("not equal.");
		System.out.println();

		// Testing sameCoins
		System.out.println("Testing sameCoins");
		Purse myPurse7=new Purse();
		Purse myPurse8=new Purse();
		Purse myPurse9=new Purse();
		Purse myPurse10=new Purse();

		myPurse7.add(quarter);
		myPurse7.add(dime);
		myPurse7.add(penny);
		myPurse7.add(penny);
		myPurse7.add(nickel);
		myPurse7.add(penny);
		myPurse7.add(nickel);

		myPurse8.add(penny);
		myPurse8.add(dime);
		myPurse8.add(penny);
		myPurse8.add(quarter);
		myPurse8.add(penny);
		myPurse8.add(nickel);
		myPurse8.add(nickel);

		myPurse9.add(penny);
		myPurse9.add(penny);
		myPurse9.add(penny);
		myPurse9.add(quarter);
		myPurse9.add(penny);
		myPurse9.add(nickel);
		myPurse9.add(nickel);

		myPurse10.add(penny);
		myPurse10.add(penny);
		myPurse10.add(penny);
		myPurse10.add(quarter);
		myPurse10.add(penny);
		myPurse10.add(nickel);

		System.out.println("Purse 7");
		System.out.println(myPurse7.toString());
		System.out.println("Purse 8");
		System.out.println(myPurse8.toString());
		System.out.print("Purse 7 and Purse 8 are ");
		if(myPurse7.sameCoins(myPurse8))
			System.out.println("equal.");
		else
			System.out.println("not equal.");
		System.out.println();

		System.out.println("Purse 7");
		System.out.println(myPurse7.toString());
		System.out.println("Purse 9");
		System.out.println(myPurse9.toString());
		System.out.print("Purse 7 and Purse 9 are ");
		if(myPurse7.sameCoins(myPurse9))
			System.out.println("equal.");
		else
			System.out.println("not equal.");
		System.out.println();

		System.out.println("Purse 7");
		System.out.println(myPurse7.toString());
		System.out.println("Purse 10");
		System.out.println(myPurse10.toString());
		System.out.print("Purse 7 and Purse 10 are ");
		if(myPurse7.sameCoins(myPurse10))
			System.out.println("equal.");
		else
			System.out.println("not equal.");
		System.out.println();
		System.out.println(myPurse10);

	}
}
