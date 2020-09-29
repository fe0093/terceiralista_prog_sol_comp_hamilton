package terceira_lista_de_exercicios;

public class time {
	
	private String nome;
	private int pontos;
	private int jogos;
	private int saldoDeGols;
	private int lugarNaTabela;
	
	//Special Methods
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	// ----------------------------------
	
	public void setpontos(int pontos) {
		this.pontos = pontos;
	}
	
	public double getpontos(){
		return pontos;
	}
	
	// -----------------------------------
	
	public void setjogos(int jogos) {
		this.jogos = jogos;
	}
	
	public double getjogos(){
		return jogos;
	}
	
	// ----------------------------------
	
	public void setsaldo(int saldoDeGols) {
		this.saldoDeGols = saldoDeGols;
	}
	
	public double getsaldo(){
		return saldoDeGols;
	}
	
	// -----------------------------------
	
	public void setlugar(int lugarNaTabela) {
		this.lugarNaTabela = lugarNaTabela;
	}
	
	public double getlugar(){
		return lugarNaTabela;
	}
	
}
