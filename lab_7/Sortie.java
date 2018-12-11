public class Sortie{
  public  Sortie(int l){
  array = new int[l];
  al = l;
  }

  public void sortArray(){
    int buffer;
    //Makes Array thingy
    ArrayClass a = new ArrayClass(al);
    a.fillArray(10);
    for(int counter = 0; counter < al; counter++){
      array[counter] = a.valueAt(counter);
    }
    System.out.println("Initial Array: ");
    for(int counter = 0; counter < al; counter++){
      System.out.print("Index: "+counter);
      System.out.println(" | Value: "+array[counter]);
    }

    //Tries to sort array thingy
    boolean check = true;
    while(check){
      check = false;
      for(int counter = 0; counter < al-1; counter++){
        if(array[counter] > array[counter+1]){
          buffer = array[counter];
          array[counter] = array[counter+1];
          array[counter+1] = buffer;
          check = true;
        }
      }
    }
    System.out.println("");
    System.out.println("Sorted Array: ");
    for(int counter = 0; counter < al; counter++){
      System.out.print("Index: "+counter);
      System.out.println(" | Value: "+array[counter]);
  }
  }


  private int al;
  private int[] array;

}
