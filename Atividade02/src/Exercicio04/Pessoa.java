package Exercicio04;

public class Pessoa {

   private String nome;
   private String endereco;
   private String telefone;
   
   public String getNome() {
     return this.nome;
   }
   
   public void setNome() {
     this.nome = "João";
   }
   
   public String getEndereco() {
     return this.endereco;
   }
   
   public void setEndereco() {
     this.endereco = "Rua da Chuva, 17";
   }
   
   public String getTelefone() {
     return this.telefone;
   }
   
   public void setTelefone() {
     this.telefone = "98765-4321";
   }
   
   public void imprimeDados() {
     System.out.println("Nome: " +nome);
     System.out.println("Endereço: "+endereco);
     System.out.println("Telefone: "+telefone);
   }
//-------------------------------------
   //Construtores
   
   public Pessoa (String nome2, String endereco2, String telefone2) {
     this.nome = nome2;
     this.endereco = endereco2;
     this.telefone = telefone2;
   }
   
   public Pessoa (String nome3, String endereco3){
     this.nome = nome3;
     this.endereco = endereco3;
   }
   
   public Pessoa() {
     
   }
}