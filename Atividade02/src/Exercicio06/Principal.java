package Exercicio06;

import Exercicio06.Validacao;


public class Principal {

  public static void main(String[] args) {
     
     Validacao validar = new Validacao();
     
     String cpf = "08975239462";
     validar.validaCpf(cpf);
     
     if(validar.validaCpf(cpf) == true){
       System.out.println("O CPF informado é: "+validar.imprimeCPF(cpf));
     } else {
       System.out.println("\nERRO: CPF inválido!");
     }
  }

}
