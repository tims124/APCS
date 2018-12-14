import java.util.*;
public class magicSquare{
  public magicSquare(int l){
    sqr = new int[l][l];
    h = l;
    w = l;
  }

  public void check(){
    int sum = 0;
    int sum1= 0;
    int buffer;
    boolean check = true;
    boolean check1 = true;
    int[] test = new int[h*w];

    //checks for n^2 value
    for(int y = 0; y < h; y++){
      for(int x = 0; x < w; x++){
          test[x+y*w] = sqr[y][x];
      }
    }

    /*
    for(int a = 0; a < test.length; a++){
      System.out.println(test[a]);
    }*/



    for(int i = 0; i < test.length; i++){
      for(int f = 0; f < (test.length - i - 1); f++){
        if(test[f] > test[f+1]){
          buffer = test[f];
          test[f] = test[f+1];
          test[f+1] = buffer;
        }
      }
    }
    if(test[test.length-1] == h*w){
      check = true;
    }else{
      System.out.println("One of your values needs to equal the area of the square");
    }


    if(check){
      for(int counter = 0; counter < test.length; counter++)
          if(!(test[counter] == counter + 1)){
            check1 = false;
            System.out.println("Each value between 1 and n^2 needs to occur once in the square");
            break;
          }
      }


    //checks for actual magic square
    if(check && check1){
    for(int x = 0; x < w; x++){
      sum = sum + sqr[0][x];
    }
    //System.out.println(sum);
    for(int y = 1; y < h; y++){
      for(int x = 0; x < w; x++){
        sum1 = sum1 + sqr[y][x];
      }
    //  System.out.println(sum1);
      if(!(sum1 == sum)){
        System.out.println("This is not a magic square...");
        break;
      }
      sum1 = 0;
    }
    for(int x = 0; x < w; x++){
      for(int y = 0; y < h; y++){
        sum1 = sum1 + sqr[y][x];
      }
      if(!(sum1 == sum)){
        System.out.println("This is not a magic square...");
        break;
      }
      sum1 = 0;
    }


  }
  }


  public void fillSquare(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter values of the matrix...");
      for(int y = 0; y < h; y++){
        for(int x = 0; x < w; x++){
          System.out.print("Position "+(x+1+y*w)+": " );
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
