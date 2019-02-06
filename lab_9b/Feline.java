public abstract class Feline extends Animal{
  protected int livesleft;

  public int getLivesLeft(){
    return livesleft;
  }

  public void roam(){
    hunger += (1 - hunger) / 2;
  }
}
