package Exercicio05;

import Exercicio04.Pessoa;
import Exercicio05.Fornecedor;

public class Principal {

  public static void main(String[] args) {
//---Classe Pessoa---------------------
     Pessoa pessoa1 = new Pessoa();
     Pessoa pessoa2 = new Pessoa("João", "Rua do Sol, 12");
     Pessoa pessoa3 = new Pessoa("Maria", "Rua da Chuva, 07", "98765-4321");
//---Pessoa1---------------------------
     System.out.println("Pessoa 1");
     System.out.println(pessoa1.getNome());
     System.out.println(pessoa1.getEndereco());
     System.out.println(pessoa1.getTelefone()+" \n");
     
//---Pessoa2---------------------------
     System.out.println("Pessoa 2");
     System.out.println(pessoa2.getNome());
     System.out.println(pessoa2.getEndereco());
     System.out.println(pessoa2.getTelefone()+" \n");
     
//---Pessoa3---------------------------
     System.out.println("Pessoa 3");
     System.out.println(pessoa3.getNome());
     System.out.println(pessoa3.getEndereco());
     System.out.println(pessoa3.getTelefone()+" \n");
     
//---Fornecedor------------------------
     System.out.println("Fornecedor");
     Fornecedor fornecedor1 = new Fornecedor();
      //Testando polimorfismo
     Pessoa fornecedor2 = new Fornecedor();
     
     fornecedor1.setNome("João");
     System.out.println("O saldo de "+fornecedor1.getNome()+" é: "+fornecedor1.obterSaldo(1000, 750));
     
  }

}
