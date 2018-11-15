import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Example1 extends JPanel{
  public void paint(Graphics g){
    int w=1920;
    int h=1080;
    setSize(w,h);
    g.setColor(Color.WHITE);
    g.fillRect(0,0,w,h);
    g.setColor(Color.RED);
    g.drawString("Here are a selection of blank shapes.",20,40);
    g.drawLine(20,40,200,40);
    g.setColor(Color.blue);
    g.drawLine(20,50,70,90);
    g.setColor(Color.red);
    g.drawRect(100,50,32,55);
    g.setColor(Color.green);
    g.drawOval(150,46,60,60);
    g.setColor(Color.magenta);
    g.drawArc(230,50,65,50,30,270);
    g.setColor(Color.black);
    g.drawString("Here are the filled equivalents.",20,140);
    g.drawLine(20,140,200,140);
    g.setColor(Color.yellow);
    g.fillRect(100,150,32,55);
    g.setColor(Color.pink);
    g.fillOval(150,146,60,60);
    g.setColor(Color.darkGray);
    g.fillArc(230,150,65,50,30,270);
  }
  public static void main (String[] args){
    JFrame window = new JFrame();
    window.setSize(600,600);
    window.setTitle("Jframe Window");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Example1 Ex1Panel = new Example1();
    window.add(Ex1Panel);
    window.setVisible(true);
}
}
