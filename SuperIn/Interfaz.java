package SuperIn;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import java.io.*;
import java.util.*;
import java.awt.font.TextAttribute;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class Interfaz extends JFrame implements ActionListener, ChangeListener, MouseListener{
  private int x, y;
  private JTable tabla;
  private JScrollPane scroll;
  private JTextField txtJ1, txtJ2;
  private JPanel panelJ2;
  private boolean puntero=false;

  private int aux=0;
  private JButton cbx1, cbx2, cbx3, cbx4, cbx5,cbx6, extra;
  private JPanel panelJ, panelExtra;
  private Color verdeClaro=new Color(178,250,180);
  private Color azulClaro=new Color(151,240,215);
  private Color violeta=new Color(129,134,240);
  private Color rosaClaro=new Color(242,159,228);
  private Color naranjaClaro=new Color(243,191,155);
  private Color s2=new Color(195,172,200);
  private Color s3=new Color(230,177,211);
  private Color s4=new Color(200,190,190);
  private Color bt;
  private Prueba1 vent1;
  private Trasladar vent3;
  private Sesgado vent4;
  private Img vent5;

  private JLabel lb1,lb2,lb3,lb4,lb5,im1,im2,fondo,im12,im22,fondo2,im13,im23,fondo3,fil,col;
  private JTextField txt1,txt2,txt3,txt4,txt5;
  private JTextArea ta1;
  private JButton btn,btn2,btn3, btn4;
  private JRadioButton rb1,rb2,rb3;
  private ButtonGroup bg;
  private JTabbedPane jt;
  private JPanel panel1,panel2,panel3,panel4;
  private JSpinner sp;
  private JCheckBox ck1,ck2,ck3;
  private JMenuBar bar;
  private JMenu inicio,dos,tres,cuatro;
  private JMenuItem opcion1,opcion2,opcion3,opcion4,opcion5,opcion6;
  private Clip clip;
  private JScrollPane scrol;
  private String texto1,texto2,texto3,textoT;
  private Font tipo1;
  private Map atributes;
  private SpinnerNumberModel model1= new SpinnerNumberModel();
  private SpinnerNumberModel model2= new SpinnerNumberModel();
  private JSpinner spin1,spin2;
  Color color1=new Color(204,209,209);

  public Interfaz(){
    setSize(800,600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(3);
    setTitle("JESSSSSSS");
    Components();
    setVisible(true);

  }

  public void Components(){
    menu();
    panel1();
    panel2();
    panel3();
    panel4();
    tabbed();
    tabbed1();
    tabbed2();
    tabbed3();
    textos();
    etiquetas();
    area();
    group();
    check();
    boton();
    boton2();
    text();
    bot();
    tab();
    fondo();
  }

  public void menu(){
    bar=new JMenuBar();
    inicio=new JMenu("INICIO");
    dos=new JMenu("VISTA");
    tres=new JMenu("TRES");
    cuatro=new JMenu("EXTRA");
    opcion1=new JMenuItem("FONDO 1");
    opcion1.addActionListener(this);
    opcion2=new JMenuItem("FONDO 2");
    opcion2.addActionListener(this);
    opcion3=new JMenuItem("INICIO");
    opcion3.addActionListener(this);
    opcion4=new JMenuItem("SORPRESA");
    opcion4.addActionListener(this);
    opcion5=new JMenuItem("TABLA");
    opcion5.addActionListener(this);
    opcion6=new JMenuItem("PAINT");
    opcion6.addActionListener(this);
    inicio.add(opcion3);
    inicio.add(opcion5);
    inicio.add(opcion6);
    dos.add(opcion1);
    dos.add(opcion2);
    cuatro.add(opcion4);
    bar.add(inicio);
    bar.add(dos);
    bar.add(cuatro);
    setJMenuBar(bar);
  }

  public void panel1(){
    panel1=new JPanel();
    panel1.setBackground(Color.GRAY);
    panel1.setLayout(null);
    this.getContentPane().add(panel1);
  }

  public void tabbed(){
    jt=new JTabbedPane(JTabbedPane.TOP);
    jt.setBounds(5,5,770,520);
    panel1.add(jt);
  }


  public void tabbed1(){
     //agregar el panel a la pestaña
     jt.addTab("INICIO", null, panel2, "PASTELERIA");
     jt.setBackgroundAt(0, new Color(255,105,180));

  }

  public void tabbed2(){
     //agregar el panel a la pestaña
     jt.addTab("TABLA", null, panel3, "TABLA DE BOTONES");
     jt.setBackgroundAt(1, new Color(255,105,180));
  }

  public void tabbed3(){
    panelJ=new JPanel();
    panelJ.setBackground(verdeClaro);
    panelJ.setLayout(null);
    panelExtra=new JPanel();
    panelExtra.setBounds(100,10,500,300);
    panelExtra.setBackground(Color.WHITE);
    panelExtra.setLayout(null);
    panelJ.add(panelExtra);

     //agregar el panel a la pestaña
     jt.addTab("PAINT", null, panelJ, "DIBUJO");
     jt.setBackgroundAt(2, new Color(255,105,180));
  }

  public void panel2(){
    panel2=new JPanel();
    panel2.setLayout(null);
  }

  public void fondo(){
    //fondo
    fondo=new JLabel();
    fondo.setBounds(1,1,769,569);
    fondo.setIcon(new ImageIcon("SuperIn//fondo2.png"));
    im1=new JLabel();
    im1.setBounds(570,370,100,100);
    im1.setIcon(new ImageIcon("SuperIn//img1.png"));
    im2=new JLabel();
    im2.setBounds(10,30,226,500);
    im2.setIcon(new ImageIcon("SuperIn//img3.png"));
    fondo2=new JLabel();
    fondo2.setBounds(1,1,769,569);
    fondo2.setIcon(new ImageIcon("SuperIn//fondo2.png"));
    im12=new JLabel();
    im12.setBounds(570,370,100,100);
    im12.setIcon(new ImageIcon("SuperIn//img1.png"));
    im22=new JLabel();
    im22.setBounds(10,30,226,500);
    im22.setIcon(new ImageIcon("SuperIn//img3.png"));
    fondo3=new JLabel();
    fondo3.setBounds(1,1,769,569);
    fondo3.setIcon(new ImageIcon("SuperIn//fondo2.png"));
    im13=new JLabel();
    im13.setBounds(570,370,100,100);
    im13.setIcon(new ImageIcon("SuperIn//img1.png"));
    im23=new JLabel();
    im23.setBounds(10,30,226,500);
    im23.setIcon(new ImageIcon("SuperIn//img3.png"));
    panel2.add(im1);
    panel2.add(im2);
    panel2.add(fondo);
    panel3.add(im12);
    panel3.add(im22);
    panel3.add(fondo2);
    panel4.add(im13);
    panel4.add(im23);
    panel4.add(fondo3);
  }
  public void panel3(){
    panel3=new JPanel();
    panel3.setLayout(null);

  }

  public void panel4(){
    panel4=new JPanel();
    panel4.setLayout(null);

  }


  public void text(){
    fil=new JLabel();
    fil.setText("FILAS");
    fil.setBounds(350,350,50,30);
    col=new JLabel();
    col.setText("COLUMNAS");
    col.setBounds(440,350,100,30);
    spin1=new JSpinner();
    spin1.setBounds(350,380,50,30);
    model1.setMaximum(50);
    model1.setMinimum(0);
    spin1.setModel(model1);
    spin1.addChangeListener(this);
    panel3.add(spin1);
    spin2=new JSpinner();
    spin2.setBounds(450,380,50,30);
    model2.setMaximum(50);
    model2.setMinimum(0);
    spin2.setModel(model2);
    spin2.addChangeListener(this);
    panel3.add(spin2);
    panel3.add(fil);
    panel3.add(col);

    // txtJ1=new JTextField("filas");
    // txtJ1.setBounds(500,400,50,30);
    // txtJ2=new JTextField("column");
    // txtJ2.setBounds(570,400,50,30);
    // panel3.add(txtJ1);
    // panel3.add(txtJ2);
  }

  public void bot(){
    btn4=new JButton("CREAR");
    btn4.setBounds(600,400,100,30);
    btn4.addActionListener(this);
    panel3.add(btn4);
  }

  public void textos(){
    txt1=new JTextField();
    txt1.setBounds(100,100,200,40);
    txt1.setBackground(color1);
    //txt1.setText("COLOR DEL PASTEL");
    txt2=new JTextField();
    txt2.setBounds(100,200,200,40);
    txt2.setBackground(color1);
    //txt2.setText("SABOR");
    txt3=new JTextField();
    txt3.setBounds(100,300,200,40);
    txt3.setBackground(color1);
    //txt3.setText("TAMAÑO");
    panel2.add(txt1);
    panel2.add(txt2);
    panel2.add(txt3);

  }

  public void etiquetas(){
      lb1=new JLabel();
      lb1.setBounds(100,60,200,40);
      lb1.setText("COLOR DEL PASTEL");
      lb2=new JLabel();
      lb2.setBounds(100,160,200,40);
      lb2.setText("SABOR DEL PASTEL");
      lb3=new JLabel();
      lb3.setBounds(100,260,200,40);
      lb3.setText("TAMAÑO DEL PASTEL");
      lb4=new JLabel();
      lb4.setBounds(130,370,200,40);
      lb4.setText("FUENTE");
      lb5=new JLabel();
      lb5.setBounds(200,370,200,40);
      lb5.setText("TIPO");
      panel2.add(lb1);
      panel2.add(lb2);
      panel2.add(lb3);
      panel2.add(lb4);
      panel2.add(lb5);
  }

  public void area(){
    ta1=new JTextArea();
    ta1.setBackground(color1);
    textoT="***********CARACTERISTICAS DSIPONIBLES***********\nCOLORES DISPONIBLES: \n-Negro \n-Blanco \n-Rosa \n-Rojo \n-Azul \n-Amarillo \n-Naranja \n-Gris \n-Verde \n-Vino \n-Cafe";
    textoT+="\n\nSABORES DISPONIBLES: \n-Chocolate \n-Fresa \n-Tres leches \n-Nuez \n-Frambuesa \n-Ron \n-Oreo \n-Galleta \n-Queso \n-Kinder";
    textoT+="\n\nTAMAÑOS DISPONIBLES: \n-Solo un nivel 15cm a 40cm (diametro) 500gr-3kg \n-Dos niveles 1kg-5kg \n-Tes niveles 2.2kg-7kg \n-Cuatro o mas, consulte al 5518706598";
    ta1.setText(textoT);
    scrol=new JScrollPane(ta1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    scrol.setBounds(400,100,300,250);
    panel2.add(scrol);
  }

  public void group(){
    bg=new ButtonGroup();
    rb1=new JRadioButton("Arial",false);
    rb1.setBounds(200,400,100,20);
    rb1.setBackground(Color.GRAY);
    rb1.addActionListener(this);
    rb2=new JRadioButton("Algerian",false);
    rb2.setBounds(200,420,100,20);
    rb2.setBackground(Color.GRAY);
    rb2.addActionListener(this);
    rb3=new JRadioButton("Segoe Script",false);
    rb3.setBounds(200,440,100,20);
    rb3.setBackground(Color.GRAY);
    rb3.addActionListener(this);
    bg.add(rb1);
    bg.add(rb2);
    bg.add(rb3);
    panel2.add(rb1);
    panel2.add(rb2);
    panel2.add(rb3);
  }

  public void check(){
    ck1=new JCheckBox("N");
    ck1.setBounds(130,400,40,20);
    ck1.setBackground(Color.GRAY);
    ck1.addActionListener(this);
    ck2=new JCheckBox("S");
    ck2.setBounds(130,420,40,20);
    ck2.setBackground(Color.GRAY);
    ck2.addActionListener(this);
    ck3=new JCheckBox("I");
    ck3.setBounds(130,440,40,20);
    ck3.setBackground(Color.GRAY);
    ck3.addActionListener(this);
    panel2.add(ck1);
    panel2.add(ck2);
    panel2.add(ck3);
  }

  public void boton(){
    btn=new JButton();
    btn.setBounds(400,400,150,40);
    btn.setBackground(Color.GRAY);
    btn.setText("OK");
    btn.addActionListener(this);
    panel2.add(btn);
  }

  public void boton2(){
  cbx1=new JButton("Rotar");
  cbx1.setBackground(s4);
  cbx1.setBounds(620,70,90,30);
  cbx1.addActionListener(this);
  cbx2=new JButton("Sesgado");
  cbx2.setBackground(s2);
  cbx2.setBounds(620,110,90,30);
  cbx2.addActionListener(this);
  cbx3=new JButton("Trasladar");
  cbx3.setBackground(s4);
  cbx3.setBounds(620,150,90,30);
  cbx3.addActionListener(this);
  cbx4=new JButton("Dibujar");
  cbx4.setBackground(s2);
  cbx4.setBounds(620,190,90,30);
  cbx4.addActionListener(this);
  cbx5=new JButton("Ver pastel");
  cbx5.setBackground(s4);
  cbx5.setBounds(620,230,100,30);
  cbx5.addActionListener(this);
  extra=new JButton("Pasa el cursor aqui para que aparezcan las figuras :) ");
  extra.setBackground(s4);
  extra.addChangeListener(this);
  extra.setBounds(100,330,400,30);

  panelJ.add(cbx1);
  panelJ.add(cbx2);
  panelJ.add(cbx3);
  panelJ.add(cbx4);
  panelJ.add(cbx5);
  panelJ.add(extra);


}


public void paint(Graphics g){
  super.paint(g);
  //Para poder modificar más propiedades con Graphics 2d
  Graphics2D g2d = (Graphics2D) g;

  // //Círculo
  if(aux==10){

    g2d.setColor(azulClaro);
    g2d.drawOval(150, 100, 100, 100);
    g2d.fillOval(150, 100, 100, 100);


    //Rectángulo (relleno y borde)
    g2d.setColor(naranjaClaro);
    g2d.fillRect(330, 110, 200, 70);
    g2d.setColor(naranjaClaro);
    g2d.drawRect(330, 110, 200, 70);

    //Polígono (3 lados)
    //a 500, 200   b 700 200   c 500 400
    int [] puntos_x = {350, 550, 350};
    int [] puntos_y = {250, 250, 350};
    g2d.setColor(violeta);
    g2d.fillPolygon (puntos_x, puntos_y, 3);

    //Rombo (pol 4)
    //c(150,250) b(200,200) a(150,150)  d(100,200)
    int [] px = {180, 230, 180,130};
    int [] py = {350, 300, 250,300};
    g2d.setColor(rosaClaro);
    g2d.fillPolygon (px, py, 4);
  }

}

public void tab(){
  //String nombres="tablaa";
  String nombres[]={"tablaaa"};
  JButton data[][]=new JButton[1][1];

  DefaultTableModel mod=new DefaultTableModel(data, nombres);
  tabla=new JTable(mod);
  tabla=new JTable(mod){
    public boolean isCellEditable(int row, int column){
      return false;
    }
  };
  tabla.addMouseListener(this);
  scroll=new JScrollPane(tabla);
  scroll.setBounds(40,40,650,300);
  panel3.add(scroll);

}

public void  mouseExited(MouseEvent e){}
public void  mouseEntered(MouseEvent e){}
public void  mouseReleased(MouseEvent e){}
public void  mousePressed(MouseEvent e){}

public void mouseClicked( MouseEvent evt){
  puntero=true;
  start();
}

public void start(){
  int x, y;
  while(puntero==true){
    x=MouseInfo.getPointerInfo().getLocation().x;
    y=MouseInfo.getPointerInfo().getLocation().y;


    JOptionPane.showMessageDialog(null,"Poscion en pantalla \n X: "+x+" Y: "+y);
    puntero=false;

  }
}

  public void stateChanged(ChangeEvent ev){
    if(ev.getSource()==extra){
      aux=10;
      repaint();
    }
  }



  public void actionPerformed(ActionEvent e){
    if(e.getSource()==btn4){
      x=(int)spin1.getValue();
      y=(int)spin2.getValue();
      //String nombres="tablaaa";
      String nombres[]=new String [y];
      for(int c=0; c<y; c++){
        nombres[c]="columna "+c;
      }
      int t=255;
      int t2=255;
      int b=0;
      JButton data[][]=new JButton[x][y];
      for(int i=0; i<y; i++){
        for(int a=0; a<x; a++){
          data[a][i]=new JButton("boton "+a+" , "+i);
          b++;
          if(b<16){
          t=t-(2*b);
          t2=t2-(2*b);
          bt=new Color(255,t,t2);
          data[a][i].setBackground(bt);
            if(t==15){
              b=0;
              t=255;
              t2=255;
            }
          }

        }
      }



      tabla.setDefaultRenderer(Object.class, new Render() );
      tabla.setModel(new DefaultTableModel(data, nombres));
      tabla.setRowHeight(40);
    }
    else if(e.getSource()==cbx1){
      //ROTAR
      vent1=new Prueba1();
    }
    else if(e.getSource()==cbx2){
      //SESGADO
      vent4=new Sesgado();
    }
    else if(e.getSource()==cbx3){
      //TRASLADAR
      vent3=new Trasladar();
    }
    else if(e.getSource()==cbx4){
      SwingUtilities.invokeLater(() -> {
        JFrame frame=new JFrame ("Dibujito :)");
        frame.setMinimumSize(new Dimension (640, 480));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(2);
        frame.setContentPane(new Dibujo1() );
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
      });
    }
    else if(e.getSource()==cbx5){
      //IMG
      vent5=new Img();
    }


    else if(e.getSource()==opcion2){
      fondo.setIcon(new ImageIcon("SuperIn//fondo2.png"));
      fondo2.setIcon(new ImageIcon("SuperIn//fondo2.png"));
      fondo3.setIcon(new ImageIcon("SuperIn//fondo2.png"));
      jt.setBackgroundAt(0, new Color(255,105,180));
      jt.setBackgroundAt(1, new Color(255,105,180));
      jt.setBackgroundAt(2, new Color(255,105,180));
    }
    else if(e.getSource()==opcion1){
      fondo.setIcon(new ImageIcon("SuperIn//fondo.png"));
      fondo2.setIcon(new ImageIcon("SuperIn//fondo.png"));
      fondo3.setIcon(new ImageIcon("SuperIn//fondo.png"));
      jt.setBackgroundAt(0, new Color(199,21,133));
      jt.setBackgroundAt(1, new Color(199,21,133));
      jt.setBackgroundAt(2, new Color(199,21,133));
    }
    else if(e.getSource()==opcion3){
      jt.setSelectedIndex(0);
      JOptionPane.showMessageDialog(null,"BIENVENID@ A LA PAGINA DE LA PASTELERIA JECRI");
    }
    else if(e.getSource()==opcion5){
      jt.setSelectedIndex(1);
    }
    else if(e.getSource()==opcion6){
      jt.setSelectedIndex(2);
    }
    else if(e.getSource()==opcion4){
      try{
        clip=AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(new File("SuperIn//son8.wav")));
        clip.start();
     }catch(Exception ev){
      System.out.println(ev.getMessage());
    }
      int apagar=JOptionPane.showConfirmDialog(null,"FELICIDADES HAS ENCONTRADO LA FUNCION EXTRA, AHORA PUEDES COMUNICARTE CON NOSOTROS AL 5518706598");
      if(apagar==0||apagar==1||apagar==2){
        clip.stop();
      }
      }


    else if(e.getSource()==btn){
      texto1=txt1.getText();
      texto2=txt2.getText();
      texto3=txt3.getText();
      textoT="***********CARACTERISTICAS DSIPONIBLES***********\nCOLORES DISPONIBLES: \n-Negro \n-Blanco \n-Rosa \n-Rojo \n-Azul \n-Amarillo \n-Naranja \n-Gris \n-Verde \n-Vino \n-Cafe";
      textoT+="\n\nSABORES DISPONIBLES: \n-Chocolate \n-Fresa \n-Tres leches \n-Nuez \n-Frambuesa \n-Ron \n-Oreo \n-Galleta \n-Queso \n-Kinder";
      textoT+="\n\nTAMAÑOS DISPONIBLES: \n-Solo un nivel 15cm a 40cm (diametro) 500gr-3kg \n-Dos niveles 1kg-5kg \n-Tes niveles 2.2kg-7kg \n-Cuatro o mas, consulte al 5518706598";
      textoT+="\n\nCARACTRISTICAS ELEGIDAS";
      textoT+="\nCOLOR:";
      textoT+="\n"+texto1;
      textoT+="\nSABOR:";
      textoT+="\n"+texto2;
      textoT+="\nTAMAÑO:";
      textoT+="\n"+texto3;

      if(ck1.isSelected()==true&&rb1.isSelected()==true){
        tipo1=new Font("Arial",1,12);
        ta1.setFont(tipo1);
        if(ck3.isSelected()==true&&ck1.isSelected()==true&&rb1.isSelected()==true){
          tipo1=new Font("Arial",Font.BOLD,12);
          atributes=tipo1.getAttributes();
          atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
          ta1.setFont(tipo1.deriveFont(atributes));
          if(ck3.isSelected()==true&&ck2.isSelected()==true&&ck1.isSelected()==true&&rb1.isSelected()==true){
            tipo1=new Font("Arial",3,12);
            atributes=tipo1.getAttributes();
            atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
            ta1.setFont(tipo1.deriveFont(atributes));
          }
        }
        else if(ck1.isSelected()==true&&ck2.isSelected()==true&&rb1.isSelected()==true){
          tipo1=new Font("Arial",3,12);
          ta1.setFont(tipo1);
        }
      }
      else if(ck2.isSelected()==true&&rb1.isSelected()==true){
        tipo1=new Font("Arial",2,12);
        ta1.setFont(tipo1);
        if(ck3.isSelected()==true&&ck2.isSelected()==true&&rb1.isSelected()==true){
          tipo1=new Font("Arial",2,12);
          atributes=tipo1.getAttributes();
          atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
          ta1.setFont(tipo1.deriveFont(atributes));
        }
      }
      else if(ck3.isSelected()==true&&rb1.isSelected()==true){
        tipo1=new Font("Arial",0,12);
        atributes=tipo1.getAttributes();
        atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        ta1.setFont(tipo1.deriveFont(atributes));
      }


      else if(ck1.isSelected()==true&&rb2.isSelected()==true){
        tipo1=new Font("Algerian",1,12);
        ta1.setFont(tipo1);
        if(ck3.isSelected()==true&&ck1.isSelected()==true&&rb2.isSelected()==true){
          tipo1=new Font("Algerian",Font.BOLD,12);
          atributes=tipo1.getAttributes();
          atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
          ta1.setFont(tipo1.deriveFont(atributes));
          if(ck3.isSelected()==true&&ck2.isSelected()==true&&ck1.isSelected()==true&&rb2.isSelected()==true){
            tipo1=new Font("Algerian",3,12);
            atributes=tipo1.getAttributes();
            atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
            ta1.setFont(tipo1.deriveFont(atributes));
          }
        }
        else if(ck1.isSelected()==true&&ck2.isSelected()==true&&rb2.isSelected()==true){
          tipo1=new Font("Algerian",3,12);
          ta1.setFont(tipo1);
        }
      }
      else if(ck2.isSelected()==true&&rb2.isSelected()==true){
        tipo1=new Font("Algerian",2,12);
        ta1.setFont(tipo1);
        if(ck3.isSelected()==true&&ck2.isSelected()==true&&rb2.isSelected()==true){
          tipo1=new Font("Algerian",2,12);
          atributes=tipo1.getAttributes();
          atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
          ta1.setFont(tipo1.deriveFont(atributes));
        }
      }
      else if(ck3.isSelected()==true&&rb2.isSelected()==true){
        tipo1=new Font("Algerian",0,12);
        atributes=tipo1.getAttributes();
        atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        ta1.setFont(tipo1.deriveFont(atributes));
      }


      else if(ck1.isSelected()==true&&rb3.isSelected()==true){
        tipo1=new Font("Segoe Script",1,12);
        ta1.setFont(tipo1);
        if(ck3.isSelected()==true&&ck1.isSelected()==true&&rb3.isSelected()==true){
          tipo1=new Font("Segoe Script",Font.BOLD,12);
          atributes=tipo1.getAttributes();
          atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
          ta1.setFont(tipo1.deriveFont(atributes));
          if(ck3.isSelected()==true&&ck2.isSelected()==true&&ck1.isSelected()==true&&rb3.isSelected()==true){
            tipo1=new Font("Segoe Script",3,12);
            atributes=tipo1.getAttributes();
            atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
            ta1.setFont(tipo1.deriveFont(atributes));
          }
        }
        else if(ck1.isSelected()==true&&ck2.isSelected()==true&&rb3.isSelected()==true){
          tipo1=new Font("Segoe Script",3,12);
          ta1.setFont(tipo1);
        }
      }
      else if(ck2.isSelected()==true&&rb3.isSelected()==true){
        tipo1=new Font("Segoe Script",2,12);
        ta1.setFont(tipo1);
        if(ck3.isSelected()==true&&ck2.isSelected()==true&&rb3.isSelected()==true){
          tipo1=new Font("Segoe Script",2,12);
          atributes=tipo1.getAttributes();
          atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
          ta1.setFont(tipo1.deriveFont(atributes));
        }
      }
      else if(ck3.isSelected()==true&&rb3.isSelected()==true){
        tipo1=new Font("Segoe Script",0,12);
        atributes=tipo1.getAttributes();
        atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        ta1.setFont(tipo1.deriveFont(atributes));
      }


      else if(ck1.isSelected()==true){
        tipo1=new Font("Arial",1,12);
        ta1.setFont(tipo1);
        if(ck3.isSelected()==true&&ck1.isSelected()==true){
          tipo1=new Font("Arial",Font.BOLD,12);
          atributes=tipo1.getAttributes();
          atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
          ta1.setFont(tipo1.deriveFont(atributes));
          if(ck3.isSelected()==true&&ck2.isSelected()==true&&ck1.isSelected()==true){
            tipo1=new Font("Arial",3,12);
            atributes=tipo1.getAttributes();
            atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
            ta1.setFont(tipo1.deriveFont(atributes));
          }
        }
        else if(ck1.isSelected()==true&&ck2.isSelected()==true){
          tipo1=new Font("Arial",3,12);
          ta1.setFont(tipo1);
        }
      }
      else if(ck2.isSelected()==true){
        tipo1=new Font("Arial",2,12);
        ta1.setFont(tipo1);
        if(ck3.isSelected()==true&&ck2.isSelected()==true){
          tipo1=new Font("Arial",2,12);
          atributes=tipo1.getAttributes();
          atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
          ta1.setFont(tipo1.deriveFont(atributes));
        }
      }
      else if(ck3.isSelected()==true){
        tipo1=new Font("Arial",0,12);
        atributes=tipo1.getAttributes();
        atributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        ta1.setFont(tipo1.deriveFont(atributes));
      }

      else if(rb1.isSelected()==true){
        tipo1=new Font("Arial",0,12);
        ta1.setFont(tipo1);
      }
      else if(rb2.isSelected()==true){
        tipo1=new Font("Algerian",0,12);
        ta1.setFont(tipo1);
      }
      else if(rb3.isSelected()==true){
        tipo1=new Font("Segoe Script",0,12);
        ta1.setFont(tipo1);
      }
      ta1.setText(textoT);
    }
    }

  public static void main(String[]args){
    Interfaz in=new Interfaz();
    JOptionPane.showMessageDialog(null,"BIENVENID@ A LA PAGINA DE LA PASTELERIA JECRI");
  }
}
