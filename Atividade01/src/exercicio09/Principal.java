package exercicio09;

public class Principal {

	public static void main(String[] args) {

		MediaAluno ma = new MediaAluno();

		MediaAluno.AdicionarNotas();

		ma.MostraNotas();
		
		ma.CalculaMedia();
	}
}
