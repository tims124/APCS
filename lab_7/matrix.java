import java.util.*;
public class matrix{
  public matrix(){
  }

  public void fillMatrix(){
    Scanner in = new Scanner(System.in);
    System.out.print("How many rows do you want? ");
    h = in.nextInt();
    System.out.print("How many coloumns do you want? ");
    l = in.nextInt();
    mtrx = new int[h][l];
    for(int y = 0; y < h; y++){
      for(int x = 0; x < l; x++){
        System.out.print("Value for ("+x+1+","+y+1+"): ");
        int val = in.nextInt();
        mtrx[y][x] = val;
      }
    }
  }
  public void transposeMatrix(){
    int[][] buffer = new int[l][h];
    for(int y = 0; y < h; y++){
      for(int x = 0; x < l; x++){
        buffer[x][y] = mtrx[y][x];
      }
    }
    for(int y = 0; y < h; y++){
      for(int x = 0; x < l; x++){
        buffer[x][y] = mtrx[x][y];
      }
    }
  }

  /*
  public void addMatrix(Matrix a){}

  public void subtractMatrix(Matrix a){}

  public void multiplyMatrix(Matrix a){}

  public void displayMatrix(){}
*/
  private int[][] mtrx;
  private int l;
  private int h;
}
