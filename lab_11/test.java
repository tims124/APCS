import java.util.*;
public class test{
    public static int[] random(int len){
	int[] unsortedArray = new int[len];
	for(int i = 0; i <unsortedArray.length;i++){
	  int rnd = (int)(Math.random() *100);
	  unsortedArray[i] = rnd;
      }      
      return unsortedArray;
    }

    public static void rndOut(int[] unsortedArray){
	System.out.print("{");
      for(int i = 0; i <unsortedArray.length - 1; i++){
	  System.out.print(unsortedArray[i] + ", ");
      }
      System.out.println(unsortedArray[unsortedArray.length -1 ] + "}");
    }
    
    
    public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the length of the unsorted array: ");
      int len = input.nextInt();
      
      
      int[] unsortedArray1 = random(len);
      insertion test1 = new insertion(len);

      int[] unsortedArray2 = random(len);
      selection test2 = new selection(unsortedArray2);

      //sort methods
      System.out.print("Insertion Unsorted Array: ");
      rndOut(unsortedArray1);
      test1.sort(unsortedArray1);
      System.out.println("Insertion Sorted Array: {"+test1+"}");

      System.out.println("");
      
      System.out.print("Selection Unsorted Array: ");
      rndOut(unsortedArray2);
      test2.sort();
      System.out.println("Selection Sorted Array: {"+test2+"}");
    }
}
