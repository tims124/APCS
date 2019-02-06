public class Lion extends Feline implements Trainable{
  public Lion(){
    hunger = 0.9;
    livesleft =3;
  }
  public String makeNoise(){
    return "ROAR!";
  }
  public void sit(){
    System.out.println("Lion sit");
  }
  public void stand(){
    System.out.println("Lion stand");
  }
}
