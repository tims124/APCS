
import java.util.Scanner;
public class StringLength{
  public StringLength(){
  }
    public void SL(){
      Scanner input = new Scanner(System.in);
      System.out.println("Type four strings");

      System.out.print("String one: ");
      String StringOne = input.nextLine();

      System.out.print("String two: ");
      String StringTwo = input.nextLine();

      System.out.print("String three: ");
      String StringThree = input.nextLine();

      System.out.print("String four: ");
      String StringFour = input.nextLine();


      String one = StringOne.substring(0,1);
      String two = StringTwo.substring(0,1);
      String three = StringThree.substring(0,1);
      String four = StringFour.substring(0,1);

      int june =-1 * one.compareTo("a");
      int july =-1 * two.compareTo("a");
      int aug =-1 * three.compareTo("a");
      int sep =-1 * four.compareTo("a");

        if (june>july) {
          if(aug>sep){
            if(june>aug){
              this.max = one;
            }else{
              this.max = three;
            }
          }else{
            if(june>sep){
              this.max = one;
            }else{
              this.max = four;
            }
          }

        }else{
          if(aug>sep){
            if(july>aug){
              this.max = two;
            }else{
              this.max = three;
            }
          }else{
            if(july>sep){
              this.max = two;
            }else{
              this.max = four;
            }
          }
        }

        if (june<july) {
          if(aug<sep){
            if(june<aug){
              this.min = one;
            }else{
              this.min = three;
            }
          }else{
            if(june<sep){
              this.min = one;
            }else{
              this.min = four;
            }
          }

        }else{
          if(aug<sep){
            if(july<aug){
              this.min = two;
            }else{
              this.min = three;
            }
          }else{
            if(july<sep){
              this.min = two;
            }else{
              this.min = four;
            }
          }
        }







      System.out.println("The lexicographic minimum is: "+max);
      System.out.println("The lexicographic maximum is: "+min);
    }
    private String max;
    private String min;
}
