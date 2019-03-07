package exercicio04;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int i;
		
		System.out.print("Insira a quantidade de elementos: ");
		n = sc.nextInt();
		int[] array = new int[n];
		
		for(i=0; i < n; i++) {
			System.out.print("Insira "+n+" n�mero(s) inteiro(s): ");
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(array);
		
		int maior = array[i-1];
		int menor = array[0];
		
		System.out.println("O maior n�mero do array �: "+maior);
		System.out.println("O menor n�mero do array �: "+menor);
	}
}