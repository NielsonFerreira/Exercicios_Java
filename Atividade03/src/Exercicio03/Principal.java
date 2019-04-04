package Exercicio03;

import Exercicio01.Cachorro;
import Exercicio01.Cavalo;
import Exercicio01.Serpente;
import Exercicio03.Veterinario;


public class Principal {

  public static void main(String[] args) {
     
     Cachorro cachorro = new Cachorro();
     Cavalo cavalo = new Cavalo();
     Serpente serpente = new Serpente();
     
     Veterinario veterinario = new Veterinario();
     
     veterinario.examinar(cachorro);
     veterinario.examinar(cavalo);
     veterinario.examinar(serpente);
  }

}
