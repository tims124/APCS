import java.util.*;
public class twoD{
  public twoD(int n, int m){
    array = new int[n][m];
    height = n;
    width = m;
  }

  public void fillTwoDArray(int n){
    int random;
    for(int h = 0; h < height; h++){
      for(int w = 0; w < width; w++){
        random = (int)(Math.random() * n+1);
        array[h][w] = random;
      }
    }
  }

  public void displayArray(){
    for(int h = 0; h < height; h++){
      for(int w = 0; w < width; w++){
        System.out.print(array[h][w]);
        if(array[h][w]<10){
          System.out.print("   ");
        }
        if(array[h][w]>9 && array[h][w] < 100){
          System.out.print("  ");
        }
        if(array[h][w]>99){
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }

  private int[][] array;
  private int height;
  private int width;
}
