public class Circle extends Shape{
  public Circle(){
    super();
    radius = 1.0;
  }

  public Circle(double r){
    super();
    radius = r;
  }

  public Circle(double r, String c, boolean f){
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
    return (radius * radius * Math.PI);
  }

  public String toString(){
    return "A Circle with radius="+radius+", which is a subclass of "+super.toString();
  }

  public double getPerimeter(){
    return(2*radius*Math.PI);
  }

  private double radius;
}
