package exercicio07;

import exercicio06.Data;

public class Principal {

	public static void main(String[] args) {
		
		Data aData = new Data();
		RegistroAcademico registro = new RegistroAcademico();
		
		Data.inicializaData(04, 10, 1991);
		
		registro.inicializaRegistro("Nielson", 12345, aData, true, 2019);
		
		registro.mostraRegistro();
	} 
}
