public class Dog extends Canine implements Trainable{
  public Dog(){
    hunger = .5;
  }
  public String makeNoise(){
    return "bark!";
  }
  public void sit(){
    System.out.println("Dog sit");
  }
  public void stand(){
    System.out.println("Dog stand");
  }
  }
