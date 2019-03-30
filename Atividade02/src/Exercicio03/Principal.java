package Exercicio03;

import Exercicio03.Porta;


public class Principal {

  public static void main(String[] args) {
     
     Pessoa pessoa = new Pessoa();
     
     pessoa.fazAniversario();
     pessoa.imprimeDados();
     
     Pessoa pessoa2 = new Pessoa("Joana", 50);
     
     pessoa2.fazAniversario();
     pessoa2.imprimeDados();
  //--------------------------------
     Porta porta = new Porta();
     
     
     porta.abre();
     porta.fecha();
     
     porta.pinta("Azul");
     porta.estaAberta();
     porta.alterDimen();
     
     Porta porta2 = new Porta(false, "vermelho");
     
     porta2.abre();
     porta2.fecha();
     
     porta2.pinta();
     porta2.estaAberta();
     porta2.alterDimen();
  }
}
