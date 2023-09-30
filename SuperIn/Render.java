package SuperIn;
import java.awt.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer{

  public Component getTableCellRendererComponent(JTable tabla, Object objR, boolean bln, boolean bln1, int i, int i1){

    if(objR instanceof JButton){
      return (JButton)objR;
    }

    return super.getTableCellRendererComponent(tabla, objR, bln, bln1, i, i1);

  }


}
