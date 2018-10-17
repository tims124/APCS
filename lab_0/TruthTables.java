public class TruthTables {
   public static void main(String[] args) {
     boolean pt = true;
     boolean pf = false;
     boolean qt = true;
     boolean qf = false;

     boolean a = ((pt && qt) || (pt == false));
     boolean b = ((pt && qf) || (pt == false));
     boolean c = ((pf && qt) || (pf == false));
     boolean d = ((pf && qf) || (pf == false));

     System.out.println("T-T: "+a);
     System.out.println("T-F: "+b);
     System.out.println("F-T: "+c);
     System.out.println("F-F: "+d);

     boolean a = ((pt && qt) || (pt == false));
     boolean b = ((pt && qf) || (pt == false));
     boolean c = ((pf && qt) || (pf == false));
     boolean d = ((pf && qf) || (pf == false));

     System.out.println("T-T: "+a);
     System.out.println("T-F: "+b);
     System.out.println("F-T: "+c);
     System.out.println("F-F: "+d);
   }
}
