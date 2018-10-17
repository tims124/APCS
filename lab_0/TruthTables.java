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


     a = ((pt == false) || qt) || (pt && qt);
     b = ((pt == false) || qf) || (pt && qf);
     c = ((pf == false) || qt) || (pf && qt);
     d = ((pf == false) || qf) || (pf && qf);

     System.out.println("T-T: "+a);
     System.out.println("T-F: "+b);
     System.out.println("F-T: "+c);
     System.out.println("F-F: "+d);


     a = ((pt || qt) && (pt && qt)) || ((pt == false && qt == false)
     b = ((pt || qf) && (pt && qf)) || ((pt == false && qf == false)
     c = ((pf || qt) && (pf && qt)) || ((pf == false && qt == false)
     d = ((pf || qf) && (pf && qf)) || ((pf == false && qf == false)

     System.out.println("T-T: "+a);
     System.out.println("T-F: "+b);
     System.out.println("F-T: "+c);
     System.out.println("F-F: "+d);


     a = ((pt || qt) && (pt && qt)) || ((pt || (qt == false)) && (pt && qt));
     b = ((pt || qf) && (pt && qf)) || ((pt || (qf == false)) && (pt && qf));
     c = ((pf || qt) && (pf && qt)) || ((pf || (qt == false)) && (pf && qt));
     d = ((pf || qf) && (pf && qf)) || ((pf || (qf == false)) && (pf && qf));

     System.out.println("T-T: "+a);
     System.out.println("T-F: "+b);
     System.out.println("F-T: "+c);
     System.out.println("F-F: "+d);
   }
}
