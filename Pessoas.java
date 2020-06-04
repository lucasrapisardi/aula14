public class Pessoas{
   private String nome;
   private int idade;
   private String sexo;
   private boolean fk_faz_esporte;
	
   public Pessoas(String nome, int idade, String sexo, boolean fk_faz_esporte){
      this.nome = nome;
      this.idade = idade;
      this.sexo = sexo;
      this.fk_faz_esporte = true;
   }   
   public String getNome(){
      return nome;
   }
   public int getIdade(){
      return idade;
   }
   public String getSexo(){
      return sexo;
   }
   public boolean getFk_faz_esporte(){
      return fk_faz_esporte;
   }
      
   public void setNome(String nome){
      this.nome = nome;
   }
   public void setIdade(int idade){
      this.idade = idade;
   }
   public void setSexo(String sexo){
      this.sexo = sexo;
   }
   public void setFK_faz_esporte(boolean fk_faz_esporte){
      this.fk_faz_esporte = fk_faz_esporte;
   }
            
   
}
   

