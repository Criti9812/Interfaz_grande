package SuperIn;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Image;
import java.awt.image.BufferedImage;


public class Prueba1 extends JFrame implements ChangeListener{
  private SpinnerNumberModel modeloS= new SpinnerNumberModel();
  private JSpinner sp;
  private JPanel panel;
  private JLabel text;
  private Color s3=new Color(230,177,211);
  private Color azul1=new Color(116,203,244);
  private Color rosa1=new Color(244,116,134);
  private Color gris1=new Color(113,129,124);
  private Color azul=new Color(79,157,211);
  private Color a=new Color(79,211,168);
  private int x=130;
  private int y=130;
  private int ancho=80;
  private int alto=80;
  private int x1=100;
  private int y1=-50;
  private int ancho1=20;
  private int alto1=20;
  private int giro=0;

    public Prueba1(){

      setTitle("Figura Rotando");
      setSize(400,300);
      setResizable(false);
      setDefaultCloseOperation(2);
      setLocationRelativeTo(null);
      comp();

      setVisible(true);
    }

    public void comp(){
      panel();
      label();
      spin();
    }

    public void panel(){
      panel=new JPanel();
      panel.setBackground(s3);
      panel.setLayout(null);
      this.getContentPane().add(panel);
    }

    public void label(){
      text=new JLabel("Grados");
      text.setBounds(280,130,50,30);
      panel.add(text);
    }

    public void spin(){
      sp=new JSpinner();
      sp.setBounds(280,170,60,50);
      modeloS.setMaximum(360);
      modeloS.setMinimum(0);
      sp.setModel(modeloS);
      sp.addChangeListener(this);
      panel.add(sp);
    }
    public void stateChanged(ChangeEvent ev){
      giro=(int)sp.getValue();
      repaint();
    }


    public void paint(Graphics g){
      super.paint(g);

      BufferedImage bi=new BufferedImage(40,40, BufferedImage.TYPE_INT_RGB);
      Graphics2D g2dbi=bi.createGraphics();

      g2dbi.setColor(azul);
      g2dbi.fillRect(0,0,40,40);

      g2dbi.setColor(a);
      g2dbi.fillRect(10,10,10,10);
      g2dbi.fillRect(20,20,10,10);

      g2dbi.setColor(rosa1);
      g2dbi.fillRect(20,10,10,10);
      g2dbi.fillRect(10,20,10,10);

      TexturePaint textImg=new TexturePaint(bi, new Rectangle(40,40) );
      Graphics2D g2d=(Graphics2D)g;
      g2d.setPaint(textImg);
      g2d.translate(x,y);
      g2d.rotate(Math.toRadians(giro));
      g2d.fillRect(0,0,ancho,alto);



      g2d.translate(x1,y1);
      g2d.rotate(Math.toRadians(giro));
      g2d.setColor(gris1);
      g2d.fillRect(0,0,ancho1,alto1);

      }


  }
