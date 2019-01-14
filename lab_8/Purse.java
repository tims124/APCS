import java.util.*;

//Purse Class - a purse holds a collection of coins in an Array List

public class Purse{
	//Constructor - constructs an empty purse
	private int value;
	private String name;
	public Purse(){
		coins = new ArrayList<Coin>();
	}

	//Add a coin to the purse

	public void add(Coin aCoin){
		coins.add(aCoin);
	}

	//Add a coin to the purse at a specific location
	public void addAt(int n, Coin aCoin){
		coins.add(n,aCoin);
	}

	/**Returns the total values of coins in the purse*/

	public double getTotal(){
		double total = 0;
		for(int i = 0; i <coins.size(); i++){
			total = total + coins.get(i).getValue();
		}
		return total;
	}

	//Returns the number of coins in the purse
		public int count(){
			return coins.size();
		}
	//Tests whether the purse has a coin that matches the given coin – returns
	//true or false
	public boolean find(Coin aCoin){
		for(int counter = 0; counter <coins.size(); counter++){
				if(coins.get(counter).getName().equals(aCoin.getName())){ //freaking magic
					return true;
				}
		}
		return false;
	}

	//Returns the number of coins in the purse that match a given coin
	public int count(Coin aCoin){
		int count = 0;
		for(int i = 0; i <coins.size(); i++){
				if(coins.get(i).getName().equals(aCoin.getName())){
					count++;
				}
		}
		return count;
	}

	//Returns the coin in the purse with the largest value
	public Coin getMaximum(){
		int val = 0;
		for(int i =0; i < coins.size()-1; i++){
			if(coins.get(i).getValue() > coins.get(i+1).getValue()){
				val = i;
			}
		}
		return coins.get(val);
	}

	// Returns the list of coins in the purse as a string.
	public String toString(){
		return name + " " + value;
	}

	// Reverses the order of the coins in the purse
	public void reverse(){
		for(int i = 0; i < (coins.size()/2.0); i++){
			Coin temp = coins.get(i);
			coins.set(coins.size()-i-1,temp);
			coins.remove(coins.size()-1);
		}
	}

	/*
	//Transfers the contents of one purse to another

	public void transfer(Purse p)
	{…}

	//Compares the contents of this purse to another (in order)

	public boolean equalsExactly(Purse p){…}

	//Returns coin at given location in purse

	public Coin coinAt(int n){…}

	//Compares the contents of this purse to another (any order)

	public boolean sameCoins(Purse p){…}

	*/
	private ArrayList<Coin> coins;
}
