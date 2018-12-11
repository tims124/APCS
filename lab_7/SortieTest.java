import java.util.*;
public class SortieTest{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("How long do you want the array to be: ");
    int l = input.nextInt();
    Sortie test = new Sortie(l);
    test.sortArray();
  }
}
