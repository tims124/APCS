import java.util.*;
public class magicSquare{
  public magicSquare(int l){
    sqr = new int[l][l];
    h = l;
    w = l;
  }

  public void check(){


  }

  public void fillSquare(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter values of the matrix...");
      for(int y = 0; y < h; y++){
        for(int x = 0; x < w; x++){
          System.out.println("Position "+(x+1+y*w)+": " );
          sqr[y][x] = input.nextInt();
        }
      }

      for(int a = 0; a < h; a++){
        for(int b = 0; b < w; b++){
          System.out.print(sqr[a][b]+" ");
          }
          System.out.println("");
        }
    }


  private int h;
  private int w;
  private int[][] sqr;
}
