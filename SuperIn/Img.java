package SuperIn;
import javax.swing.*;
import java.awt.*;

public class Img extends JFrame{
  private JPanel panel;

  public Img(){
    setTitle("Imagen");
    setSize(500,320);
    setResizable(false);
    setDefaultCloseOperation(2);
    setLocationRelativeTo(null);
    panel();
    setVisible(true);
  }


  public void panel(){
    panel=new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setLayout(null);
    this.getContentPane().add(panel);
  }
  public void paint(Graphics g){
    super.paint(g);
    ImageIcon img=new ImageIcon(getClass().getResource("pastel.png"));
    g.drawImage(img.getImage(),-40,0,200,200,this );
    ImageIcon img2=new ImageIcon(getClass().getResource("p1.png"));
    g.drawImage(img2.getImage(),110,10,300,300,this );
  }

}
