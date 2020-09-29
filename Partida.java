package terceira_lista_de_exercicios;

public class Partida {

	private String time1;
	private String time2;
	private int pontostime1;
	private int pontostime2;
	private int saldotime1;
	private int saldotime2;
	
	//Special Methods
	
		public void settime1(String time1) {
			this.time1 = time1;
		}
		
		public String gettime1(){
			return time1;
		}
		
		
		public void settime2(String time2) {
			this.time2 = time2;
		}
		
		public String gettime2(){
			return time2;
		}
		
		// ----------------------------------
		
		public void setpontos1(int pontostime1) {
			this.pontostime1 = pontostime1;
		}
		
		public double getpontos1(){
			return pontostime1;
		}
		
		// -----------------------------------
		
		public void setpontos2(int pontostime2) {
			this.pontostime2 = pontostime2;
		}
		
		public double getpontos2(){
			return pontostime2;
		}
		
		// ----------------------------------
		
		public void setsaldo1(int saldotime1) {
			this.saldotime1 = saldotime1;
		}
		
		public double getsaldo1(){
			return saldotime1;
		}
		
		// -----------------------------------
		
		public void setsaldo2(int saldotime2) {
			this.saldotime2 = saldotime2;
		}
		
		public double getsaldo2(){
			return saldotime2;
		}
	
}
