package exercicio03;

import java.util.Scanner;

public class TrocaNumero{
	
	public static void main(String[] args) {
		int NumA;
		int NumB;
		int NumC;
		
		Scanner num = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		NumA = num.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		NumB = num.nextInt();
		
		num.close();
		
		NumC = NumA;
		NumA = NumB;
		NumB = NumC;
		
		System.out.println("A invers�o dos n�meros �: "+NumA+" e "+NumB);
	}
}