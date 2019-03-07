package exercicio03;

import java.util.Scanner;

public class TrocaNumero{
	
	public static void main(String[] args) {
		int NumA;
		int NumB;
		int NumC;
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		NumA = num.nextInt();
		
		System.out.print("Digite o segundo número: ");
		NumB = num.nextInt();
		
		num.close();
		
		NumC = NumA;
		NumA = NumB;
		NumB = NumC;
		
		System.out.println("A inversão dos números é: "+NumA+" e "+NumB);
	}
}