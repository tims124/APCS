import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class RCircle extends JPanel{

  public void paint(Graphics g){

  int counter = 0;
  g.setColor(Color.BLACK);
  int centerx;
  int centery;
  int centerr;
  int color;
    for(int circle = 0; circle < 10; circle++){
      centerx =(int)Math.floor(Math.random() * 600);
      centery =(int)Math.floor(Math.random() * 600);
      centerr =(int)Math.floor((Math.random() * 50)+50);

      color = (int)Math.floor(Math.random() * 8);
      if(color == 0){
        g.setColor(Color.BLACK);
      }
      if(color == 1){
        g.setColor(Color.BLUE);
      }
      if(color == 2){
        g.setColor(Color.RED);
      }
      if(color == 3){
        g.setColor(Color.YELLOW);
      }
      if(color == 4){
        g.setColor(Color.GREEN);
      }
      if(color == 5){
        g.setColor(Color.PINK);
      }
      if(color == 6){
        g.setColor(Color.darkGray);
      }
      if(color == 7){
        g.setColor(Color.MAGENTA);
      }


      g.fillOval(centerx,centery,centerr,centerr);
    }
  }

  public static void main(String[] args){

    JFrame window = new JFrame();
    window.setSize(650,650);
    window.setTitle("HAAAAAAAAAAAAIIIIIIIIIIII");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RCircle test = new RCircle();
    window.add(test);
    window.setVisible(true);
  }
}
