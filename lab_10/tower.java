public class tower{
  public tower(){
  }



 
  public String move(String a, String b, String c, String[] d){
    d[0] = a;
    d[1] = b;
    d[2] = c;



    System.out.println("|-"+d[0]+"---");
    System.out.println("|-"+d[1]+"---");
    System.out.println("|-"+d[2]+"---");
    System.out.println("");

    if(d[0].length() == d[1].length() && d[0].length() == 0){
      return "done";
    }else{
      if(d[0].length() > 0){
        d[1] = d[1] + d[0].substring(d[0].length()-1,d[0].length());
        d[0] = d[0].substring(0,d[0].length()-1);
        //l0--;
        //l1++;
        //System.out.println("|-"+d[0]+"---");
        //System.out.println("|-"+d[1]+"---");
        //System.out.println("|-"+d[2]+"---");
        //System.out.println("");
        return this.move(d[0],d[1],d[2],d);
    }else{
        if(d[1].length() > 0){
          d[2] = d[2] + d[1].substring(d[1].length()-1,d[1].length());
          d[1] = d[1].substring(0,d[1].length()-1);
          System.out.println("|-"+d[0]+"---");
          System.out.println("|-"+d[1]+"---");
          System.out.println("|-"+d[2]+"---");
          System.out.println("");
          return move(d[0],d[1],d[2],d);
        }
      }

    return "how did you get here?";
  }
}
private String list = "abcdefghijklmnopqrstuvwxyz";
}
