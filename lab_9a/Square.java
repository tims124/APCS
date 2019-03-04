public class Square extends Rectangle{
  public Square(){
    super();
  }

  public Square(double s){
    super(s,s);
  }

  public Square(double s, String c, boolean f){
    super(s,s,c,f);
  }

  public double getSide(){
    return super.getWidth();
  }

  public void setSide(double newside){
    super.setWidth(newside);
    super.setLength(newside);
  }

  public String toString(){
    return "A Square with side="+super.getWidth()+", which is a subclass of "+super.toString();
  }
}
