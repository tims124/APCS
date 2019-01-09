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
    buffer = new int[h][l];
    for(int y = 0; y < h; y++){
      for(int x = 0; x < l; x++){
        System.out.print("Value for ("+(x+1)+","+(y+1)+"): ");
        int val = in.nextInt();
        mtrx[y][x] = val;
      }
    }
    System.out.println("Matrix: ");
    this.displayMatrix();
    System.out.println("");
  }

  public void transposeMatrix(){
    int[][] trans = new int[mtrx[0].length][mtrx.length];
    System.out.println("Matrix one transposed...");
    for(int y = 0; y < mtrx.length; y++){
      for(int x = 0; x < mtrx[0].length; x++){
        trans[x][y] = mtrx[y][x];
      }
    }
    for(int y = 0; y < mtrx.length; y++){
      for(int x = 0; x < mtrx[0].length; x++){
        System.out.print("("+(x+1)+","+(y+1)+"): "+trans[y][x]+" ");
      }
      System.out.println("");
    }

  }


  public void addMatrix(matrix a){
          System.out.println("");
    if((a.mtrx.length == this.mtrx.length) && (a.mtrx[0].length == this.mtrx[0].length)){
      for(int y = 0; y < mtrx.length; y++){
        for(int x = 0; x < mtrx[0].length; x++){
          buffer[y][x] = a.mtrx[y][x] + this.mtrx[y][x];
        }
      }

      System.out.println("Sum of the matricies...");
      for(int y = 0; y < buffer.length; y++){
        for(int x = 0; x < buffer[0].length; x++){
          System.out.print("("+(x+1)+","+(y+1)+"): "+buffer[y][x]+" ");
        }
        System.out.println("");
      }
    }else{
      System.out.println("You can not add these matricies...");
    }
    for(int y = 0; y < mtrx.length; y++){
      for(int x = 0; x < mtrx[0].length; x++){
        buffer[y][x] = 0;
      }
    }
  }

  public void subtractMatrix(matrix a){
    if((a.mtrx.length== this.mtrx.length) && (a.mtrx[0].length== this.mtrx[0].length)){
      for(int y = 0; y < mtrx.length; y++){
        for(int x = 0; x < mtrx[0].length; x++){
          buffer[y][x] = a.mtrx[y][x] - this.mtrx[y][x];
        }
      }
      System.out.println("");
      System.out.println("Difference of the matricies...");
      for(int y = 0; y < buffer.length; y++){
        for(int x = 0; x < buffer[0].length; x++){
          System.out.print("("+(x+1)+","+(y+1)+"): "+buffer[y][x]+" ");
        }
        System.out.println("");
      }
    }else{
      System.out.println("You can not subtract these matricies...");
    }
    for(int y = 0; y < mtrx.length; y++){
      for(int x = 0; x < mtrx[0].length; x++){
        buffer[y][x] = 0;
      }
    }

  }


  public void multiplyMatrix(matrix a){
    System.out.println("");
    int[][] multi = new int[this.mtrx.length][a.mtrx[0].length];
    int sum = 0;
    if(!(this.mtrx[0].length == a.mtrx.length)){
      System.out.println("You can not multiply these two matricies...");
    }else{
      System.out.println("The product of the two matricies...");
      for(int y = 0; y < multi[0].length; y++){
        for(int x = 0; x < multi.length; x++){
          for(int z = 0; z < a.mtrx.length;z++ ){
            multi[y][x] += this.mtrx[y][z] * a.mtrx[z][x];
          }
        }
      }
    }
    System.out.println("");
    for(int y = 0; y < multi.length; y++){
      for(int x = 0; x < multi[0].length; x++){
        System.out.print("("+(x+1)+","+(y+1)+"): "+multi[y][x]+" ");
      }
      System.out.println("");
    }
  }

  public void displayMatrix(){

    for(int y = 0; y < mtrx.length; y++){
      for(int x = 0; x < mtrx[0].length; x++){
        System.out.print("("+(x+1)+","+(y+1)+"): "+mtrx[y][x]+" ");
      }
      System.out.println("");
    }
  }



  private int[][] buffer;
  private int[][] mtrx;
  private int l;
  private int h;
}
