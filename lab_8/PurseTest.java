/**
public class PurseTest
  public static void main(String[] args)
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
    myPurse.getTotal();
    /*Testing toString
	}
