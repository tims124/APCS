public class Rectangle extends Shape{
  public Rectangle(){
    super();
    width = 1;
    length = 1;
  }
  public Rectangle(double w, double l){
    super();
    width=w;
    length = l
  }
  public Rectangle(double w, double l, String c, boolean f){
    super(c,f);
    width = w;
    length = l;
  }

  public double getWidth(){
    return width;
  }

  public void setWidth(double newwidth){
    this.width = newwidth;
  }

  public double getLength(){
    return length;
  }

  public void setLength(double newlength){
    this.width = newlength;
  }

  public double getArea(){
    return width * length;
  }

  public double getPerimeter(){
    return(2*width + 2*length);
  }

  public String toString(){
    return "A Rectangle with width="+width+" and length="+length", which is a subclass of " super.toString();
  }

  private double width;
  private double length;
}
