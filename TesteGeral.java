package terceira_lista_de_exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteGeral {

public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		time time1 = new time();
		time time2 = new time();
		Partida Time1 = new Partida ();
		Partida Time2 = new Partida ();
		
		String nome = entrada.next();
		time1.setNome(nome);
		time2.setNome(nome);
		
		time1.setNome(JOptionPane.showInputDialog("Digite o nome do Primeiro time"));
		time2.setNome(JOptionPane.showInputDialog("Digite o nome do Segundo time"));
		
		int saldotime1 = entrada.nextInt();
		Time1.setsaldo1(saldotime1);
		Time2.setsaldo2(saldotime2);
		
		Time1.setsaldo1(Integer.parseInt(JOptionPane.showInputDialog("Digite os Gols do Primeiro Time")));
		Time2.setsaldo2(Integer.parseInt(JOptionPane.showInputDialog("Digite os Gols do Segundo Time")));
		
		int pontostime1 = entrada.nextInt();
		Time1.setpontos1(pontostime1);
		Time2.setpontos2(pontostime2);
		
		Time1.setpontos1(Integer.parseInt(JOptionPane.showInputDialog("Digite os Pontos do Primeiro Time")));
		Time2.setpontos2(Integer.parseInt(JOptionPane.showInputDialog("Digite os Pontos do Segundo Time")));
		
		
		System.out.println("Nome: "+time1.getNome()+"\nPontos: "+Time1.getpontos1());
		System.out.println("Nome: "+time2.getNome()+"\nPontos: "+Time2.getpontos2());
			
	}
	
}
