public class CLW  {
  public CLW(){
  }

  public void CLW(){
    int counter = 1;
    int num = 0;

    while(/*true*/counter < 101){
      num = 0;
      if(counter % 3 == 0){
        System.out.print("Coza");
        num++;
      }
      if(counter % 5 == 0){
        System.out.print("Loza");
        num++;
      }
      if(counter % 7 == 0){
        System.out.print("Woza");
        num++;
      }
      if(num == 0){
        System.out.print(counter);
      }
      System.out.print(" ");
      counter++;
  }
}
}
