package Exercicio05;

import java.math.*;

public class Matematica {
   
   public void raizQuadrada(double num) {
     double resultado = 0.0;
     
     resultado = Math.sqrt(num);
     
     System.out.println("A raiz quadrada de "+num+" é: "+resultado);
   }
   
   public void potencia(double base, double expoente) {
     double resultado = 0.0;
     
     resultado = Math.pow(base, expoente);
     
     System.out.print("O resultado da potência "+base+"^"+expoente+" é: "+resultado);
   }
}