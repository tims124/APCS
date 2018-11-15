import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class RedCircle extends JPanel{
  public void paint(Graphics g){
    g.setColor(Color.RED);
    g.fillOval(100,100,50,50);
  }

  public static void main (String[] args){
    JFrame window = new JFrame();
    window.setSize(300,300);
    window.setTitle("Jframe Window");

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedCircle Ex1Panel = new RedCircle();
    window.add(Ex1Panel);
    window.setVisible(true);
}
  }
