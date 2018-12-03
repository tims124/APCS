public class ArrayTest{
  public static void main(String[] args){
    int n = 10;
    ArrayClass test = new ArrayClass(n);
    test.fillArray(n);
    System.out.println("Max: "+test.findMax());
    System.out.println("Min: "+test.findMin());
    System.out.println("Sum: "+test.sumArray());
    System.out.println("Average: "+test.avgArray());
    test.displayArray();
    System.out.println("Value at index 2: "+test.valueAt(2));
    System.out.println("Index with value 2: "+test.findValue(2));
    test.reverseArray();
    System.out.println("Reversed array:");
    test.displayArray();

}
}
