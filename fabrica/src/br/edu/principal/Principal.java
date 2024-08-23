package br.edu.principal;
import java.util.Scanner;

import br.edu.veiculo.*;
import br.edu.veiculo.Veiculo;

public class Principal {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String tipo = null;
		
		System.out.println("Digite o primeiro numero: ");
		tipo = sc.nextLine();
		
		Veiculo v1= criaveiculo("Carro_de_passeio");
		v1.buzinar();
		
	}
	public static Veiculo criaveiculo(String tipo) {
		
		if (tipo==null) {
			System.out.println("Nenhum carro enviado");
		}
		else if (tipo.equals("Utilitario")) {
				System.out.println("Carro criado!");
			return new Utilitario();
			} 
		else if (tipo.equals("Jipe")) {
			System.out.println("Carro criado!");
		return new Jipe();
		} 
		else if (tipo.equals("Carro_de_passeio")) {
			System.out.println("Carro criado!");
		return new Carro_de_passeio();
		} 
		
		return null;
	}

}
