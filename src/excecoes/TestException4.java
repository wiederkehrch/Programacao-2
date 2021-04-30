package excecoes;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestException4 {

	@SuppressWarnings("resource")
	public static void metodo1() throws FileNotFoundException {
			new FileReader("C:\\arquivoDeTeste.txt");		

	}

}