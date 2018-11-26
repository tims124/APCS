public class ArrayTest{
  public static void main(String[] args){
    int n = 10;
    ArrayClass test = new ArrayClass(10);
    test.fillArray(8);
    System.out.println(test.findMax());
    System.out.println(test.findMin());
    System.out.println(test.sumArray());
    System.out.println(test.avgArray());
    test.displayArray();
    System.out.println(test.valueAt(2));
    System.out.println(test.findValue(2));
    test.reverseArray();
    test.displayArray();

}
}
