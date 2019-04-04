package Exercicio04;

public class Pessoa {

   protected String nome;
   protected String endereco;
   protected String telefone;
   
   //Construtores
   public Pessoa(){
     
   }
   
   public Pessoa(String nome, String endereco){
     this.nome = nome;
     this.endereco = endereco;
   }
   
   public Pessoa(String nome, String endereco, String telefone){
     this.nome = nome;
     this.endereco = endereco;
     this.telefone = telefone;
   }
//-------------------------------------
   //Getters e Setters
   public void setNome(String nome){
     this.nome = nome;
   }
   
   public String getNome(){
     return nome;
   }
   
   public void setEndereco(String endereco){
     this.endereco = endereco;
   }
   
   public String getEndereco(){
     return endereco;
   }
   
   public void setTelefone(String telefone){
     this.telefone = telefone;
   }
   
   public String getTelefone(){
     return telefone;
   }
}
