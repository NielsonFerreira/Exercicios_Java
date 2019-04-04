package Exercicio01;

public class Animal {
   
   protected  String nome;
   protected  int idade;
   
   public void tipoAnimal(Animal animal){
     
     animal.emitirSom(true);
   }
   
   public void setNome(String nome){
     this.nome = nome;
   }
   
   public String getNome(){
     return nome;
   }
   
   public void setIdade(int idade){
     this.idade = idade;
   }
   
   public int getIdade(){
     return idade;
   }
   
   public void emitirSom(boolean som){
     
     if(som == true){
       System.out.println("Emite som!");
     } else {
       System.out.println("Silêncio");
     }
   }
}
