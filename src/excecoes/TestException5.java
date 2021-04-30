package excecoes;

import java.io.FileNotFoundException;


public class TestException5 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		TestException4 t1 = new TestException4();
		
		try {
			t1.metodo1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
