package exercicio07;

import exercicio06.Data;

public class RegistroAcademico {
	
	private String nomeDoAluno;
	private int numeroMatricula;
	private Data dataDeNascimento;
	private int anoDeMatricula;
	private boolean eBolsista;
	
	public void inicializaRegistro(String oNome, int aMatricula, Data aData, boolean temBolsa, int qualAno) {
		
		this.nomeDoAluno = oNome;
		this.numeroMatricula = aMatricula;
		this.dataDeNascimento = aData;
		this.eBolsista = temBolsa;
		this.anoDeMatricula = qualAno;
	}
	
	public int calculaMensalidade() {
		int mensalidade = 400;
		
		if (eBolsista = true) {
			mensalidade /= 2;
		}
		return mensalidade;
	}
	
	public void mostraRegistro() {
		
		System.out.println("Nome do aluno: " +this.nomeDoAluno);
		System.out.println("Número de Matrícula: " +this.numeroMatricula);
		System.out.print("Data de Nascimento: ");
		dataDeNascimento.mostraData();
		if (eBolsista == true) {
			System.out.println("O aluno é bolsista.");
		} else {
			System.out.println("O aluno não é bolsista.");
		}
		System.out.println("Ano de Matrícula: " +this.anoDeMatricula);
	}
}
