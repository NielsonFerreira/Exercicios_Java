package exercicio01;

import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		i = sc.nextInt();
		sc.close();
		
		while (i > 0) {
			i -= 1;
			System.out.println(+i);
		}
	}
}
