
public class Stats{
  public Stats(){
      array = new double[count];
  }

  public void addData(double a){
    this.total = this.total + a;
    this.sum = this.sum + Math.pow(a,2);
    this.count = this.count + 1;
    double array[];
    array = new double[count];
    array[count] = a;
  }

  public int getCount(){
    return count;
  }

  public double getAverage(){
    double average = total / count;
    return average;
  }

  public double getStandardDeviation(){



    double buffer = (sum - this.getAverage()) / (count-1);
    SD = Math.sqrt(buffer);
    return SD;
  }

  private double total;
  private double sum;
  private double SD;
  private int count;

}
