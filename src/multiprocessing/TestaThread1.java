package multiprocessing;

public class TestaThread1 {
	
	//classe respons�vel por gerenciar as funcionalidades

	public static void main(String[] args) {
		
		DesenhaMapa dMapa = new DesenhaMapa();
		Thread tMapa = new Thread(dMapa);
		
		BarraDoProgresso bProg = new BarraDoProgresso();
		Thread tProg = new Thread(bProg);
		
		tMapa.start();
		tProg.start();

	}

}
