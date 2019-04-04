package Exercicio01;

public class Cachorro extends Animal {
   
   public void setNome(){
     this.nome = "Ravena";
   }
   
   public String getNome(){
     return nome;
   }
   
   public void setIdade(){
     this.idade = 3;
   }
   
   public int getIdade(){
     return idade;
   }
   
   @Override
   public void emitirSom(boolean som){
     
     if(som == true){
       System.out.println("O cachorro está Latindo!");
     } else {
       System.out.println("Silêncio");
     }
   } 
}
