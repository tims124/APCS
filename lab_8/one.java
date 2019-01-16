import java.util.*;
public class one{
  public static void main(String[] args){
    ArrayList<Double> test = new ArrayList<Double>();
    test.add(12.2);
    test.add(6.1);
    test.add(4.3);
    for(int i = 0; i < test.size();i++){
      System.out.println(test.get(i));
    }

    System.out.println("");
    test.add(0,3.0);
    for(int i = 0; i < test.size();i++){
      System.out.println(test.get(i));
    }

    System.out.println("");
    test.add(1,2.5);
    test.add(6.7);
    for(int i = 0; i < test.size();i++){
      System.out.println(test.get(i));
    }

    System.out.println("");
    test.set(2,5.9);
    for(int i = 0; i < test.size();i++){
      System.out.println(test.get(i));
    }

    System.out.println("");
    System.out.println(test.get(3));

    System.out.println("");
    System.out.println(test.size());
}}
