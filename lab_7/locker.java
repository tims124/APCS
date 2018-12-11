public class locker{
  public locker(){
   array = new boolean[10][10];
   for(int h = 0; h < 10; h++){
     for(int w = 0; w < 10; w++){
       array[h][w] = true;
     }
   }
  }

  public void toggle(){
    for(int div = 2; div <101; div++){
      for(int h = 0; h < 10; h++){
        for(int w = 0; w < 10; w++){
          if((h*10+w+1)%div ==0){
            array[h][w] = !array[h][w];
          }
        }
      }
    }
  }

  public void display(){
    for(int h = 0; h < 10; h++){
      for(int w = 0; w < 10; w++){
        if(array[h][w]){
          System.out.print("O  ");
        }else{
          System.out.print("C  ");
        }
      }
      System.out.println("");
    }
  }


  private boolean[][] array;
}
