package Exercicio01;

public class Serpente extends Animal {
   
  public void setNome(){
     this.nome = "Python";
   }
   
   public String getNome(){
     return nome;
   }
   
   public void setIdade(){
     this.idade = 7;
   }
   
   public int getIdade(){
     return idade;
   }
   
   @Override
   public void emitirSom(boolean som){
     
     if(som == true){
       System.out.println("A serpente está Assoviando!");
     } else {
       System.out.println("Silêncio");
     }
   } 
}
