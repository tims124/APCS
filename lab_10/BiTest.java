import java.util.*;

public class BiTest{
  public static void main(String[] args){
      BiSearch test = new BiSearch();
      Scanner input = new Scanner(System.in);
      // int[] sortedArray = {1,1,2,3,5,8,13,21,34};
       int target = 0;
    
      System.out.print("Length of array? ");
      int dist = input.nextInt();
      int[] unsortedArray = new int[dist];
      int[] sortedArray = new int[dist];
      
      for(int i = 0; i <unsortedArray.length;i++){
	  int rnd = (int)(Math.random() *100);
	  unsortedArray[i] = rnd;
      }
      System.out.print("Array: {");
      for(int i = 0; i <unsortedArray.length - 1; i++){
	  System.out.print(unsortedArray[i] + ", ");
      }
      System.out.println(unsortedArray[unsortedArray.length -1 ] + "}");

      sortedArray = test.bubbleSort(unsortedArray);
    
      System.out.print("Sorted Array: {");
      for(int i = 0; i <sortedArray.length - 1; i++){
	  System.out.print(sortedArray[i] + ", ");
      }
      System.out.println(sortedArray[sortedArray.length -1 ] + "}");
      
     System.out.print("Target: ");
      target = input.nextInt();
      
      /*target = 20;
      System.out.println("Searching for int :"+target);
      System.out.print("In array: ");
      for(int i : sortedArray){
	  System.out.print(i);
      }
      */
      if(test.search(sortedArray,0,sortedArray.length - 1, target) == -1){
	  System.out.println("Target was not found");
      }else{
	  System.out.print("The value "+target+" was found at index ");
	  System.out.println(test.search(sortedArray,0,sortedArray.length - 1, target)); 
      }


      

  }
}
