/**	A class to test the Purse class*/
public class PurseTest{
  public static void main(String[] args)	{
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
    System.out.println(myPurse.getTotal());
    System.out.println(myPurse.find(penny));
    System.out.println(myPurse.count(dime));
    System.out.println(myPurse.getMaximum().getName()+ "  " +myPurse.getMaximum().getValue());
    myPurse.reverse();
    System.out.println(dime.toString());
	}
}
