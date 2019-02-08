public class Shape{
  public Shape(){
    color ="green";
    fill = true;
  }
  public Shape(String a,boolean b){
    color = a;
    fill = b;
  }

  public String getColor(){
    return color;
  }

  public boolean isFilled(){
    return fill;
  }

  public void setColor(String newcolor){
    this.color = newcolor;
  }

  public void setFilled(boolean newfill){
    this.fill = newfill;
  }

  public String toString(){
    String filled;
    if(fill = true){
      filled = "filled";
    }else{
      filled = "not filled";
    }
    return "A Shape with color of "+color+" and "+filled;
  }

  private String color;
  private boolean fill;
}
