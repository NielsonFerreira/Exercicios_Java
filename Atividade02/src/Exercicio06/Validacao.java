package Exercicio06;

import java.util.InputMismatchException;


public class Validacao {
   
   public void validaEmail(String email){
      
   }
   
   public boolean validaCpf(String cpf){
     
     char dv1;
     char dv2;
     int sm;
     int peso;
     int num;
     int r;
     
     try {
     //Calcular o primeiro digito verificador
     sm = 0;
     peso = 10;
       for (int i=0; i<9; i++){
         num = (int)(cpf.charAt(i)-48);
         System.out.print(num);
         
         sm = sm + (num * peso);
         peso = peso - 1;
       }
       
       //System.out.println(sm);
       r = 11-(sm % 11);
       
       if((r == 10)||(r == 11)){
         dv1 = '0';
       } else {
         dv1 = (char)(r);
       }
       
       //Calcular o segundo digito verificador
       sm = 0;
       peso = 11;
       num = 0;
       
       for (int i=0; i<10; i++){
         num = (int)(cpf.charAt(i)-48);
         //System.out.println(num);
         
         sm = sm + (num * peso);
         peso = peso - 1;
       }
       
       //System.out.println(sm);
       r = 11-(sm % 11);
       
       //System.out.print("r: "+r);
       
       if((r == 10)||(r == 11)){
         dv2 = '0';
       } else {
         dv2 = (char)(r);
       }
       
       //System.out.println(dv1 + dv2);
       
       //Verificar se os digitos calculados conferem com os digitos informados
       if((dv1 == cpf.charAt(9)) && (dv2 == cpf.charAt(10))) {
         return (true);
       } else {
         return (false);
       }
     } catch (InputMismatchException erro) {
       System.out.println("CPF inválido!");
       return(false);
     }
     
     
   }
   public String imprimeCPF (String cpf){
     return (cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11));
   }
   
   public void validaTelefone(long tel){
     
   }
   
   public void validaData(){
     
   }
}
