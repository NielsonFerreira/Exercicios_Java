package Exercicio02;

import java.util.Scanner;
import java.util.Locale;

public class Porta {
  
  private boolean aberta;
  private String cor;
  private double dimensaoX = 0.0, dimensaoY = 0.0, dimensaoZ = 0.0;
  
  public void abre() {
    System.out.println("A porta foi aberta");
    this.aberta = true;
  }
  
  public void fecha() {
    System.out.println("A porta foi fechada");
    this.aberta = false;
  }
  
  public void pinta (String s) {
    
    this.cor = s;
    System.out.println("A nova cor da porta é "+cor);
  }
  
  public boolean estaAberta() {
    
    if(this.aberta == true) {
      System.out.println("A porta está aberta");
      return true;
    } else {
      System.out.println("A porta está fechada");
      
      return false;
    }
  }
  
  public void alterDimen() {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    
    System.out.print("Informe o comprimento: ");
    double x = sc.nextDouble();
    this.dimensaoX = x;
    
    System.out.print("Informe a altura: ");
    double y = sc.nextDouble();
    this.dimensaoY = y;
    
    System.out.print("Informe a largura: ");
    double z = sc.nextDouble();
    this.dimensaoZ = z;
    
    sc.close();
  }
}
