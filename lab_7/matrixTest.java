public class matrixTest{
  public static void main(String[] args){
  matrix test = new matrix();
  matrix test1 = new matrix();

  System.out.println("Enter dimensions and values for matrix one...");
  test.fillMatrix();
  System.out.println("Enter dimensions and values for matrix two...");
  test1.fillMatrix();

  test.addMatrix(test1);
  test.subtractMatrix(test1);
//  test.transposeMatrix();

  }
}
