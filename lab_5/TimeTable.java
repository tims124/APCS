public class TimeTable{
  public TimeTable(){
  }

  public void table(){
    int row = 1;
    int rowmax = 12;
    int column = 1;
    int columnmax = 12;
    System.out.println("*  |   1    2    3    4    5    6    7    8    9    10   11   12");
    System.out.print("-------------------------------------------------------------------");
    while(row <= rowmax){
      System.out.println("");
      while(column <= columnmax){
        if(column == 1 && row < 10){
          System.out.print(row+"   |  ");
        }
        if(column == 1 && row > 9){
          System.out.print(row+"  |  ");
        }
        System.out.print(row*column);
        if(row*column < 10){
          System.out.print("    ");
        }
        if(row*column < 100 && row*column > 9){
          System.out.print("   ");
        }
        if(row*column > 99){
          System.out.print("  ");
        }
        column++;
      }
      column=1;
      row++;
    }

  }

}
