import javax.swing.table.AbstractTableModel;
import java.util.List;
import javax.swing.*;
public class PessoasEsportes extends AbstractTableModel{
   private String [] pessoasdados = {"nome", "idade", "sexo", "fk_faz_esporte"};
   private List <Pessoas> pessoas;
   private String [] esportesdados = {"id", "nome_do_esporte"};
   private List <Esportes> esportes;
   private List <Pessoas> obtemPessoas ( ){
      try{
         PessoasDados pd = new PessoasDados ( );
         this.pessoas = pd.listar ( );
      }
      catch (Exception e){
         JOptionPane.showMessageDialog (null, "Falhou");
      }
   }
   private List <Esportes> obtemEsportes ( ){
      try{
         EsportesDados ed = new EsportesDados ( );
         this.esportes = ed.listar ( );
      }
      catch (Exception e1){
         JOptionPane.showMessageDialog (null, "Falhou");
      }
   }
   public PessoasEsportes ( ){
      this.obtemEsportes ( );
      this.obtemPessoas ( );
   }

}
