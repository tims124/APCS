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
    return "Shape: Filled="+this.isFilled()+" Color="+this.getColor();
  }

  private String color;
  private boolean fill;
}
