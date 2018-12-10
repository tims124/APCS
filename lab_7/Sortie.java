public class Sortie{
  public  Sortie(int l){
  array = new int[l];
  al = l;
  }

  public void sortArray(){
    int buffer;
    ArrayClass a = new ArrayClass(al);
    for(int counter = 0; counter < al; counter++){
      array[counter] = a.valueAt(counter);
    }
    for(int x = 0; x < 10; x++){
      for(int y = 0; y < 9-x;y++){
        if(array[y]>array[y+1]){
          buffer = array[x];
          array[x] = array[y];
          array[y] = buffer;
        }
      }
    }

  }

  public void displayArray(){
    int counter = 0;
    while(counter < array.length){
      System.out.print("Index: "+counter);
      System.out.println(" | Value: "+array[counter]);
      counter++;
    }
  }

  private int al;
  private int[] array;

}
