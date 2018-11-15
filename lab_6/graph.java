import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class graph extends JPanel{
  public void paint(Graphics g){
  int counter = 0;
  g.setColor(Color.BLACK);
    while(counter < 10){
      g.drawLine(counter*60,0,counter*60,630);
      g.drawLine(0,counter*60,630,counter*60);
      counter++;
    }
  }

  public static void main(String[] args){
    JFrame window = new JFrame();
    window.setSize(620,640);
    window.setTitle("HAAAAAAAAAAAAIIIIIIIIIIII");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    graph test = new graph();
    window.add(test);
    window.setVisible(true);
  }
}
