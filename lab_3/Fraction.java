
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

	public Fraction divideFraction(Fraction a){
		this.denom = this.getDenom() * a.getNum();
		this.num = this.getNum() * a.getDenom();
		return new Fraction(this.num,this.denom);
	}

	public Fraction addFraction(Fraction a){
		this.num = this.getNum() * a.getDenom() + this.getDenom() * a.getNum();
		this.denom =this.getDenom() * a.getDenom();
		return new Fraction(this.num,this.denom);
	}

	public Fraction subtractFraction(Fraction a){
		this.num = this.getNum() * a.getDenom() - this.getDenom() * a.getNum();
		this.denom =this.getDenom() * a.getDenom();
		return new Fraction(this.num,this.denom);
	}

	public void dispFraction(){
	System.out.println(num+"/"+denom);
	}

	private int num;
	private int denom;
}
