
import java.util.Scanner;
public class RockPaperScissors{
  public RockPaperScissors(){

    public void RPC(){
      Scanner input = new Scanner(System.in);

      System.out.print("Do you want to play Rock paper scissors?(Y/N)")
      String YN = input.nextLine();
      boolean check = false;
      check = YN.equals("Y");

      if(check){
      System.out.println("Rock(R), Paper(P), or Scissors(S)?")
      String RPS = input.nextLine();
      int human = 3;
      if(RPS.equals("R")){
         human = 0;
      }
      if(RPS.equals("P")){
         human = 1;
      }
      if(RPS.equals("S")){
        human =2
      }


      int comp = Math.random(0,3); //0 = r; 1 = p; 2 = s

        System.out.println(Computer)
        String computer = "";
      if(comp == 0){
        computer = "R";
      }
      if(comp == 1){
        computer = "P";
      }
      if(comp == 2){
        computer = "S";
      }

      System.out.println("Player: "+RPS);
      Thread.sleep(500);
      System.out.println("Computer: "+computer);
      if (comp == human){
        System.out.println("TIE!");
      }
      if (comp == human + 1 || comp == human - 2){
        System.out.println("COMPUTER WINS!");
      }
      if (comp == human - 1 || comp == human + 2){
        System.out.println("PLAYER WINS!");
      }

      }
  }
}
