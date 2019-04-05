public class BiTest{
  public static void main(String[] args){
    BiSearch test = new BiSearch();
    BiSearch test2 = new BiSearch();
    int[] arrayTest = new int[11];
    for(int i = 1; i< arrayTest.length; i++){
      arrayTest[i] = i;
      //System.out.println(arrayTest[i]);
    }

    //System.out.println(test.search(4,arrayTest));
    //System.out.println(test.search(5,arrayTest));
    System.out.println("The value: "+6+" was found at index: "+test.search(6,arrayTest,5));
    System.out.println("The value: "+6+" was found at index: "+test.search(20,arrayTest,5));

  }
}
