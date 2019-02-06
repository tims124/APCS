public abstract class Canine extends Animal{
public void roam(){
// exhibit pack behavior
hunger += (1 - hunger) * 3.0 / 4.0;
}
}
