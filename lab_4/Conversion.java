
import java.util.Scanner;
public class Conversion{
  public Conversion(){
}
  public void mainConversion(){

    Scanner input = new Scanner(System.in);

    System.out.print("Convert from(in,ft,mi,mm,cm,m,km,): ");
    String ConvFr = input.nextLine();
    ConvFr = ConvFr.toLowerCase();

    String fr = "";
    if(ConvFr.equals("in")){//for finding the right converter to in
      fr = "in";
    }
    if(ConvFr.equals("ft")){
      fr = "ft";
    }
    if(ConvFr.equals("mi")){
      fr = "mi";
    }
    if(ConvFr.equals("mm")){
      fr = "mm";
    }
    if(ConvFr.equals("cm")){
      fr = "cm";
    }
    if(ConvFr.equals("m")){
      fr = "m";
    }
    if(ConvFr.equals("km")){
      fr = "km";
    }


    System.out.print("Convert to(in,ft,mi,mm,cm,m,km,): ");
    String ConvTo = input.nextLine();
    ConvTo = ConvTo.toLowerCase();
    String To = "";
    if(ConvTo.equals("in")){  //for finding the right converter from in
      To = "in";
    }
    if(ConvTo.equals("ft")){
      To = "ft";
    }
    if(ConvTo.equals("mi")){
      To = "mi";
    }
    if(ConvTo.equals("mm")){
      To = "mm";
    }
    if(ConvTo.equals("cm")){
      To = "cm";
    }
    if(ConvTo.equals("m")){
      To = "m";
    }
    if(ConvTo.equals("km")){
      To = "km";
    }

    System.out.print("Value?");
    val = input.nextDouble();

      if(fr.equals(To)){

      }

      if(fr.equals("in")){
        this.In = this.val;
      }
      if(ConvFr.equals("ft")){
        this.In = (this.val * 12);
      }
      if(fr.equals("mi")){
        this.In = (this.val * 63360);
      }
      if(fr.equals("mm")){
        this.In = (this.val / 25.4);
      }
      if(fr.equals("cm")){
        this.In = (this.val / 2.54);
      }
      if(fr.equals("m")){
        this.In = (this.val / 0.0254);
      }
      if(fr.equals("km")){
        this.In = (this.val / 0.0000254);
      }


      if(To.equals("in")){
        System.out.println(this.In);
      }
      if(To.equals("ft")){
        System.out.println(this.In / 12);
      }
      if(To.equals("mi")){
        System.out.println(this.In / 63360);
      }
      if(To.equals("mm")){
        System.out.println(this.In * 25.4);
      }
      if(To.equals("cm")){
        System.out.println(this.In * 2.54);
      }
      if(To.equals("m")){
        System.out.println(this.In * 0.0254);
      }
      if(To.equals("km")){
        System.out.println(this.In * 0.0000254);
      }




    }
  private double val;
  private double In;
  private double Ft;
  private double Mm;
  private double Cm;
  private double M;
  private double Km;

}
