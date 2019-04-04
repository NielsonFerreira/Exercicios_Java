package Exercicio03;

import Exercicio01.Animal;

public class Veterinario {
   
   Animal animal = new Animal();
   
   public void examinar(Animal animal){
     
      System.out.println("Examinando...");
      animal.tipoAnimal(animal);
      System.out.print("\n");
   }
}
