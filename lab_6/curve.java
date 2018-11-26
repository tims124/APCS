import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class curve extends JPanel {

  public void paint(Graphics g) {
    int x1 = 0;
    int x2 = 1600;
    int y1 = 0;
    int y2 = 800;

    int change = (int)Math.floor(x2/35);
    int counter = 0;
    while(counter < 35){
      g.drawLine(x1+(change*counter),y2,x1+(change*counter)+35,y2-(change*counter*counter));
      //  g.drawArc();
      counter++;
    }

    g.drawArc(x1,y1,x2,y2,270,90);

    g.drawLine(x2,y1+(y2/2),x2,y2);
    g.drawLine(x1+(x2/2),y2,x2,y2);

  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    curve test = new curve();

    frame.add(test);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1920,1080);
    frame.setVisible(true);
  }
}
