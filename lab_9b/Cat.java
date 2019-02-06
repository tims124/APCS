public class Cat extends Feline {
  public Cat(){
    livesleft = 9;
    hunger = 0.4;
  }

  public void eat(){
    hunger = hunger/2;
  }

  public String makeNoise(){
    return "meow";
  }
}
