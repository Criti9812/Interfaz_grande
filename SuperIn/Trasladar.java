package SuperIn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Trasladar extends JFrame implements ActionListener{
  //
  private JLabel d1, d2;
  private JPanel panel;
  private JTextField x, y;
  private JButton bt;
  private Color azuul=new Color(155,242,243);
  private Color mor=new Color(119,113,129);

  private int x1=50;
  private int y1=50;
  private int med1=70;
  private int med2=70;
  public Trasladar(){
    //
    setTitle("Figura en movimiento");
    setSize(600,600);
    setResizable(false);
    setDefaultCloseOperation(2);
    setLocationRelativeTo(null);
    comp();
    setVisible(true);
  }

  public void comp(){
    panel();
    text();
    label();
    buton();
  }

  public void panel(){
    panel=new JPanel();
    panel.setBackground(azuul);
    panel.setLayout(null);
    this.getContentPane().add(panel);
  }

  public void label(){
    d1=new JLabel("Coordenada en X");
    d1.setBounds(90,460,100,30);
    d2=new JLabel("Coordenada en Y");
    d2.setBounds(240,460,100,30);
    panel.add(d1);
    panel.add(d2);

  }

  public void text(){
    x=new JTextField();
    x.setBounds(100,500,60,30);
    y=new JTextField();
    y.setBounds(250,500,60,30);
    panel.add(x);
    panel.add(y);
  }

  public void buton(){
    bt=new JButton("Trasladar");
    bt.setBounds(400,500,100,30);
    bt.addActionListener(this);
    panel.add(bt);
  }

  public void actionPerformed(ActionEvent ev){
    //
    x1= Integer.parseInt(x.getText() );
    y1=Integer.parseInt(y.getText() );
    repaint();
  }

  public void paint(Graphics g){
    super.paint(g);

    Graphics2D g2d=(Graphics2D)g;

    g2d.setColor(mor);
    g2d.translate(x1,y1);
    g2d.fillOval(0, 0, med1, med2);


    }

}
