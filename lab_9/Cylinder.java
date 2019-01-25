public class Cylinder extends Circle{
  private double height;
  public Cylinder(){
    super();
    height = 1.0;
  }

  public Cylinder(double height){
    super();
    this.height = height;
  }

  public Cylinder(double radius, double height){
    super(radius);
    this.height = height;
  }

  public double getHeight(){
    return height;
  }

  public double getVolume(){
    return super.getArea()*height;
  }

  public double getArea(){
    return 2 * Math.PI * super.getRadius() * this.getHeight() + (2 * super.getArea()) ;
  }

  public String toString(){
    return "Cylinder: height=" + this.getHeight() + " radius=" + this.getRadius();
  }

}
