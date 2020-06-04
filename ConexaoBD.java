import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
   static {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (ClassNotFoundException e) {
         throw new RuntimeException(e);
      }
   }
	
	// Obtém conexão com o banco de dados
   public static Connection conectar() throws SQLException {
      String servidor = "localhost";
      String porta = "3306";
      String database = "esportes";
      return DriverManager.getConnection("jdbc:mysql://"+servidor+":"+porta+"/"+database+"?useTimezone=true&serverTimezone=UTC", "root", "Lrcm2519");
   
   }

   public static void desconectar(Connection conn) throws SQLException {
      conn.close();
   }
}