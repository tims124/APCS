
//import java.math.*
public class Fraction{
	public Fraction(int n, int d){
		num = n;
		denom = d;
	}
	public Fraction(int n){
		num = n;
		denom = 1;
	}
	
	public int getNum(){
	return num;
	}
	
	public int getDenom(){
	return denom;
	}
	
	public Fraction multiplyFraction(Fraction a){ //multiplies the original fraction by a new fraction
	denom = this.getDenom() * a.getDenom()	;
	num =this.getNum( )* a.getNum();
	return new Fraction(num,denom); // then returns it
	}
	
	public void dispFraction(){
	System.out.println(num+"/"+denom);
	}
		
	private int num;
	private int denom;
}