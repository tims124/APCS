import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class BlueLine extends JPanel{
  public void paint(Graphics g){
    g.setColor(Color.BLUE);
    g.drawLine(300,0,300,600);
  }

  public static void main(String[] args){
    JFrame window = new JFrame();
    window.setSize(600,600);
    window.setTitle("Oh hai");
    BlueLine drawing = new BlueLine();
    window.add(drawing);
    window.setVisible(true);
  }
}
