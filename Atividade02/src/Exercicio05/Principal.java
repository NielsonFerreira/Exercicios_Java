package Exercicio05;

import Exercicio05.Matematica;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
     
     Matematica calculo = new Matematica();
     Scanner sc = new Scanner(System.in);
     
     double raiz;
     double base, expo;
     
     System.out.println("===== Raiz Quadrada =====");
     System.out.print("Insira um número: ");
     raiz = sc.nextDouble();
     
     calculo.raizQuadrada(raiz);
//----------------------------------------
     
     System.out.println("\n===== Potência =====");
     System.out.print("Insira a base: ");
     base = sc.nextDouble();
     
     System.out.print("Insira o expoente: ");
     expo = sc.nextDouble();
     
     calculo.potencia(base, expo);
  }
}