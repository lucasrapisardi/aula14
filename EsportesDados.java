import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class EsportesDados{
   public List <Esportes> listar ( ) throws Exception{
      String sql = "SELECT * FROM esportes";
      List <Esportes> esportes = new ArrayList <> ( );
      ConexaoBD b = new ConexaoBD();
      Connection conn = b.conectar();
      try(Connection c = ConexaoBD.conectar( );
         PreparedStatement ps = c.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()){
         while (rs.next()){
            int id = rs.getInt ("id");
            String nome_do_esporte = rs.getString("nome_do_esporte");	         	         
            Esportes es = new Esportes (id, nome_do_esporte);
            esportes.add(es);     
         }      
      }
   }
}

