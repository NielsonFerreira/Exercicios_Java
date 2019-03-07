package exercicio05;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.AddContato();
		agenda.AddContato();
		agenda.AddContato();
		
		agenda.MostraContatos();
		
		agenda.BuscarContato();
		agenda.ExcluirContato();
		
		agenda.MostraContatos();
	}
}
