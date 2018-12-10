public class SortieTest{
  public static void main(String[] args){
  int l = 10;
  ArrayClass test1 = new ArrayClass(l);
  Sortie test = new Sortie(l);
  test1.fillArray(l);
  System.out.println("Array class: ");
  test1.displayArray();
  System.out.println("Sort Array initial: ");
  test.displayArray();
  test.sortArray();
  System.out.println("sort array final: ");
  test.displayArray();
  }
}
