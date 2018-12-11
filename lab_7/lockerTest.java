public class lockerTest{
  public static void main(String[] args){
    locker test = new locker();
    System.out.println("Inital:");
    test.display();
    System.out.println("Final:");
    test.toggle();
    test.display();
  }
}
