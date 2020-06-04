public class Esportes{
   private int id;
   private String nome_do_esporte;

   public Esportes(int id, String nome_do_esporte){
      this.id = id;
      this.nome_do_esporte = nome_do_esporte;
   }   
   public String getNome_do_esporte(){
      return nome_do_esporte;
   }
   public int getId(){
      return id;
   }     
      
   public void setNome_do_esporte(String nome_do_esporte){
      this.nome_do_esporte = nome_do_esporte;
   }
   public void setId(int id){
      this.id = id;
   }
                    
}
   

