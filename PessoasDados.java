import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class PessoasDados{
   public List <Pessoas> listar ( ) throws Exception{
      String sql = "SELECT * FROM pessoas";
      List <Pessoas> pessoas = new ArrayList <> ( );
      ConexaoBD b = new ConexaoBD();
      Connection conn = b.conectar();
      try(Connection c = ConexaoBD.conectar( );
         PreparedStatement ps = c.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()){
         while (rs.next()){
            String nome = rs.getString("nome");
            int idade = rs.getInt ("idade");
            String sexo = rs.getString("sexo");	         	         
            boolean fk_faz_esporte = rs.getBoolean ("fk_faz_esporte");
            Pessoas p = new Pessoas (nome, idade, sexo, fk_faz_esporte);
            pessoas.add(p);      
         }      
      }
   }
}

		
