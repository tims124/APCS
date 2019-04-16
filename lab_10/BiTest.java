import java.util.*;

public class BiTest{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Array size: ");
    int size = input.nextInt();
    System.out.print("Target: ");
    int target = input.nextInt();
    int mid = size / 2;
    BiSearch test = new BiSearch();
    BiSearch test2 = new BiSearch();
    int[] arrayTest = new int[size];
    for(int i = 0; i< arrayTest.length; i++){
      arrayTest[i] = i;
      //System.out.println(arrayTest[i]);
    }

    System.out.print("In the array of {");
    for(int i = 0; i < arrayTest.length - 1;i++){
      System.out.print(" "+arrayTest[i]+",");
    }
    System.out.println(" "+arrayTest[arrayTest.length-1]+"}");
    System.out.println("With target "+target);

    System.out.println("The value: "+target+" was found at index: "+test.search(target,arrayTest,mid,0));
    //System.out.println("The value: "+6+" was found at index: "+test.search(20,arrayTest,5));

  }
}
