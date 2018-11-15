import javax.swing.Jframe;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class lines extends JPanel{
  public void paint(Graphics g){
  int counter = 0;
    for(counter < 10){
      g.drawLine(counter*20,0,counter*20,600);
      counter++
    }
  }
  public static void main(String[] args){
    JFrame window = new JFrame();
    window.setSize(600,600);
    window.setTitle("HAAAAAAAAAAAAIIIIIIIIIIII");
    lines test = new Lines();
    window.add(test);
    window.setVisible(true);
  }
}
