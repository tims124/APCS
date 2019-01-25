public class Circle1 extends Shape{
  public Circle1(){
    super();
    radius = 1.0;
  }
  public Circle1(double r, String c, boolean f){
    super(c,f);
    radius  = r;
  }

  public double getRadius(){
    return radius;
  }

  public void setRadius(double newradius){
    this.radius = newradius;
  }

  public double getArea(){
    return (radius * radius * MATH.PI);
  }

  public String toString(){
    return "A Circle with radius="+radius+", which is a subclass of "+super.toString();
  }

  private double radius;
}
