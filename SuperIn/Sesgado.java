package SuperIn;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sesgado extends JFrame implements ChangeListener{
  //
    private JLabel tex1, tex2;
    private Color amarillo=new Color(242,245,116);
    private Color azulClaro=new Color(151,240,215);
    private JPanel panel;
    private SpinnerNumberModel modeloS, modeloS2;
    private JSpinner sp, sp2;
    private Color violeta=new Color(129,134,240);
    private int x=100;
    private int y=100;
    private int ancho=100;
    private int alto=100;
    private double sesX=0.0;
    private double sesY=0.0;
  public Sesgado(){
    //
    setTitle("Random ._.");
    setSize(500,400);
    setResizable(false);
    setDefaultCloseOperation(2);
    setLocationRelativeTo(null);
    comp();
    setVisible(true);
  }

  public void comp(){
    panel();
    spin();
    text();
    //buton();
  }

  public void text(){
    tex1=new JLabel("Sesgar en X");
    tex1.setBounds(290,140,100,30);
    tex2=new JLabel("Sesgar en Y");
    tex2.setBounds(290,240,100,30);
    panel.add(tex1);
    panel.add(tex2);
  }

  public void panel(){
    panel=new JPanel();
    panel.setBackground(violeta);
    panel.setLayout(null);
    this.getContentPane().add(panel);
  }

  public void spin(){
    modeloS=new SpinnerNumberModel();
    modeloS2=new SpinnerNumberModel();
    sp=new JSpinner();
    sp.setBounds(300,170,60,50);
    modeloS.setMaximum(200);
    modeloS.setMinimum(-200);
    sp.setModel(modeloS);
    sp.addChangeListener(this);
    sp2=new JSpinner();
    sp2.setBounds(300,270,60,50);
    modeloS2.setMaximum(200);
    modeloS2.setMinimum(-200);
    sp2.setModel(modeloS2);
    sp2.addChangeListener(this);
    panel.add(sp);
    panel.add(sp2);
  }

  public void stateChanged(ChangeEvent ev){
    //
    if(ev.getSource()==sp){
      int valor=(int)sp.getValue();
      sesX=(double)valor/100;
      repaint();
    }
    if(ev.getSource()==sp2){
      int valor2=(int)sp2.getValue();
      sesY=(double)valor2/100;
      repaint();
    }
  }

  public void paint(Graphics g){
    super.paint(g);

    Graphics2D g2d = (Graphics2D) g;
    GradientPaint deg1=new GradientPaint(0,0,azulClaro,0,50,amarillo,true);
    g2d.setPaint(deg1);
    g2d.translate(x,y);
    g2d.shear(sesX, sesY);
    g2d.fillRect(0,0,ancho,alto);

  }


}
