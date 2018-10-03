
import java.util.Scanner;
public class Conversion{
  public Conversion(){

  public void mainConversion(){
    ask for first unit(mm, cm, m, etc...)
      find conversion from unit to in
    ask for second unit
      find conversion from in to unit;
    ask for value
    output

    Scanner input = new Scanner(System.in);
    System.out.print("Convert from?")
    String ConvFr = input.nextLine();
    if()  //for finding the right converter to in
    if()
    if()
    if()
    if()
    if()

    System.out.print("Convert to?")
    String ConvTo = input.nextLine();
    if()  //for finding the right converter from in
    if()
    if()
    if()
    if()
    if()

    System.out.print("Value?")
    double val = input.nextDouble();
    }

  public void convInFt(int way){
    boolean dir = (way == 0); //true = a -> b; false = b -> a
    if(dir == true){
      this.Ft = (this.In / 12)
    }
    if(dir == false){
      this.In = (this.Ft * 12)
    }
  }

  public double convInMi(int way){
    boolean dir = (way == 0);
    if(dir == true){
      this.Mi = (this.In / 63360);
    }
    if(dir == false){
      this.In = (this.Mi * 63360);
    }
  }

  public double convInMm(int way){
    boolean dir = (way == 0);
    if(dir == true){
      this.Mm = (this.In * 25.4);
    }
    if(dir == false){
      this.In = (this.Mm / 25.4);
    }
  }

  public double convInCm(int way){
    boolean dir = (way == 0);
    if(dir == true){
      this.Cm = (this.In * 2.54);
    }
    if(dir == false){
      this.In = (this.Cm / 2.54);
    }
  }

  public double convInM(int way){
    boolean dir = (way == 0);
    if(dir == true){
      this.M = (this.In * 0.0254);
    }
    if(dir == false){
      this.In = (this.M / 0.0254);
    }
  }

  public double convInKm(int way){
    boolean dir = (way == 0);
    if(dir == true){
      this.Km = (this.In * 0.0000254);
    }
    if(dir == false){
      this.In = (this.Km / 0.0000254);
    }
  }


  private double In;
  private double Ft;
  private double Mm;
  private double Cm;
  private double M;
  private double Km;
  }
}
