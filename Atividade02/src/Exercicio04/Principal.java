package Exercicio04;

public class Principal {

  public static void main(String[] args) {
    
    Pessoa pessoa = new Pessoa();
    
    pessoa.setNome();
    pessoa.setEndereco();
    pessoa.setTelefone();
    
    pessoa.imprimeDados();
//---------------------------------------

    Pessoa pessoa2 = new Pessoa("Maria","Rua do Sol, 16", "45454-2324");
    
    pessoa2.imprimeDados();
//---------------------------------------
    
    Pessoa pessoa3 = new Pessoa("Joana", " Rua do Frio, 21");
    
    pessoa3.imprimeDados();
  }
}
