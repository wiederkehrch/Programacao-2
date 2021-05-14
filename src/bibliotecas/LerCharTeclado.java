package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerCharTeclado {

	public static void main(String[] args) {
		
		System.out.println("Digite um única tecla: ");
		
		//InputStream: classe que sabe capturar um byte
		//nesse caso, recebendo-o da entrada padrão do system
		
		//System.in por receber a informação do teclado
		
		InputStream is = System.in;
		
		//transformar 0 e 1 em um nível mais elevado
		//recebe um byte e o transforma em char
		//InputStreamReader só sabe ler um caracter por vez
		
		InputStreamReader isr = new InputStreamReader(is);
		
		char c;
		
		try {
			c = (char) isr.read();
			
			System.out.println("Você digitou a tecla: " + c);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
