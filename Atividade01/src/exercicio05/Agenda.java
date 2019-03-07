package exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	
	List<Contato> agenda = new ArrayList<Contato>();
	
	public void AddContato() {
		
		Contato contato = new Contato();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um nome: ");
		contato.setNome(sc.nextLine());
		
		System.out.print("Insira um email: ");
		contato.setEmail(sc.nextLine());
		System.out.print("\n");
		
		agenda.add(contato);
	}
	
	public void MostraContatos() {
		
		System.out.println("==Lista de Contatos==");
		
		for(int i = 0; i < agenda.size(); i++) {
			
			System.out.println("Nome: "+agenda.get(i).getNome());
			System.out.println("Email: "+agenda.get(i).getEmail()+"\n");
		}
	}
	
	public void BuscarContato() {
		
		System.out.println("== Buscar contato ==");
		System.out.print("Digite o nome do contato: ");
		Scanner sc = new Scanner(System.in);
		String busca = sc.nextLine();
		
		for(int i = 0; i < agenda.size(); i++) {
			if(agenda.get(i).getNome().equals(busca)) {
				System.out.println("\nEncontrado!!!");
				System.out.println("Nome: "+agenda.get(i).getNome());
				System.out.println("Email: "+agenda.get(i).getEmail()+"\n");
				break;
			}
		}
	}
	
	public void ExcluirContato() {
		
		System.out.println("== Apagar contato ==");
		System.out.print("Digite o nome do contato: ");
		Scanner sc = new Scanner(System.in);
		String exclui = sc.nextLine();
		
		for(int i = 0; i < agenda.size(); i++) {
			if(agenda.get(i).getNome().equals(exclui)) {
				agenda.remove(i);
				System.out.println("\nContato apagado com sucesso!\n");
				break;
			}
		}
	}
}