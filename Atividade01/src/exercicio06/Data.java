package exercicio06;

public class Data {
	private static int dia;
	private static int mes;
	private static int ano;
	
	public static void inicializaData(int umDia, int umMes, int umAno) {
		if (dataEValida(umDia, umMes, umAno) == true) {
			Data.dia = umDia;
			Data.mes = umMes;
			Data.ano = umAno;
		} else {
			Data.dia = 0;
			Data.mes = 0;
			Data.ano = 0;
		}
	}
	
	public static boolean dataEValida(int umDia, int umMes, int umAno) {
		if((umDia >= 1) && (umDia <= 31) && (umMes >= 1) && (umMes <= 12)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void mostraData() {
		System.out.println(+dia+"/"+mes+"/"+ano);
	}
}
