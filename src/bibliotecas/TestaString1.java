package bibliotecas;

public class TestaString1 {

	public static void main(String[] args) {

		String a = new String ("Java ADS na veia");
		String b = new String ("Java ADS na veia");
		
		if (a == b) {
			System.out.println("a e b s�o iguais");
		} else {
			System.out.println("a e b s�o objetos diferentes");
		}
		
		
		// tipo primitivo, o comportamento � diferente (compara os valores)
		
		int c = 2;
		int d = 2;
		
		if (c == d) {
			System.out.println("c e d s�o iguais");
		} else {
			System.out.println("c e d s�o objetos diferentes");
		}
		
		//para comparar conte�do string
		
		if (a.equals(b)) {
			System.out.println("a e b s�o iguais");
		} else {
			System.out.println("a e b s�o diferentes");
		}

	}

}
