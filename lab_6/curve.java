import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class curve extends JPanel {

  public void paint(Graphics g) {
    g.drawArc(0, 200, 200, 200, 270,90);

  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    curve test = new curve();

    frame.add(test);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600,600);
    frame.setVisible(true);
  }
}
