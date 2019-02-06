public abstract class Animal{

  protected double hunger;
  protected boolean isAwake = true;

  public double getHunger() {
    return hunger;
  }

  public void eat(){
    hunger = 0;
  }

  public boolean isAwake() {
    return isAwake;
  }

  public void sleep(){
    isAwake = false;
  }

  public void wakeUp(){
    isAwake = true;
  }

// ~~~~~~ abstract methods ~~~~~~~~

  public abstract String makeNoise();

  public abstract void roam();
}
