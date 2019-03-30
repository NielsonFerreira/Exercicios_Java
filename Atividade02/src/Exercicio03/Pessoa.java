package Exercicio03;

import java.util.Scanner;

public class Pessoa {
   
   private String nome = "Maria";
   private int idade = 32;
   private int novoNiver;
   
   Scanner sc = new Scanner(System.in);
   
   public void fazAniversario(){
     
     System.out.println(nome+" tem "+idade+" anos atualmente.");
     System.out.println("Quantos aniversários "+nome+" já fez desde então?");
     this.novoNiver = sc.nextInt();
     this.idade += this.novoNiver;
   }
   
   public void imprimeDados(){
     
     System.out.println(nome+" fez "+novoNiver+" aniversários? Então ela tem atualmente "+idade+" anos atualmente.");
   }
   
   //Sobrecarga de construtor
   public Pessoa (String nome2, int idade2) {
     this.nome = nome2;
     this.idade = idade2;
   }
   
   public Pessoa(){
     
   }
}
