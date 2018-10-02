//Car Class

public class Car {

		public Car(int p, int y){
			price = p ;
			year = y;
		}

	public int setPrice(int newPrice){
	this.price = newPrice;
	return price;
	}	
	
	public int getPrice(){
		return price;
	}
 
	public int getYear(){
		return year;
	}
	
private int price;
private int year;

}