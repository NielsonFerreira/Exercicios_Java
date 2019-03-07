package exercicio09;

import java.util.Scanner;

public class MediaAluno {
	
	static Scanner sc = new Scanner(System.in);
	private static int[] notas = new int[5];
	private static int i = 0;
	
	public static void AdicionarNotas() {
		
		for(i = 0; i < notas.length; i++) {
			System.out.print("Insira a nota: ");
			notas[i] = sc.nextInt();
			
			if((notas[i] < 0) || (notas[i] > 100)) {
				System.out.println("Nota inválida. Tente novamente.");
				i--;
			}
		}
	}
	
	public void MostraNotas() {
		for (i=0; i < notas.length; i++) {
			System.out.println("Nota "+i+": "+notas[i]);
		}
	}
	
	public void CalculaMedia() {
		double media = 0;
		for (i=0; i < notas.length; i++) {
			media += notas[i];
		}
		media /= notas.length;
		System.out.println("A média é: "+media);
	}
}