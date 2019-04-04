package Exercicio05;

import Exercicio04.Pessoa;

public class Fornecedor extends Pessoa {
   
   private double valorCredito;
   private double valorDivida;
   
   public double obterSaldo(double credito, double divida){
     
     this.valorCredito = credito;
     this.valorDivida = divida;
     
     return valorCredito - valorDivida;
   }
}
