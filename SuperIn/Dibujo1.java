package SuperIn;

//import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.awt.image.BufferedImage;


public class Dibujo1 extends JPanel {
  //public JFrame frame;
    BufferedImage image;
    Graphics2D g2d;

    public Dibujo1(){
      super();
      met();
    }

    private void met(){
      setBackground(Color.BLACK);
      image=new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
      g2d=image.createGraphics();
      g2d.setColor(Color.BLUE);
      g2d.setStroke(new BasicStroke(3) );

      MouseAdapter mouseHandler=new MouseAdapter(){
        private Point curPoint = new Point();
        public void mousePressed(MouseEvent e){
          curPoint.setLocation(e.getPoint() );
          //super.mousePressed(e);
        }
        public void mouseDragged(MouseEvent e){
          g2d.drawLine(curPoint.x, curPoint.y, e.getX(), e.getY() );
          curPoint.setLocation(e.getPoint() );
          repaint();
          //super.mouseDragged(e);
        }
      };
      addMouseListener(mouseHandler);
      addMouseMotionListener(mouseHandler);
    }

    protected void paintComponent(Graphics g){
      //super.paintComponent(g);
      g.drawImage(image, 0, 0, null);
    }


}//class
