package exercicio08;

import java.util.Scanner;

public class Principal {
	
	private static int n1;
	private static int n2;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.print("Insira o segundo número: ");
		n2 = sc.nextInt();
		System.out.print("\n");
		sc.close();
		
		ComparaNumero.CompNumero(n1, n2);
	}
}