import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Teste {
   public static void main (String [] args){     
      PessoasEsportes ped = new PessoasEsportes();
   
      JTable table = new TableModel();
      JScrollPane scrollPane = new JScrollPane(table);
   
      JFrame frame = new JFrame();
      frame.getContentPane().add(scrollPane); 
      frame.pack();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
   
   
   
   }
}
