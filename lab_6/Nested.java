import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Nested extends JPanel{
  public void paint(Graphics g){
    int counter = 1;
    int rectx = 475;
    int recty = 475;
    int recth = 100;
    int rectw = 100;
    int dis = 10;
    int dim = dis * 2;

    while(counter < 26){
    rectx = rectx - dis;
    recty = rectx;
    recth = recth + dim;
    rectw = recth;
    g.drawRect(rectx,recty,rectw,recth);
    counter++;
    }
  }

  public static void main(String[] args){
    JFrame window = new JFrame();
    window.setSize(1000,1000);
    window.setTitle("OHHHH");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Nested test = new Nested();
    window.add(test);
    window.setVisible(true);
  }

}
