package exercicio08;

public class ComparaNumero {
	
	private static int result;
	
	public static void CompNumero (int num1, int num2) {
		if(num1 > num2) {
			result = num1 - num2;
			System.out.println("A diferença entre "+num1+" e "+num2+" é: "+result);
		} else if (num1 < num2) {
			result = num2 - num1;
			System.out.println("A diferença entre "+num1+" e "+num2+" é: -"+result);
		} else {
			System.out.println("Os números são iguais!");
		}
	}
}