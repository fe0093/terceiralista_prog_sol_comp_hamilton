package terceira_lista_de_exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Jogadores jogador1 = new Jogadores ();
		Jogadores jogador2 = new Jogadores ();
		
		String nome = entrada.next();
		jogador1.setNome(nome);
		jogador1.setAltura(entrada.nextDouble());
		
		jogador2.setNome(JOptionPane.showInputDialog("Digite o nome de um Jogador"));
		jogador2.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Jogador")));
		
		System.out.println("Nome: "+jogador1.getNome()+"\nAltura: "+jogador1.getAltura());
		System.out.println("Nome: "+jogador2.getNome()+"\nAltura: "+jogador2.getAltura());
			
	}
}
