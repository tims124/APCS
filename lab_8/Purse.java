import java.util.*;

//Purse Class - a purse holds a collection of coins in an Array List

public class Purse{
	//Constructor - constructs an empty purse
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
		String list = "";
		for(int i = 0; i < coins.size(); i++){
			list += coins.get(i).getName()+" ";
		}
		return list;
	}

	// Reverses the order of the coins in the purse
	public void reverse(){
		Coin temp;
		for(int i = 0; i < Math.floor(this.count() / 2) ; i++){
			temp = coins.get(i);
			coins.set(i,coins.get(this.count() - i - 1 ));
			coins.set(this.count() - i - 1, temp);
		}
	}

	//Returns coin at given location in purse
	public Coin coinAt(int n){
		return coins.get(n);
	}

	//Transfers the contents of one purse to another
	//Purse P -> this purse
	public void transfer(Purse p){
		int size = p.count();
		for(int i = 0; i < size; i++){
			coins.add(p.coinAt(0));
			p.coins.remove(0);
		}
	}

	//Compares the contents of this purse to another (in order)
	public boolean equalsExactly(Purse p){
		if(this.count() == p.count()){
			for(int i = 0; i < this.count();i++){
				if(!(this.coinAt(i).equals(p.coinAt(i)))){
					return false;
				}
			}
			return true;
		}
		return false;
	}

	//Compares the contents of this purse to another (any order)
	public boolean sameCoins(Purse p){
		if(this.count() == p.count()){
			if(this.getTotal() == p.getTotal()){
				return true;
			}
		}
		return false;
	}

	private ArrayList<Coin> coins;
	private String name;
	private int value;
}
