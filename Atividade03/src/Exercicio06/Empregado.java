package Exercicio06;

import Exercicio04.Pessoa;
 
public class Empregado extends Pessoa{
     
     private int codigoSetor;
     private double salarioBase;
     private double imposto;
     
     public void setCodigoSetor(int codigo){
       this.codigoSetor = codigo;
     }
     
     public int getCodigoSetor(){
       return codigoSetor;
     }
     
     public void setSalarioBase(double salario){
       this.salarioBase = salario;
     }
     
     public double getSalarioBase(){
       return salarioBase;
     }
     
     public void setImposto(double imposto){
       this.imposto = imposto;
     }
     
     public double getImposto(){
       return imposto;
     }
     
     public void calcularSalario(){
       
     }
}
