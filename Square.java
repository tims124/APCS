public class Square extends Rectangle{
  public Square(){
    super();
  }
  public Square(double s){
    super(s,s);
    side = s;
  }
  public Square(double s, String c, boolean f){
    super(s,s,c,f);
    side = s;
  }

  public double getSide(){
    return side;
  }

  public void setSide(double newside){
    this.side = newside;
  }

  public void setWidth(double newwidth){
    this.side = newwidth;
  }

  public void setLength(double newlength){
    this.side = newlength;
  }

  public String toString(){
    return "A Square with side="+side+", which is a subclass of "super.toString();
  }
  
  private double side;
}
