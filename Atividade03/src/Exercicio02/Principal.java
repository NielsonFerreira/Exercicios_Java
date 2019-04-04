package Exercicio02;

import Exercicio01.Animal;
import Exercicio01.Cachorro;
import Exercicio01.Cavalo;
import Exercicio01.Serpente;

public class Principal {

  public static void main(String[] args) {

     Animal animal = new Animal();
     
     Cachorro cachorro = new Cachorro();
     Cavalo cavalo = new Cavalo();
     Serpente serpente = new Serpente();
     
     animal.tipoAnimal(cachorro);
     animal.tipoAnimal(cavalo);
     animal.tipoAnimal(serpente);
     
  }
}
