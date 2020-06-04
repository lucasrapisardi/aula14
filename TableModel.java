import javax.swing.table.*;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableModel extends AbstractTableModel {

   public TableModel (String [] colunas) {      
      this.colunas = colunas;
   }
   private Object [][] dados;
   private String [] colunas;

   public int getRowCount() {
      return dados.length;
   }

   public int getColumnCount() {
      return colunas.length;
   }

   public Object getValueAt(int rowIndex, int columnIndex) {
      return dados[rowIndex][columnIndex];
   }
   public Class getColumnClass(int columnIndex) {
      return getValueAt(0, columnIndex).getClass();
   }
   public String getColumnName(int column) {
      return this.colunas [column];
   }

   public boolean isCellEditable(int rowIndex, int columnIndex) {
      return true;
   }
   public void setValueAt(Object value, int row, int col) {
      dados[row][col] = value;
      fireTableCellUpdated(row, col);
   }
}