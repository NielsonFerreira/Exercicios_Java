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
		
		System.out.println("A soma dos n�meros impares entre 0 e 30 �: "+i);
		
		System.out.println("A multiplica��o dos n�meros pares entre 0 e 30 �: "+p);
	}
}