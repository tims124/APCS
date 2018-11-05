import java.util.*;
public class Stats{
  public Stats(){
    count = 0;
    C=0;
  }

  public double addData(double a){  //adds data to a list and counts how many numbers are in that list
    this.total = this.total + a;    //also adds all of the data up
    this.sum = this.sum + Math.pow(a,2);
    values.add(count,a);            //starts at zero
    this.count = this.count + 1;
    return a;
  }

  public int getCount(){    //returns how many numbers are in the list
    return count;
  }

  public double getAverage(){ //gets average by dividing total by number of entries
    double average = total / count;
    this.avg = average;
    return average;
  }

  public double getStandardDeviation(){ //gets standard deviation
    int counter = 0;
    a = this.getAverage();    //could cut this maybe

    while(counter < count){            //does summation of (x-avg)^2 of the standard deviaiton
      double A = values.get(counter) - a; //by pulling all of the numbers out of the list
      double B = Math.pow(A,2);
      this.C = B + this.C;
      counter = counter + 1;
    }

    this.SD = Math.sqrt(this.C/(count - 1));  //divides it by the number of entries in the list
    return SD;
  }


  private double C;
  private double total;
  private double sum;
  private double SD;
  private double avg;
  private int count;
  List<Double> values = new ArrayList<Double>();
}
