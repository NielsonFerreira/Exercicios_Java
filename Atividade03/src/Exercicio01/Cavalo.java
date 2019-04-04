package Exercicio01;

public class Cavalo extends Animal {

   public void setNome(){
     this.nome = "Pé-de-pano";
   }
   
   public String getNome(){
     return nome;
   }
   
   public void setIdade(){
     this.idade = 5;
   }
   
   public int getIdade(){
     return idade;
   }
   
   @Override
   public void emitirSom(boolean som){
     
     if(som == true){
       System.out.println("O cavalo está Relinchando!");
     } else {
       System.out.println("Silêncio");
     }
   } 
}
