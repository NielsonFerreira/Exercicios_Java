package exercicio02;

public class ParImpar {

	public static void main(String[] args) {
		int i = 0; //impar
		long p = 0; //par
		
		for (int x = 1; x < 30; x++) {
			if(x % 2 != 0) {
				i += x;
			} else {
				p *= x;
			}
		}
		
		System.out.println("A soma dos números impares entre 0 e 30 é: "+i);
		
		System.out.println("A multiplicação dos números pares entre 0 e 30 é: "+p);
	}
}